package com.example.Homework.Week1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

public class SyrupType {

    @Component
    @ConditionalOnProperty(name = "syrup.type", havingValue = "CHOCOLATE")
    public static class ChocolateSyrup implements Syrup {
        @Override
        public String getSyrupType() {
            return "Chocolate Flavour Syrup";
        }
    }

    @Component
    @ConditionalOnProperty(name = "syrup.type", havingValue = "STRAWBERRY")
    public static class StrawberrySyrup implements Syrup {
        @Override
        public String getSyrupType() {
            return "Strawberry Flavour Syrup";
        }
    }
}
