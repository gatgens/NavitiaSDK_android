#!/usr/bin/env groovy
pipeline {
    agent {
        node { label 'Tatie' }
    }
    stages {
        stage('Building...') {
            steps {
                echo 'Building...'
                sh './gradlew clean assemble'
            }
        }
        //TODO: To reactivate once the unit tests have been fixed.
        /*stage('Testing') {
            steps {
                echo 'Testing...'
                sh './gradlew clean test'
            }
        }*/
    }
    post {
        always {
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
