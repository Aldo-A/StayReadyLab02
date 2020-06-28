package com.codedifferently;
/*
Option to switch between two trig units: 
Degrees and Radians
*/
public class TrigUnits {
    private String setMode;
    
    //The default mode will always be set to degrees unless changed to radians
    public TrigUnits(){
        this.setMode = "degrees";
    }

    // Operations below
    public String getSetMode(){
        return this.setMode;
    }
    public void switchUnitsMode(){
        if(this.setMode == "degrees"){
            this.setMode = "radians";
        }
        else{
            this.setMode = "degrees";
        }
    }
    public void switchUnitsMode(String mode){
        this.setMode = mode.toLowerCase();
    }
}