package com.mishanya.category

import com.mishanya.oop.Student

@Category(Student.class)
class DefaultStudentMethods {

    def testStr(){
        println "$age, $firstName"
    }

    static def anotherMethod(Student self, String value) {
        println "$self, args: $value"
    }
}
