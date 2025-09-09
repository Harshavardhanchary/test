def call(String host, String user) {
    stage("Deploy") {
        sshagent(['hostinger-ssh']) {
            sh """
              scp docker-compose.yml ${user}@${host}:/home/${user}/chattingo/
              ssh ${user}@${host} "cd /home/${user}/chattingo && docker-compose pull && docker-compose up -d"
            """
        }
    }
}

