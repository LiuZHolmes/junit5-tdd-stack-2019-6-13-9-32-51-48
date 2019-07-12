package com.thoughtworks.tdd;

public class FizzBuzz {
    public String say(int student) {
        if (student % 3 == 0)
            return "Fizz";
        else if (student == 5)
            return "Buzz";
        else if (student == 7)
            return "Whizz";
        return String.valueOf(student);
    }
}
