package com.example;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Greeter {

    private static final LocalDateTime MORNING_BEGINS = localTime(6, 0);
    private static final LocalDateTime NIGHT_BEGINS = localTime(22, 0);
    private Clock clock;

    private static LocalDateTime localTime(int hours, int minutes){
        return LocalDateTime.of(LocalDate.now(), LocalTime.of(hours, minutes));
    }

    public Greeter() { //Constructor
        this(Clock.systemDefaultZone());
    }

    public Greeter(Clock clock){ //Constructor
        this.clock = clock;
    }

    Object greet(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("'name' cannot be null or empty");
        }
        String message = name.trim();
        message = message.substring(0, 1).toUpperCase() + message.substring(1);
        return timedGreeting(LocalTime.now()) + message;
    }

    private String timedGreeting(LocalTime hours){
        String greeting;
        if(hours.isBefore(LocalTime.NOON)) {
            greeting = "Good Morning ";
        }else if(LocalDateTime.now(clock).isBefore(NIGHT_BEGINS)) {
            greeting = "Good Evening ";
        }else if(LocalDateTime.now(clock).isBefore(MORNING_BEGINS)) {
            greeting = "Good Night ";
        }else{
            greeting = "Hello ";
        }
        return greeting;
    }
}