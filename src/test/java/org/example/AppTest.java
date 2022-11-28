package org.example;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    Calc calc;
    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }


    @Test
    void testCalcOne()
    {
        try {
            calc = new Calc("2 + 2");
            int res = calc.calc();
            Assertions.assertEquals(4,res);
        }catch (Exception e){

        }

    }

    @Test
    void testCalcTwo()
    {
        try {
            calc = new Calc("2 * 2");
            int res = calc.calc();
            Assertions.assertEquals(4,res);
        }catch (Exception e){

        }

    }

    @Test
    void testCalcThree()
    {
        try {
            calc = new Calc("2 / 2");
            int res = calc.calc();
            Assertions.assertEquals(1,res);
        }catch (Exception e){

        }

    }

    @Test
    void testCalcTFour()
    {
        try {
            calc = new Calc("2 % 2");
            int res = calc.calc();
            Assertions.assertEquals(0,res);
        }catch (Exception e){

        }

    }

    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }
}
