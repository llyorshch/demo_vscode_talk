package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DemoApplicationServiceTest {

    @Test
    public void doSomething_withNoParams_returnsDefaultString() {
        //Given
        DemoApplicationService demoApplicationService = new DemoApplicationService();

        //When
        String something = demoApplicationService.doSomething();

        //Then
        assertEquals(something, "Something.");
    }
    
}