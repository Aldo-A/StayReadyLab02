package com.codedifferently;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void calcTest(){
        //Given 
        Display testDisplay = new Display();
        String displayResult = testDisplay.getResult();
        //When
        Calculator testCalc = new Calculator();
        String calcDisplay = testCalc.getDisplayResult();
        //Then
        Assert.assertEquals(displayResult, calcDisplay);
    }
    @Test
    public void updateDisplayTest(){
        //Given
        String result = "5.0";
        //When
        Calculator calc = new Calculator();
        calc.updateDisplay(5.0);
        String actualResult = calc.getDisplayResult();
        //Then
        Assert.assertEquals(result, actualResult);
    }

    @Test
    public void calcAddTest(){
        //Given
        String testResult = "5.0";
        //When
        Calculator testCalc = new Calculator();
        testCalc.add(3.0, 2.0);
        String actualResult = testCalc.getDisplayResult();
        //Then
        Assert.assertEquals(testResult, actualResult);
    }
    @Test
    public void calcSubtractTest(){
        //Given
        String testResult = "1.0";
        //When
        Calculator testCalc = new Calculator();
        testCalc.subtract(3.0, 2.0);
        String actualResult = testCalc.getDisplayResult();
        //Then
        Assert.assertEquals(testResult, actualResult);
    }
    @Test
    public void calcMultiplyTest(){
        //Given
        String testResult = "6.0";
        //When
        Calculator testCalc = new Calculator();
        testCalc.multiply(3.0, 2.0);
        String actualResult = testCalc.getDisplayResult();
        //Then
        Assert.assertEquals(testResult, actualResult);
    }
    @Test
    public void calcDivideTest(){
        //Given
        String testResult = "0.5";
        //When
        Calculator testCalc = new Calculator();
        testCalc.divide(2.0, 4.0);
        String actualResult = testCalc.getDisplayResult();
        //Then
        Assert.assertEquals(testResult, actualResult);
    }
    @Test
    public void calcSquareTest(){
        //Given
        String testResult = "4.0";
        //When
        Calculator testCalc = new Calculator();
        testCalc.square(2.0);
        String actualResult = testCalc.getDisplayResult();
        //Then
        Assert.assertEquals(testResult, actualResult);
    }
    @Test
    public void calcExponentTest(){
        //Given
        String testResult = "8.0";
        //When
        Calculator testCalc = new Calculator();
        testCalc.exponent(2.0,3.0);
        String actualResult = testCalc.getDisplayResult();
        //Then
        Assert.assertEquals(testResult, actualResult);
    }
    @Test
    public void calcSquareRootTest(){
        //Given
        String testResult = "12.0";
        //When
        Calculator testCalc = new Calculator();
        testCalc.squareRoot(144.0);
        String actualResult = testCalc.getDisplayResult();
        //Then
        Assert.assertEquals(testResult, actualResult);
    }
    @Test
    public void calcInverseTest(){
        //Given
        String testResult = "0.5";
        //When
        Calculator testCalc = new Calculator();
        testCalc.inverse(2.0);
        String actualResult = testCalc.getDisplayResult();
        //Then
        Assert.assertEquals(testResult, actualResult);
    }
    @Test
    public void calcInvertTest(){
        //Given
        String testResult = "2.0";
        //When
        Calculator testCalc = new Calculator();
        testCalc.invert(-2.0);
        String actualResult = testCalc.getDisplayResult();
        //Then
        Assert.assertEquals(testResult, actualResult);
    }

    @Test
    public void randomNumTest(){
        //Given
        boolean check = true;
        //When
        Calculator testC = new Calculator();
        testC.generateRandNum(11, 100);
        String result = testC.getDisplayResult();
        double actual = Double.parseDouble(result);
        //Then
        if(actual > 11.0 && actual < 100.0)
            Assert.assertEquals(check,true);
        else{
            Assert.assertEquals(check,false);
        }
    }

}