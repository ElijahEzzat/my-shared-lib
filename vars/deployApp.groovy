def call(containerName, imageName, imageTag, port) {
    echo "Stopping any existing container..."
    sh "docker stop ${containerName} || true"
    sh "docker rm ${containerName} || true"

    echo "Cleaning Docker networks..."
    sh "docker network prune -f || true"

    echo "Running Docker container on port ${port}..."
    sh "docker run -d --name ${containerName} -p ${port}:8080 ${imageName}:${imageTag}"
}
