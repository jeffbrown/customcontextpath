package demo

import geb.spock.GebSpec
import grails.test.mixin.integration.Integration

@Integration
class SomeSpec extends GebSpec {


    void "test something"() {
        when:
        go '/abc/demo'

        then:
        $('h1').text() == 'Hello, World!'
    }
}
