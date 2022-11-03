pipeline {
  agent any
  options {
    buildDiscarder(logRotator(numToKeepStr: '5'))
  }

  stages {
    stage('Build') {
      steps {
        sh 'docker build -t egor/jpipeline:latest .'
      }
    }
    stage('Deploy') {
      steps {
        sh 'docker run -d -p 8081:8081 egor/jpipeline:latest'
      }
    }
  }
    post {
      always {
        sh 'docker logout'
      }
    }

}
