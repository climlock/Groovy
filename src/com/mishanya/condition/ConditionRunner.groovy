package com.mishanya.condition

class ConditionRunner {

    /**
     * boolean           is true
     * Collection/Map    is not empty
     * Matcher           has natch
     * String/GString    not empty
     * Number/Char       != 0
     * reference         != null
     *
     * asBoolean
     */

    static void main(String[] args) {


        int x = 10
        boolean booleanResult = x > 0
        if (booleanResult) {
            println x
        }

        def person = new Person(9)
        if (person) {
            println person.getId()
        }

//        if (person != null) {
//            person.getId()
//        }
        person?.getId()

//        def result = x != null ? x : 1
        def result = x ?: 1  // is not null
        println result

    }
}
