/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.practice;
import java.text.NumberFormat;
import java.text.DecimalFormat; 
/**
 *
 * @author pep02
 */
public class House extends Homes {
    
   private int yearBuilt; 
   private double landSize; 
  
 
   
  public House(String address, String city, String state, int zip, int beds, int baths, 
   String agent, String company, int yearBuilt, double landSize) {
        super(address, city, state, zip, beds, baths, agent, company);
      this.yearBuilt = yearBuilt;
      this.landSize = landSize;
      
  }
  
  public int getSize(){
      return landSize;
  }
  
  public int getyearBuilt() {
      return getyearBuilt;
  }
  
  public void setPrice(double ogprice){
      if (yearBuilt >= 2002){
          super.price = ogprice + 30000;   
      }  
      else {
          super.price = ogprice + 2000;
      }  
      }
  

public String toString(){
 NumberFormat format = NumberFormat.getCurrencyInstance();
 DecimalFormat format2 = new DecimalFormat("####.#");
String house = super.getaddress()+"Year Built: " + yearBuilt + "\n"
               + "Land Size: " + format2.format(landSize) + "\n"
               + "Price: " + format.format(price)+"\n";
    return house; 
}
}
