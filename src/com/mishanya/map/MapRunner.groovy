package com.mishanya.map

class MapRunner {

    static void main(String[] args) {
//        def map = [:] - Создать пустой ассоциативный массив
//        def map = ["one": 1, "two": 2]
        def map = [one: 1, two: 2]
        assert map.getClass() == LinkedHashMap;

//        read
        assert map.get("one") == 1
        assert map["one"] == 1
        assert map."one" == 1
        assert map.one == 1
        assert map.get("qwe", 12) == 12         // Get or default

//        write
        map.one = 111
        map.three = 3

//        new method
        assert map.subMap("one", "two") == [one: 111, two: 2]

//        new operator
        def newMap = [q: 22, rt: 99, *:map]
        println newMap



    }
}
