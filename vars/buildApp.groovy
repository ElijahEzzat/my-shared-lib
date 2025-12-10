def call() {
    node {
        stage('Build') {
            git 'https://github.com/Hassan-Eid-Hassan/java'
            sh 'docker build -t my-java-app:${BUILD_NUMBER} .'
        }
    }
}

