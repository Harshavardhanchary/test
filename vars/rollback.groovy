def call(String host, String user) {
    stage("Rollback") {
        sshagent(['hostinger-ssh']) {
            sh """
              ssh ${user}@${host} "cd /home/${user}/chattingo && git checkout HEAD~1 && docker-compose up -d"
            """
        }
    }
}

