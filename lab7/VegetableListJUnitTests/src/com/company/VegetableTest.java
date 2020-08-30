package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VegetableTest {

    @Test
    void caloricity() {
        assertThrows(IllegalCaloricityException.class, () -> new Cucumber(-9, 100, "Cucumber"));
    }

    @Test
    void weight() {
        assertThrows(IllegalArgumentException.class, () -> new Cucumber(120, 0, "Cucumber"));

    }
}