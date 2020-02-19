package com.actuatorExample.ActuatorExample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class SampleControllerTest {

    @InjectMocks
    SampleController sampleController;

    @Mock
    SampleService sampleService;


    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getDisplay() {

        String data = "Hello";
        Mockito.when(sampleService.getData()).thenReturn(data);
        String result = sampleController.getDisplay();
        Assertions.assertEquals(data, result);
    }


    @Test
    void getHello() {
        String data = "ABCDEF";
        String result = sampleController.getHello();
        Assertions.assertEquals(data,result);
    }
}