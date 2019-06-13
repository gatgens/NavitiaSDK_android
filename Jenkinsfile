#!/usr/bin/env groovy
pipeline {
    agent {
        node { label 'Tatie' }
    }
    stages {
        stage('Building...') {
            steps {
                echo 'Building...'
                sh './gradlew assemble'
            }
        }
        stage('Testing') {
            steps {
                echo 'Testing...'
                sh './gradlew testApi'
            }
        }
    }
    post {
        success {
            /* clean up our workspace */
            deleteDir()
            /* clean up tmp directory */
            dir("${workspace}@tmp") {
                deleteDir()
            }
            /* clean up script directory */
            dir("${workspace}@script") {
                deleteDir()
            }
        }
    }
}
