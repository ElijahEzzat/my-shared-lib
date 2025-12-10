def call() {
    stage('Deploy') {
        sh 'docker stop my-java-app || true'
        sh 'docker rm my-java-app || true'
        sh 'docker run -d --name my-java-app -p 8080:8080 my-java-app:${BUILD_NUMBER}'
    }
}
