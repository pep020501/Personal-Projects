/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.practice;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Homes {
    
  private String address;   
  private String city;
  private String state;
  private int zip;
  private int beds; 
  private int baths; 
  private Realtor r;
 public double price;

  
 public Homes(String address, String city, String state, int zip, int beds, int baths, String agent, String company){
     this.address = address;
     this.city = city;
     this.state = state;
     this.zip = zip; 
     this.beds = beds; 
     this.baths = baths;
     r = new Realtor(agent, company);
     
 }
 
 public int getBeds(int beds){
     return beds; 
 }
 
 public int getBaths(int baths){
     return baths;
 }
 
 public String getaddress(){
     String a = "Address: " +address + "\n"+ "City: "+ city + "\n"
             +"State: " + state + "\n" + "Zip: " + zip + "\n"
             + r.toString();
     return a;
 }
 

}
