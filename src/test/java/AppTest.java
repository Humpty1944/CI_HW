import org.example.Calc;
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


    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }


    @Test
    void testCalcOne()
    {
        try {
            Calc calc;
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
            Calc calc;
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
            Calc calc;
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
            Calc calc;
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
