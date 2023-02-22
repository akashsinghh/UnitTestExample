package com.lcwd.tes.service;

import com.lcwd.tes.services.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTestunit5 {
    @BeforeAll
    public static void init(){
        System.out.println("This is single time logic");
    }
    @Test
    public void addTwonumberTest(){
        System.out.println("This is the first case");
        int actualResult= CalculatorService.addTwoNumber(12,12);
        int expectedResult=24;
        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void addAnynumberTest(){
        System.out.println("This is the second case");
        int result=CalculatorService.sumAnyNumber(1,2,3,4);
        int expectedResult=10;
        Assertions.assertEquals(expectedResult, result);

    }
}
