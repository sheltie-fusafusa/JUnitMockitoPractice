package org.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ExampleServiceTest {

    @Test
    public void plusTest(){

        // プラスメソッドが正しく動くことを確認
        ExampleService exampleService = new ExampleService();
        int result = exampleService.plus(1, 2);

        assertEquals(result, 1 + 2);
    }

    @Test
    public void plusSquareTest(){

        // モック準備
        ExampleService exampleServiceMock = mock(ExampleService.class);
        when(exampleServiceMock.plus(anyInt(), anyInt())).thenReturn(10);


        int result = exampleServiceMock.plus(1,1);

        assertEquals(10, result);
    }
}
