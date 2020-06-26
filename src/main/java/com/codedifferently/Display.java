package com.codedifferently;
/*
Display will output the result
*/
public class Display {
    private String result;

    // Display is displayed as a String
    public Display(){
        this.result = "0.0";
    }

    // Operations below
    public String getResult(){
        return this.result;
    }

    public void updateResult(double newResult){
        String result = Double.toString(newResult);
        this.result=result;
    }
    
}