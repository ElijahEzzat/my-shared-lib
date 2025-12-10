def call() {
    node {
        stage('Cleanup') {
            sh 'docker image prune -f'
        }
    }
}
