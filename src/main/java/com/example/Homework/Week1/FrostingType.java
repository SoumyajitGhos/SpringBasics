package com.example.Homework.Week1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

public class FrostingType {

    @Component
    @ConditionalOnProperty(name = "frosting.type", havingValue = "CHOCOLATE")
    public static class ChocolateFroasting implements Frosting {
        @Override
        public String getFrostingType() {
            return "Chocolate Flavour Frosting";
        }
    }

    @Component
    @ConditionalOnProperty(name = "frosting.type", havingValue = "STRAWBERRY")
    public static class StrawberryFroasting implements Frosting {
        @Override
        public String getFrostingType() {
            return "Strawberry Flavour Frosting";
        }
    }
}
