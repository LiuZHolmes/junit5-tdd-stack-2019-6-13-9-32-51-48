package com.thoughtworks.tdd;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

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
}
