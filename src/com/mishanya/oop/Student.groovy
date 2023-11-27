package com.mishanya.oop

import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@TupleConstructor
class Student {
    String firsName
    String lastName
    Integer age

    def getAt(Integer index) {
        index == 0 ? firsName : lastName
    }
}
