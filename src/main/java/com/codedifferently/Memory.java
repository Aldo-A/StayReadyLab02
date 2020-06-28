package com.codedifferently;
/*
Memory will hold the decimal value provided by the user
*/
public class Memory {
   private double memVal;

   // Made to hold decimals only
    public Memory(){
     this.memVal = 0.0;
    }

    // Operations below
    public double getMemVal(){
        return this.memVal;
    }
    public void addToMem(double num){
        this.memVal += num;
    }
    public void resetMem(){
        this.memVal = 0.0;
    }


}