pipeline {
    agent

    stages {
        stage('pull') {
            steps
             git branch: 'main', credentialsId: 'Akshay_github', url: 'https://github.com/akshay741112/jenkins_test'
             {
                echo 'Hello World'
            }
        }
    stage ('build')
        steps {
            echo "build 'buildd a new'"
        } 

    }
    stage ('test')
            steps {
                 echo "test done"
    }
}

