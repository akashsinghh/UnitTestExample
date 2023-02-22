//package com.lcwd.tes.service;
//
//import com.lcwd.tes.services.CalculatorService;
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculatorServiceTest {
//    int counter=0;
//
//    @BeforeClass
//    public static void init(){
//        System.out.println("Before all test case");
//        System.out.println("Start test:"+ new Date());
//    }
//    @Before
//    public void beforeEach(){
//        System.out.println("Before each test case:");
//        counter=0;
//    }
//   @Test
//    public void addTwoNumberTest() {
//        for (int i = 0; i <20;i++ ) {
//             counter+=i;
//}       //Thread.sleep(3000);
//       int result= CalculatorService.addTwoNumber(12,45);
//       int expected=57;
//        System.out.println("Counter int first test : "+counter);
//        Assert.assertEquals(expected,result);
//    }
//
//    @Test
//    public void sumAnyNumberTest(){
//        for (int i = 1;i < 100; i++) {
//            counter += i;
//}
//        int result = CalculatorService.sumAnyNumber(4,5,5,5);
//        int expected = 19;
//        System.out.println("Counter int second test : "+counter);
//        Assert.assertEquals(expected, result);
//    }
//    @AfterClass
//    public static void cleanup(){
//        System.out.println("AFter all test case");
//        System.out.println("End test:"+ new Date());
//    }
//}
