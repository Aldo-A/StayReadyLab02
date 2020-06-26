package com.codedifferently;
import org.junit.Assert;
import org.junit.Test;

public class DisplayTest {
    @Test
    public void resultTest(){
        //Given
        String result = "0.0";

        //When

        Display testDisplay = new Display();
        String actualResult = testDisplay.getResult();

        //Then
        
        Assert.assertEquals(result, actualResult);
    }
    @Test
    public void updateResultTest(){
        //Given
        String result = "2.0";
        //When
        Display testDisplay = new Display();
        testDisplay.updateResult(2.0);
        String actualResult = testDisplay.getResult();
        //Then
        Assert.assertEquals(result, actualResult);
    }
}