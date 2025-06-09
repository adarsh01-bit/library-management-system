package com.librarymanagement.util;

public class ConsolePrinter {

    public static void printHeader(String title) {
        System.out.println("\n==== " + title.toUpperCase() + " ====");
    }

    public static void printLine() {
        System.out.println("-----------------------------");
    }
}