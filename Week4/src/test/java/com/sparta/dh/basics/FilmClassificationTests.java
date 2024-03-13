package com.sparta.dh.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FilmClassificationTests {
    @Test
    @DisplayName("Check that 1 is equal to 1")
    void demoTest() {
        Assertions.assertEquals(1,1);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 10, 11})
    @DisplayName("Returns PG movies")
    void checkAgeReturnFilmRatingUPG(int age){
        Assertions.assertEquals("U & PG films are available.", FilmClassification.getClassificationsByAge(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 13, 14})
    @DisplayName("Returns PG, 12 movies")
    void checkAgeReturnFilmRating12(int age){
        Assertions.assertEquals("U, PG & 12 films are available.", FilmClassification.getClassificationsByAge(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 16, 17})
    @DisplayName("Returns PG and 12 movies")
    void checkAgeReturnFilmRating15(int age){
        Assertions.assertEquals("U, PG, 12 & 15 films are available.", FilmClassification.getClassificationsByAge(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 19, 20})
    @DisplayName("Returns PG and 12 movies")
    void checkAgeReturnFilmRating18(int age){
        Assertions.assertEquals("All films are available.", FilmClassification.getClassificationsByAge(age));
    }
}
