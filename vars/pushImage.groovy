def call(String image, String tag) {
    stage("Push Image - ${image}") {
        withCredentials([usernamePassword(credentialsId: 'docker-hub-creds',
            usernameVariable: 'DOCKER_USER',
            passwordVariable: 'DOCKER_PASS')]) {
            sh """
              echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin
              docker tag ${image}:${tag} $DOCKER_USER/${image}:${tag}
              docker push $DOCKER_USER/${image}:${tag}
            """
        }
    }
}

