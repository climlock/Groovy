package com.mishanya.category

import com.mishanya.oop.Student

class CategoryRunner {

    static void main(String[] args) {
        def student = new Student(age: 18, firstName: "Ivan")
        use(DefaultStudentMethods.class) {

            student.testStr()
            student.anotherMethod()
        }
//        student.testStr()

    }
}
