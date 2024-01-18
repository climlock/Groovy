package com.mishanya.missingmethod

import com.mishanya.oop.Student

class MissingMethodRunner {

    static void main(String[] args) {

        def student = new Student(age: 18)
//        groovy.lang.MissingMethodException
//        student.test()
        println student.abc

        def map = ["1" : 11, "2" : 22, "abc" : 34] // linkedHashmap
        println map."1" // map.get(1)
        println map.abc

//        spring-data, StudentRepositiry
        student.findByAge(90)

    }
}
