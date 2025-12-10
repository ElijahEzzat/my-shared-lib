def call(imageName, imageTag, dockerUser, dockerPass) {
    echo "Logging in to Docker Hub..."
    sh "echo ${dockerPass} | docker login -u ${dockerUser} --password-stdin"

    echo "Pushing Docker image to Docker Hub..."
    sh "docker push ${imageName}:${imageTag}"
}
