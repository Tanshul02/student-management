pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Student Management source code checked out'
            }
        }

        stage('Compile') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }

    post {

        success {
            echo 'Student Management CI Pipeline completed successfully!'
        }

        failure {
            echo 'Student Management CI Pipeline failed!'
        }
    }
}
              
