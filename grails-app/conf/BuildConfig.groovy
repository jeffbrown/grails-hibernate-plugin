grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolution = {

    inherits "global"

    log "warn"

    repositories {
        grailsCentral()
    }

    dependencies {
        compile('org.hibernate:hibernate-core:3.6.1.Final') {
            excludes 'slf4j-api', 'commons-collections'
        }
        compile('org.hibernate:hibernate-validator:4.1.0.Final') {
            excludes 'slf4j-api', 'commons-collections'
        }

        runtime 'javassist:javassist:3.11.0.GA'
        runtime 'antlr:antlr:2.7.6'
        runtime('dom4j:dom4j:1.6.1') {
            excludes 'xml-apis'
        }
        runtime('org.hibernate:hibernate-ehcache:3.6.1.Final') {
            excludes 'ehcache', 'hibernate-core','slf4j-api', 'commons-collections'
        }
    }

    plugins {
        build(":release:1.0.0.M3") {
            export = false
        }

        build(":svn:1.0.0.M1") {
            export = false
        }
    }
}
