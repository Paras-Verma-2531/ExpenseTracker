pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from version control
                git 'https://github.com/Paras-Verma-2531/ExpenseTracker.git'
            }
        }
        stage('Compile') {
            steps {
                // Compile the Java code
                sh './mvnw.cmd compile'
            }
        }
        stage('Unit Test') {
            steps {
                // Run unit tests
                sh './mvnw.cmd test'
            }
            post {
                // Archive the test results
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Build') {
            steps {
                // Clean and package the project
                sh './mvnw.cmd clean package'
            }
        }
    }
}
