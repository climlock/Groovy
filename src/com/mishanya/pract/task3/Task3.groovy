package com.mishanya.pract.task3

/**
 * 3.  Реализовать механизм тестирования через BDD:
 given {
 a = 2
 b = 4
 } when {
 result = a + b
 } then {
 result == 6
 }
 */

class Task3 {

    static void main(String[] args) {

        given {
            a = 2
            b = 4
        } when {
            result = a + b
        } then {
            result == 6
        }

    }

    static def given(Closure closure) {
        def valueHolder = [:]
        closure.delegate = valueHolder
        closure.resolveStrategy = Closure.DELEGATE_ONLY
        closure()
        ["when": { Closure whenCloser ->{
            whenCloser.delegate = valueHolder
            whenCloser.resolveStrategy = Closure.DELEGATE_ONLY
            whenCloser()
            ["then": {Closure thenCloser -> {
                thenCloser.delegate = valueHolder
                thenCloser.resolveStrategy = Closure.DELEGATE_ONLY
                assert thenCloser()
            }
            }]
        }
        }]
    }
}
