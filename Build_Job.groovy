pipeline {
	agent any
	stages {
		 stage("Dev") {
			steps {
				build job: 'job_Dev'			
			}
		}
		stage("Test") {
			steps {
				build job: 'job_Test'
				timeout(time: 1, unit: 'MINUTES') {
					input message: 'Waiting for approval?'
				}
			}
		}	
		stage("Production") {
			steps {
				build job: 'job_Prod'
			}
		}
	}
}


