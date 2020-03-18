package daggerok

import spock.lang.Specification

class Tests extends Specification {

    def 'should iterate using step'() {

        given:
        def result = []

        when:
        10.step(20, 2) {
            result.add(it)
        }

        then:
        result == [20, 22, 24, 26, 28]
    }
}
