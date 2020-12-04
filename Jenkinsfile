pipeline {
    agent any
    tools {
     maven 'Maven 3.6.3'
     nodejs 'NodeJs 12.0.0'  
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..........'
                sh 'npm --version'
                sh 'mvn --version'
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing.....'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying.....'
            }
        }
    }
}
