package com.mishanya.oop

class OopRunner {

    static void main(String[] args) {

        def student = new Student()
        student.firsName = "Ivan"
        println student.firsName
        println student['firsName']
        println student.'firsName'
        println student.@firsName       // not recommended

        def student1 = new Student(firsName: 'Petr', lastName: 'Petrov', age: 19)
        println student1

        Student student2 = ['Sveta', 'Svetikova', 30]
        println student2

        def (fn, ln) = student2
        println fn
        println ln

        assert [student1, student2].collect {it.firsName} == ['Petr', "Sveta"]
        assert [student1, student2]*.firsName == ['Petr', "Sveta"]
    }
}
