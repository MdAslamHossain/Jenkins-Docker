pipeline {
    agent any

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
