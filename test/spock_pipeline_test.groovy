
import com.homeaway.devtools.jenkins.testing.JenkinsPipelineSpecification

public class JenkinsfileWithPropertySpec extends JenkinsPipelineSpecification {

    Script base

    def setup() {
        base = loadPipelineScriptForTest("vars/base.groovy")
    }

    def "base test"() {
        given:
        def result = null

        when:
        result = base.call()
        then:
        result == "hansi"
    }
}