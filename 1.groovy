pipeline {
	agent any
	stages {
		 stage("Dev") {
			steps {
				sh "echo step 1"
				sh "echo step 1.1"
			}
		}
		stage("Test") {
			steps {
				sh "echo test 1"
				}
			}
		}
		
	
		stage("Production") {
			steps {
				sh "echo prod 1"
			}
		}
	}
}


