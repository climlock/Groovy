package com.mishanya.closure;

public class test {
    public static void main(String[] args) {
        ClosureRunner closureRunner = new ClosureRunner();

        closureRunner.something();

        int x = 10;
        var i = x != 0 ? x : 1 ;
        System.out.println(i);

    }
}
