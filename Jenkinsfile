pipeline {
    environment {
    imagename = 'dockeraslam43/app'
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
                echo 'Building............'
                sh 'npm --version'
                sh 'mvn --version'
                sh 'mvn clean install -DskipTests'
            }
        }
        node {
            checkout scm
            def customImage = docker.build("imagename:${env.BUILD_ID}")
            customImage.push()
            customImage.push('latest')
    }
    }
}
