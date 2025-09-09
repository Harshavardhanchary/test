def call(String repoUrl, String branch = 'main') {
    stage('Git Clone') {
        checkout([$class: 'GitSCM',
            branches: [[name: branch]],
            userRemoteConfigs: [[url: repoUrl]]
        ])
    }
}

