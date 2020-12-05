pipeline {
    environment {
    imagename = 'dockeraslam43/pipeline-app'
    registryCredential = 'Docker-Hub'
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
                echo 'Building............'
                sh 'npm --version'
                sh 'mvn --version'
                sh 'mvn clean install -DskipTests'
            }
        }
        stage('Building docker image') { 
            steps { 
                script { 
                    dockerImage = docker.build imagename + ':$BUILD_NUMBER'
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
