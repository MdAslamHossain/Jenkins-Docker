pipeline {
    agent any
    tools {
     maven 'Maven 3.6.3'
     nodejs 'NodeJs 12.0.0'  
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building.....FrontEnd'
                sh 'npm --version'
            }
        }
        stage('Build') {
            steps {
                echo 'Building.....Backend'
                sh 'mvn --version'
            }
        }
    }
}
