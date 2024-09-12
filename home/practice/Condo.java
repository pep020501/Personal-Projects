/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.practice;
import java.text.NumberFormat;

/**
 *
 * @author pep02
 */
public class Condo extends Homes {
    
 private double fee;
 private int maxPets;
 
 public Condo (String address, String city, String state, int zip, int beds, int baths, 
   String agent, String company, double fee, int maxPets){
     super(address, city, state, zip, beds, baths, agent, company);
    this.fee = fee;
    this.maxPets = maxPets;
     
 }
 
 public double getFee(){
     return fee;
 }
 
 public int getMaxPets(){
     return maxPets; 
 }
 
 public void setPrice (double orgprice){
    
     super.price = orgprice;
 }
 
 public String toString(){
     NumberFormat feeform = NumberFormat.getCurrencyInstance();
     String c = super.getaddress() +"Association Fee: " + feeform.format(fee) + "\n"
             + "Number of maximum pets allowed: " + maxPets + "\n"
             +"Price: " + feeform.format(price)+ "\n";    
     return c; 
 }
    
}
