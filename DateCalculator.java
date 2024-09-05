/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datecalculator;
import java.util.Scanner;
/**
 *
 * @author pep02
 */
public class DateCalculator {

    static Scanner years = new Scanner(System.in);
    static String date = "July 30";
    static int currentyear = 2024;
    static int difference;
    static int resultyear;
    
    public static void main(String[] args) {
        System.out.println("Enter a number to see what date it was ___ years ago.");
        difference = years.nextInt();
        resultyear = currentyear - difference;
        System.out.println("The date "+difference+" year(s) ago was "+date+", "+resultyear+".");
        
        
    }
    
}
