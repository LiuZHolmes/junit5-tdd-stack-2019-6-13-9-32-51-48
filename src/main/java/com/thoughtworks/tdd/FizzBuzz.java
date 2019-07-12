package com.thoughtworks.tdd;

public class FizzBuzz {
    public String say(int student) {
        String multipleOf3 = String.valueOf(student % 3 == 0 ? 1 : 0);
        String multipleOf5 = String.valueOf(student % 5 == 0 ? 1 : 0);
        String multipleOf7 = String.valueOf(student % 7 == 0 ? 1 : 0);

        String flag = multipleOf3 + multipleOf5 + multipleOf7;
        switch (flag) {
            case "101":
                return "FizzWhizz";
            case "110":
                return "FizzBuzz";
            case "100":
                return "Fizz";
            case "010":
                return "Buzz";
            case "001":
                return "Whizz";
            case "000":
                return String.valueOf(student);
            default:
                return String.valueOf(student);
        }
    }
}
