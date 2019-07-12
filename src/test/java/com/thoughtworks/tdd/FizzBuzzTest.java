package com.thoughtworks.tdd;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_student_is_1() {
        // given
        int student = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        // when
        String result = fizzBuzz.say(student);
        // then
        assertThat(result, CoreMatchers.is("1"));
    }

    @Test
    public void should_return_2_when_student_is_2() {
        // given
        int student = 2;
        FizzBuzz fizzBuzz = new FizzBuzz();
        // when
        String result = fizzBuzz.say(student);
        // then
        assertThat(result, CoreMatchers.is("2"));
    }

    @Test
    public void should_return_fizz_when_student_is_3() {
        // given
        int student = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        // when
        String result = fizzBuzz.say(student);
        // then
        assertThat(result, CoreMatchers.is("Fizz"));
    }

    @Test
    public void should_return_buzz_when_student_is_5() {
        // given
        int student = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        // when
        String result = fizzBuzz.say(student);
        // then
        assertThat(result, CoreMatchers.is("Buzz"));
    }

    @Test
    public void should_return_whizz_when_student_is_7() {
        // given
        int student = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();
        // when
        String result = fizzBuzz.say(student);
        // then
        assertEquals("Whizz", result);
    }

    @Test
    public void should_return_fizz_when_student_is_6() {
        // given
        int student = 6;
        FizzBuzz fizzBuzz = new FizzBuzz();
        // when
        String result = fizzBuzz.say(student);
        // then
        assertEquals("Fizz", result);
    }

    @Test
    public void should_return_buzz_when_student_is_10() {
        // given
        int student = 10;
        FizzBuzz fizzBuzz = new FizzBuzz();
        // when
        String result = fizzBuzz.say(student);
        // then
        assertEquals("Buzz", result);
    }

    @Test
    public void should_return_fizz_buzz_when_student_is_15() {
        // given
        int student = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        // when
        String result = fizzBuzz.say(student);
        // then
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void should_return_fizz_whizz_when_student_is_21() {
        // given
        int student = 21;
        FizzBuzz fizzBuzz = new FizzBuzz();
        // when
        String result = fizzBuzz.say(student);
        // then
        assertEquals("FizzWhizz", result);
    }
}
