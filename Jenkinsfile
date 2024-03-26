pipeline{
    agent any
    tools{
        maven 'M3'
    }
    stages{
        stage("Build Maven"){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Falenyoni/devops-integration']])
                bat 'mvn clean install'
            }
        }
        stage("Build Docker Image"){
            steps{
                script {
                        bat "docker build -t falenyoni/devops-integration:latest ."
                    }
            }
        }
        stage('Deploy To DockerHub') {
            steps {
               script {
                    withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials',
                        usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]){
                            //echo "echo This works: $USERNAME $PASSWORD"
                            bat "docker login --username $USERNAME --password $PASSWORD"
                            bat "docker push falenyoni/devops-integration:latest"
                        }
                }
            }

        }
    }
}