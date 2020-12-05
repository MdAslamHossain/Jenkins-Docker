pipeline {
    environment {
    imagename = 'dockeraslam43/app'
    registryCredential = 'Docker-Credential'
    dockerImage = ''
    }
    agent any
    tools {
     maven 'Maven 3.6.3'
     nodejs 'NodeJs 12.0.0'  
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building............'
                sh 'npm --version'
                sh 'mvn --version'
                sh 'mvn clean install -DskipTests'
                sh 'docker build -t dockeraslam43/app -f Dockerfile .'
            }
        }
        stage('Building docker image') { 
            steps { 
                script { 
                    dockerImage = docker.build imagename + ":$BUILD_NUMBER" 
                }
            } 
        }
        stage('Deploy docker image') { 
            steps { 
                script { 
                    docker.withRegistry( '', registryCredential ) { 
                        dockerImage.push() 
                    }
                } 
            }
        } 
        stage('Cleaning up docker image') { 
            steps { 
                sh "docker rmi $imagename:$BUILD_NUMBER" 
            }
        } 
    }
}
