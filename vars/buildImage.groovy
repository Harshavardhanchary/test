def call(String service, String tag) {
    stage("Image Build - ${service}") {
        sh "docker build -t ${service}:${tag} ${service}/"
    }
}

