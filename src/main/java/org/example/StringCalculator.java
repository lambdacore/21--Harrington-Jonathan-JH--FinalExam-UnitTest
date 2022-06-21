package org.example;

public class StringCalculator {
    private String string;
    public void setString(String s) {
        string = s;
    }
    public String getString () {
        return string;
    }

    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                returnValue += Integer.parseInt(number.trim());
            }
        }
        return returnValue;
    }
}