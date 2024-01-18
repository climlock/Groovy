package com.mishanya.pract.task1

import com.mishanya.oop.Student

class Task1 {

    static void main(String[] args) {

        Class.metaClass.make {Object[] values ->
            delegate.metaClass.invokeConstructor(values)
        }

//        new HashSet<>([1, 2, 3, 4, 4])

        def hasSet = HashSet.make([1, 2, 3, 4, 4])
        def student = Student.make("Ivan", "Ivanov", 20)
        def student2 = Student.make()


    }
}
