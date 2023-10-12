/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.khaqng.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pc
 */
public class MathUtilityTest {

//TEST CASE 1 TEMPLATE/ STRUCTURE:
    //ID | DESC | STEPS/PROCEDURES | EXPECTED VALUE | STATUS (PASSED/FAILED)
    
    
    //TEST CASE #1: Verify the getfactorial() function with n = 0
    //STEPS/ PROCEDURES:
    //      1. Given: n = 0
    //      2. Call/ invoke getFactorial getFactorial(n = 0)
    //EXPECTED RESULT: The method getFactorial( n = 0) must return 1 as the results of 0! == 1
    //STATUS: PASED/FAILED  đoán xem khi chạy app/ hàm/method
@Test //dính dáng đến thuật ngữ famework
public void verifyFactorialGivenRightArgument0ReturnOk(){
    assertEquals(1, MathUtility.getFactorial(0));
}
        //TEST CASE #2: Verify the getfactorial() function with n = 1
    //STEPS/ PROCEDURES:
    //      1. Given: n = 1
    //      2. Call/ invoke getFactorial getFactorial(n = 1)
    //EXPECTED RESULT: The method getFactorial( n = 1) must return 1 as the results of 1! == 1
    //STATUS: PASED/FAILED  đoán xem khi chạy app/ hàm/method
@Test //dính dáng đến thuật ngữ famework
public void verifyFactorialGivenRightArgument1ReturnOk(){
    assertEquals(1, MathUtility.getFactorial(1));
}
    //TEST CASE #3: Verify the getfactorial() function with n = 6
    //STEPS/ PROCEDURES:
    //      1. Given: n = 6
    //      2. Call/ invoke getFactorial getFactorial(n = 6)
    //EXPECTED RESULT: The method getFactorial( n = 6) must return 1 as the results of 6! == 720
    //STATUS: PASED/FAILED  đoán xem khi chạy app/ hàm/method
@Test //dính dáng đến thuật ngữ famework
public void verifyFactorialGivenRightArgument6ReturnOk(){
    assertEquals(720, MathUtility.getFactorial(6));
}
}
