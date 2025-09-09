def call(String path) {
    stage("Filesystem Scan") {
        sh "trivy fs --exit-code 0 --no-progress ${path}"
    }
}

