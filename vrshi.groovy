pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
               git branch: 'main', url: 'https://github.com/akshay741112/jenkins_repo.git'
                echo 'pull'
            }
        }
        stage('build') {
            steps {
                echo 'build done'
            }
        }
        stage('quality-test') {
            steps {
                echo 'quality-test'
            }
        }
        stage('test') {
            steps {
                echo 'test done'
            }
        }
        stage('deploy') {
            steps {
                echo 'deploy done'
            }
        }
    }
}
