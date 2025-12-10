def call() {
    stage('Cleanup') {
        sh 'docker image prune -f'
    }
}
