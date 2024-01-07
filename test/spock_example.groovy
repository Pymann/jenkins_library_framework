import spock.lang.Specification

import com.homeaway.devtools.jenkins.testing.JenkinsPipelineSpecification

class MyTest extends Specification {
    def "test something"() {
        given:
        def value = 2

        when:
        def result = value * 2

        then:
        result == 4
    }
}