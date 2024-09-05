/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Random;
import java.util.Scanner;


public class Calculator {


  private static int integer1;
  private static int integer2;
  private static int max = 30;
  private static int min = 0;
  private static Random ran1 = new Random(); 
  private static Random ran2 = new Random(); 
  private static int total; 
  private static String symbol;
  
   public static void main(String[] args) {
        Scanner result = new Scanner(System.in);
   
        integer1 = ran1.nextInt(max)+min;
        integer2 = ran2.nextInt(max)+min;
        System.out.println("Enter an operation to perform");
        symbol = result.nextLine();
        switch (symbol){
            case "+":
            System.out.println("First number is: "+integer1+"\n");
            System.out.println("Second number is: "+integer2+"\n");
            total = integer1 + integer2;
            System.out.println("Sum is: "+total);
            break;
            
            case "-":
            System.out.println("First number is: "+integer1+"\n");
            System.out.println("Second number is: "+integer2+"\n");
            total = integer2-integer1;
            System.out.println("Difference is: "+total);
            break;
                
            case "*":
            System.out.println("First number is: "+integer1+"\n");
            System.out.println("Second number is: "+integer2+"\n");
            total = integer1*integer2;
            System.out.println("Product is: "+total);
            break;
            
            case "/":
            System.out.println("First number is: "+integer1+"\n");
            System.out.println("Second number is: "+integer2+"\n");
            try {
                total = integer2/integer1;
            } catch (ArithmeticException e){
                if(integer1==0){
                System.out.println("Divide by 0 error");
                }
                
            }
            
            System.out.println("Product is: "+total);
            break;
            
            default:
            System.out.println("Invalid operation. Please try again.");
            break;
                
        }
        
        
        
        
    }
    
}
