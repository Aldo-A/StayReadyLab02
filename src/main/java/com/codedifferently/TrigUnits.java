package com.codedifferently;
/*
Option to switch between two trig units: 
Degrees and Radians
*/
public class TrigUnits {
    private String setMode;
    
    //The default mode will always be set to degrees unless changed to radians
    public TrigUnits(){
        this.setMode = "Degrees";
    }

    // Operations below
    public String getSetMode(){
        return this.setMode;
    }
    public void switchUnitsMode(){
        if(setMode == "Degrees"){
            setMode = "Radians";
        }
        else{
            setMode = "Degrees";
        }
    }
    public void switchUnitsMode(String mode){
        this.setMode = mode;
    }
}