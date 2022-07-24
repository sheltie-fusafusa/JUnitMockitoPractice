package org.example.service;

import jdk.jfr.internal.test.WhiteBox;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class StaticExampleServiceTest {

    @Test
    public void staticPlusTest(){

        try(MockedStatic<StaticExampleService> mocked = mockStatic(StaticExampleService.class)){
            // モックのセットアップ
            mocked.when(() -> StaticExampleService.plus(anyInt(), anyInt())).thenReturn(3);

            int result = StaticExampleService.plus(10, 20);

            // plusメソッドはMock化されており、どのような値でも3で返却するように設定されている
            assertEquals(3, result);
        }
    }

    @Test
    public void staticPlusSquareTest(){

        try(MockedStatic<StaticExampleService> mocked = mockStatic(StaticExampleService.class)){
            // モックのセットアップ
            mocked.when(() -> StaticExampleService.plus(anyInt(), anyInt())).thenReturn(3);

            int result = StaticExampleService.plusSquare(2,2);

            // plusメソッドはMock化されており、3が返却されるので9になるはず
            assertEquals(9, result);

        }
    }
}
