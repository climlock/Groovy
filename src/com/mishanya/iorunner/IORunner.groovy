package com.mishanya.iorunner

class IORunner {

    static void main(String[] args) {

        def file = new File(".gitignore")
        print file.text
        file.each {line -> print line}
        file.withInputStream {
            def allText = new String(it.readAllBytes())
            println allText
        }

        try (def reader = file.newReader()){
            //todo
        }

        //Write
        def file2 = new File("text.txt")
        file2.text = "some text"
        file2 << "New Line" << System.lineSeparator()
    }
}
