/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.khaqng.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author pc
 */
public class MathUtilityDDTTest {
    
    //ta tách bộ dât kiểm thử ra khỏi các câu lệnh so sánh
    //kĩ thuật này gọi là DDT - Data Driven Testing
    //kiểm thử hàm, app tách riêng bộ data ra 1 chỗ để dễ kiểm
    //soát sự thiếu đủ của các test case, các test data
    //data test ta để riêng 1 chỗ, thường là mảng, hay file excel
    //hoặc table
    
    //0! -> 1
    //1! -> 1
    //2! -> 2
    //3! -> 6
    
    //thấy mùi của mảng 2 chiều
    
    public static Object[] initData(){
        //int [] a = {phần tử của mảng 1 chiều cách nhau 1 dấu phẩy 5,10, 15}
    
        Object [][] testData ={{0 ,1},
                                {1, 1},
                                {2, 2},
                                {4,24},
                                {5,120}
        };
        return testData;
    }
    
    
    @ParameterizedTest //tham số hóa, biến hàm từ trên lấy xuống
    @MethodSource("initData")
    public  void verifyFactorialGivenRightArgumentReturnsOk(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
