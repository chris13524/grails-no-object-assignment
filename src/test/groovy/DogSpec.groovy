import grails.test.mixin.Mock
import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
@Mock([Dog])
class DogSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
	Dog dog = new Dog(name:"sparky")
        dog.name = "sparky"
        expect:"fix me"
            (dog.name as String) == "sparky"
    }
}
