package com.mishanya.closer2

import com.mishanya.oop.Student

class Closer2Runner {

    static void main(String[] args) {

        Closure closure = {
            firstName = "Sveta"
        }

        println closure.thisObject
        println closure.owner
        println closure.delegate // owner

        def student = new Student("Ivan", "Ivanov", 18)
        println student

        closure.delegate = student
        closure()
        println student
    }
}
