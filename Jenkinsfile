
node {

     stage('Clone repository') {
         checkout scm
     }

     stage('build project') {
        sh './gradlew clean'
        sh './gradlew build'
     }

     stage('Build image') {
         app = docker.build("${params.ECR_URL}/${params.ECR_NAME}:${env.BUILD_NUMBER}")
     }

     stage('Push image') {
         sh 'rm -f ~/.dockercfg ~/.docker/config.json || true'
         docker.withRegistry("https://${params.ECR_URL}", "ecr:ap-northeast-2:${params.CREDENTIAL}") {
             app.push("${env.BUILD_NUMBER}")
             app.push("latest")
     }
  }
}