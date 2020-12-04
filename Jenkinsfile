pipeline {
    environment {
    registry = 'dockeraslam43/docker-jenkins'
    registryCredential = 'Docker-Credential'
    dockerImage = ''
    }
    agent {
    dockerfile true
    }
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
                sh 'mvn clean install -DskipTests'
            }
        }
        stage('Building docker image..........') {
          steps{
            script {
              dockerImage = docker.build registry + ":$BUILD_NUMBER"
            }
          }
        }
        stage('Deploying docker image.........') {
          steps{
            script {
              docker.withRegistry( '', registryCredential ) {
                dockerImage.push()
              }
            }
          }
    }
    }
}
