pipeline {
    agent any

    tools {
        maven 'MAVEN_HOME' // Match this with Jenkins global tool name
    }

    stages {
        stage('Welcome Stage') {
            steps {
                echo "🎉 Welcome to Pipeline!"
            }
        }

        stage('Maven Build') {
            steps {
                bat '"%MAVEN_HOME%\\bin\\mvn.cmd" clean install'
            }
        }

        stage('Run Tests') {
            steps {
                bat '"%MAVEN_HOME%\\bin\\mvn.cmd" test'
            }
        }

        stage('Publish Test Results') {
            steps {
                junit 'target/surefire-reports/*.xml'
            }
        }

        stage('Build Success') {
            steps {
                echo "✅ Build Completed!"
            }
        }
    }

    post {
        failure {
            echo "❌ Build Failed!"
        }
        always {
            echo "📦 Pipeline Finished."
        }
    }
}
