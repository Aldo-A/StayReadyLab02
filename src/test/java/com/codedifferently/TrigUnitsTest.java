package com.codedifferently;
import org.junit.Assert;
import org.junit.Test;

public class TrigUnitsTest {
    @Test
    public void trigTest(){
        //Given
        String setMode = "Degrees";
        //When
        TrigUnits units = new TrigUnits(); 
        String actualMode = units.getSetMode();
        //Then
        Assert.assertEquals(setMode, actualMode);
    }
    @Test
    public void switchUnitsTest(){
        //Given
        String setMode = "Radians";
        //When
        TrigUnits units = new TrigUnits(); 
        units.switchUnitsMode();
        String actualMode = units.getSetMode();
        //Then
        Assert.assertEquals(setMode,actualMode);
    }
    @Test
    public void switchUnitsStringTest(){
        //Given
        String setMode = "Radians";
        //When
        TrigUnits units = new TrigUnits(); 
        units.switchUnitsMode("Radians");
        String actualMode = units.getSetMode();
        //Then
        Assert.assertEquals(setMode,actualMode);
    }
}