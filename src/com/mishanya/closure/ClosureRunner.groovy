package com.mishanya.closure

import java.util.function.Function
import java.util.stream.Stream

class ClosureRunner {
    static void main(String[] args) {

        Function<Integer, Integer> func = value -> value + value

        def result = func.apply(5)
//        println result

//        Closure closure = { value ->
//            println value
//            value + value }
//          Более удобный аналог
        Closure closure = {
            println it
            it + it }

//        def call = closure.call(5)
//        println call
//
        Stream.of(1,2,3,4)
//            .map(value -> value+value)
//            .map(func)
            .map(closure)
//            .map (String::valueOf)
            .map (String.&valueOf)
            .forEach (System.out::println)

        int x = 10
        check(x > 0)  {
            println x
        }

    }

    def something() {
        println "hello from Groovy"
    }

    static def check(boolean condition, Closure closure) {
        if (condition) {
            closure();
        }
    }
}
