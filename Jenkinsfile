pipeline {
  agent {
    label 'linux'
  }
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
        sh 'docker run -p 8081:8081 egor/jpipeline:latest'
      }
    }
  }

}
