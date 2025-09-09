def call(String backendTag, String frontendTag) {
    stage("Update Compose") {
        sh """
        sed -i 's|image: .*/backend:.*|image: myuser/backend:${backendTag}|' docker-compose.yml
        sed -i 's|image: .*/frontend:.*|image: myuser/frontend:${frontendTag}|' docker-compose.yml
        """
    }
}

