package com.librarymanagement.util;

public class InputValidator {

    public static boolean isValidString(String input) {
        return input != null && !input.trim().isEmpty();
    }

    public static boolean isValidId(int id) {
        return id > 0;
    }

    public static boolean isValidYear(int year) {
        return year > 1000 && year <= java.time.Year.now().getValue();
    }
}