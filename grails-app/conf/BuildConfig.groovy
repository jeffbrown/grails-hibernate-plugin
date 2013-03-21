grails.project.work.dir = 'target'
grails.project.source.level = 1.6
grails.project.plugins.dir = "target/plugins"

grails.project.dependency.resolution = {

    inherits "global"
    log "warn"

    repositories {
        grailsCentral()
    }

    dependencies {

        String datastoreVersion = '2.0.0.BUILD-SNAPSHOT'

        compile "org.grails:grails-datastore-core:$datastoreVersion"
        compile "org.grails:grails-datastore-gorm:$datastoreVersion"
        compile "org.grails:grails-datastore-gorm-hibernate:$datastoreVersion"
        compile "org.grails:grails-datastore-simple:$datastoreVersion", {
            export = false
        }

        compile 'javax.transaction:jta:1.1'

        compile('org.hibernate:hibernate-core:3.6.10.Final') {
            excludes 'ant', 'antlr', 'cglib', 'commons-collections', 'commons-logging',
                     'commons-logging-api', 'dom4j', 'h2', 'hibernate-commons-annotations',
                     'hibernate-jpa-2.0-api', 'hibernate-validator', 'javassist', 'jaxb-api',
                     'jaxb-impl', 'jboss-jacc-api_JDK4', 'jcl-over-slf4j', 'jta', 'junit',
                     'slf4j-api', 'slf4j-log4j12', 'validation-api'
        }

        compile('org.hibernate:hibernate-entitymanager:3.6.10.Final') {
            excludes 'cglib', 'commons-logging', 'commons-logging-api', 'hibernate-core', 'hibernate-jpa-2.0-api',
                     'hibernate-jpamodelgen', 'hibernate-testing', 'hibernate-validator', 'javassist',
                     'jcl-over-slf4j', 'junit', 'shrinkwrap-api', 'shrinkwrap-impl-base', 'slf4j-api',
                     'slf4j-log4j12', 'validation-api'
        }

        compile('org.hibernate:hibernate-commons-annotations:3.2.0.Final') {
            excludes 'commons-logging', 'commons-logging-api', 'jcl-over-slf4j', 'junit',
                     'slf4j-api', 'slf4j-log4j12'
        }

        compile('org.hibernate:hibernate-validator:4.1.0.Final') {
            excludes 'easymock', 'h2', 'hibernate-entitymanager', 'hibernate-jpa-2.0-api', 'jaxb-api',
                     'jaxb-impl', 'slf4j-api', 'slf4j-log4j12', 'testng', 'validation-api'
        }

        compile 'org.springframework:spring-orm:3.2.0.RELEASE'

        runtime 'org.javassist:javassist:3.16.1-GA'

        runtime 'antlr:antlr:2.7.7'

        runtime 'cglib:cglib:2.2.2'

        runtime('dom4j:dom4j:1.6.1') {
            excludes 'jaxen', 'jaxme-api', 'junitperf', 'pull-parser', 'relaxngDatatype',
                     'stax-api', 'stax-ri', 'xalan', 'xercesImpl', 'xpp3', 'xsdlib'
        }

        runtime('org.hibernate:hibernate-ehcache:3.6.10.Final') {
            excludes 'cglib', 'commons-logging', 'commons-logging-api', 'ehcache-core',
                     'hibernate-core', 'hibernate-testing', 'hsqldb', 'javassist',
                     'jcl-over-slf4j', 'junit', 'slf4j-api', 'slf4j-log4j12'
        }

        runtime 'net.sf.ehcache:ehcache-core:2.4.6', {
            excludes 'bsh', 'btm', 'commons-logging', 'derby', 'dom4j', 'hamcrest-core', 'hamcrest-library',
                     'hibernate', 'hibernate-core', 'hibernate-ehcache', 'javassist', 'jta', 'junit-dep',
                     'mockito-core', 'servlet-api', 'slf4j-api', 'slf4j-jdk14', 'xsom'
        }

        test 'org.spockframework:spock-grails-support:0.7-groovy-2.0', {
            export = false
        }
        test "org.grails:grails-async:$grailsVersion", {
            export = false
        }
    }

    plugins {
        build(':release:2.2.1', ':rest-client-builder:1.0.3') {
            export = false
        }

        test ':spock:0.7', {
            exclude 'spock-grails-support'
            export = false
        }
    }
}
