package com.codedifferently;

import java.util.Scanner;


public class ScientificCalculatorDemo {
    static String menuOptions[] = {"1)add", "2)subract", "3)multiply", "4)divide"
        , "5)square root", "6)square", "7)exponent", "8)inverse", "9)invert"
        , "10)generate a random number", "11)sine", "12)cosine", "13)tangent"
        , "14)sine inverse", "15)cosine inverse", "16) tangent inverse", "17)factorial"
        , "18)absolute value", "19)switch trig units", "20)switch display mode"
        , "21)add to memory", "22)clear memory", "23)clear screen"};
    public static void main(String[] args) {
        int userChoice = 0;
        Scanner scan = new Scanner(System.in);
        SciCalculator calculator = new SciCalculator();

        System.out.println("Enter value for calculator: ");
        double input = scan.nextDouble();
        calculator.updateDisplay(input);
        System.out.printf("Current value: %s\n",calculator.getDisplayResult());

        printMenu();
        userChoice = scan.nextInt();

        while(userChoice < 1 || userChoice > 23){
            System.out.print("Enter a valid option\n Enter option: ");
            userChoice = scan.nextInt();
        }

        while(userChoice >=1 && userChoice <= 23){
            String currentMode = calculator.getDisplayMode();
            double currentValue= Double.parseDouble(calculator.getDisplayResult());
            double result=0.0;
            
            if(userChoice==1){
                System.out.println("Enter value to add");
                double num = scan.nextDouble();
                result=currentValue+num;
    
            }
            else if(userChoice==2){
    
            }
            else if(userChoice==3){
                
            }
            else if(userChoice==4){
                
            }
            else if(userChoice==5){
                
            }
            else if(userChoice==6){
             
            }
            else if(userChoice==7){
    
            }
            else if(userChoice==8){
    
            }
            else if(userChoice==9){
                
            }
            else if(userChoice==10){
                
            }
            else if(userChoice==11){
                
            }
            else if(userChoice==12){
             
            }
            else if(userChoice==13){
    
            }
            else if(userChoice==14){
                
            }
            else if(userChoice==15){
                
            }
            else if(userChoice==16){
                
            }
            else if(userChoice==17){
             
            }
            else if(userChoice==18){
    
            }
            else if(userChoice==19){
    
            }
            else if(userChoice==20){
                
            }
            else if(userChoice==21){
                
            }
            else if(userChoice==22){
                
            }
            else if(userChoice==23){
             
            }
            modeCheck(result, currentMode,calculator);
            System.out.printf("%s\n",calculator.getDisplayResult());
            printMenu();
            userChoice = scan.nextInt();
        }


        
    }
    static void printMenu(){
        
    }

    static void modeCheck(double result, String currentMode, SciCalculator calculator){
        if(currentMode.equalsIgnoreCase("decimal")){
            calculator.updateDisplay(result);
        }
        else if(currentMode.equalsIgnoreCase("binary")){
            Long doubleConverted=Double.doubleToRawLongBits(result);
            String binaryConversion=Long.toBinaryString(doubleConverted);
            calculator.updateDisplay(binaryConversion);

        }
        else if(currentMode.equalsIgnoreCase("octal")){
            int convertedDouble = (int)(result);
            String output= Integer.toOctalString(convertedDouble);
            calculator.updateDisplay(output);
        }
        else if(currentMode.equalsIgnoreCase("hexidecimal")){
            String output= Double.toHexString(result);
            calculator.updateDisplay(output);

        }
    }
    
}