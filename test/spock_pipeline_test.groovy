
import com.homeaway.devtools.jenkins.testing.JenkinsPipelineSpecification

public class JenkinsfileWithPropertySpec extends JenkinsPipelineSpecification {




    def "base test"() {
        given:
        String result = null
        Script base = loadPipelineScriptForTest("vars/base.groovy")s

        when:
        result = base.call()

        then:
        result == "hansi"
    }
}