def call(imageName, imageTag) {
    echo "Building Docker image..."
    sh "docker build -t ${imageName}:${imageTag} ."
}
