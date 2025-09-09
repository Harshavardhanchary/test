def call(String image) {
    stage("Image Scan - ${image}") {
        sh "trivy image --exit-code 0 --no-progress ${image}"
    }
}

