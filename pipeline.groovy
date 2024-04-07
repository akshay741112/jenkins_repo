pipeline {
    stages {
        stage('pull') {
            steps {
               git branch: 'main', credentialsId: 'Akshay_github', url: 'https://github.com/akshay741112/jenkins_test'
                echo 'pull done'
            }
        }
        stage('build') {
            steps {
                echo 'build done'
            }
        }
        stage('test') {
            steps {
                echo 'test done'
            }
        }
            stage('deploy test') {
            steps {
                echo 'quality test done'
            }
        }
    }
}
