def call() {
    stage("Automated Testing") {
        dir("backend") {
            sh "mvn test"
        }
        dir("frontend") {
            sh "npm install && npm test -- --watchAll=false"
        }
    }
}

