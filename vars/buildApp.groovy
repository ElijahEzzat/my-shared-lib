def call() {
    echo "Building Java project with Maven..."
    sh 'mvn clean package'
}
