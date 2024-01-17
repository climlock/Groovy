package com.mishanya.costomMetaClass

import com.mishanya.oop.Student
import org.codehaus.groovy.runtime.DefaultGroovyMethods

import java.lang.reflect.Method

class MetaClassRunner {

    static void main(String[] args) {

        def customMetaClass = new CustomMetaClass()

        def method = DefaultGroovyMethods.class.getMethod("println", Object.class, Object.class)

        customMetaClass.methods.put("println", method)

        def student = new Student()
        def printlnMethod = customMetaClass.methods.get("println")
        printlnMethod.invoke(student, student, "Test2")

//        MetaClassImpl
        println student.metaClass
//        println student.metaClass.methods

//        ExpandoMetaClass
        student.metaClass.abc = "Test property"
        student.metaClass.test = {
            println "It`s new method"
        }
        student.test()
        println student.metaClass


    }
}
