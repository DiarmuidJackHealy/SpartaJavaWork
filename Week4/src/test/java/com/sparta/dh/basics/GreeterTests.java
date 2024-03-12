package com.sparta.dh.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class GreeterTests {

    @Test
    @DisplayName("Check that 1 is equal to 1")
    void demoTest() {
        Assertions.assertEquals(1,1);
    }

    @Test
    @DisplayName("when time is 21, return good evening")
    void checkThat21ReturnsGoodEvening() {
        int time = 21;
        String expected = "Good evening!";
        String actual = Greeter.getGreeting(time);
        Assertions.assertEquals(expected, actual);
        //Assertions.assertEquals("Good evening!", Greeter.getGreeting(21));
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 18})
    @DisplayName("when using 12 and 18, return good afternoon")
    void check12And18ReturnsGoodAfternoon(int time) {
        Assertions.assertEquals("Good Afternoon!", Greeter.getGreeting(time));
    }

    @ParameterizedTest
    @DisplayName("check that the correct greeting is returned")
    @CsvSource({
            "Good evening!, 2",
            "Good morning!, 8",
            "Good afternoon!, 15",
            "Good evening!, 21"
    })
    void checkThatCorrectGreetingIsReturned(String greeting, int time) {
        Assertions.assertEquals(greeting, Greeter.getGreeting(time));
    }
}
