# Jenkins-Docker
## If you use docker container for jenkins then make sure the system's docker accessibility otherwise use jenkins.war
## Using freestyle project
1. download jenkins.war   https://www.jenkins.io/download/
2. go to war directory
3. run 'java -jar jenkins.war'
4. 'sudo systemctl restart docker'
5. to access your system's docker run 'sudo chmod 666 /var/run/docker.sock'
6. add plugin according to tutorial

 
Tutorial : https://www.youtube.com/watch?v=mszE-OCI2V4


## pipeline
docker pull jenkins/jenkins:jdk11
docker run --name my-jenkins -p 8080:8080 jenkins/jenkins:jdk11
http://localhost:8080/configureTools/ and https://stackoverflow.com/questions/26906972/cannot-run-program-mvn-error-2-no-such-file-or-directory
Carefully add brance main or master ?
A POM must needed in parallal to git repository url like https://github.com/MdAslamHossain/Kubernates or outside POM and declare main class
Tutorial : https://www.youtube.com/watch?v=mszE-OCI2V4
