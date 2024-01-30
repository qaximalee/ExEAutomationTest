pipeline {
	agent any

	environment {
		mavenHome = tool 'jenkins-maven'
	}

	stages {

		stage('Build'){
			steps {
				sh "mvn clean test"
			}
		}
	}
}