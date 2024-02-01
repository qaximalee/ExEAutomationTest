pipeline {
	agent any

	environment {
		mavenHome = tool 'jenkins-maven'
	}

	stages {

		stage('Cleaning'){
			steps {
				sh "mvn clean"
			}
		}

		stage('Running Test'){
        	steps {
        	    sh "mvn test"
            }
        }

        stage('Installing Build'){
            steps {
                sh "mvn install"
            }
        }
	}
}