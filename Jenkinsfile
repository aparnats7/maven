pipeline {
    agent any

    tools {
        maven 'MAVEN_HOME' // ✅ matches XML config
    }

    stages {
        stage('Build') {
            steps {
                bat '"%MAVEN_HOME%\\bin\\mvn.cmd" clean install'
            }
        }

        stage('Test') {
            steps {
                bat '"%MAVEN_HOME%\\bin\\mvn.cmd" test'
            }
        }

        stage('Publish Test Results') {
            steps {
                junit 'target/surefire-reports/*.xml'
            }
        }

        stage('Finish') {
            steps {
                echo "✅ Build Completed Successfully"
            }
        }
    }

    post {
        failure {
            echo "❌ Build failed!"
        }
    }
}
