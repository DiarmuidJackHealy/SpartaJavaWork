package com.sparta.dh.uml;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonTests {

    @Test
    @DisplayName("Person first name")
    public void getPersonFirstName_Test() {
        Person p1 = new Person("DJ", "Healy");
        String name = "DJ";
        String res = p1.getFirstName();
        Assertions.assertEquals(name, res);
    }

    @Test
    @DisplayName("Person second name")
    public void getPersonSecondName_Test() {
        Person p1 = new Person("DJ", "Healy");
        String name = "Healy";
        String res = p1.getSecondName();
        Assertions.assertEquals(name, res);
    }
}
