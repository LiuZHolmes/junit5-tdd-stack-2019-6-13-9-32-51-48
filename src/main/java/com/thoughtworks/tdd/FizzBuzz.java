package com.thoughtworks.tdd;

public class FizzBuzz {
    public String say(int student) {
        if (student == 3)
            return "Fizz";
        else if (student == 5)
            return "Buzz";
        return String.valueOf(student);
    }
}
