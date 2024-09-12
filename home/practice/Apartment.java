/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.practice;

import java.text.NumberFormat;

public class Apartment extends Homes{
    
    private String complex;
    private int floorNum;
    private char petsOK;
    
    public Apartment(String address, String city, String state, int zip, int beds, int baths,
           String agent, String company, String complex, int floorNum, char petsOK ){
        super(address, city, state, zip, beds, baths, agent, company);
        this.complex = complex;
        this.floorNum = floorNum;
        this.petsOK = petsOK;
       
    }
    
    public String getComplex(){
        return complex; 
    }
    
    public int getFloors(){
        return floorNum;
    }
    public char getPets(){
        return petsOK;
    }
    
    public void setPrice(double orgprice){
        if(petsOK == 'Y'){
            super.price = orgprice + 1000;
        }
        else{
            super.price = orgprice;
        }
    }
    
    public String toString(){
        NumberFormat rform = NumberFormat.getCurrencyInstance();
        String apartment = super.getaddress()+"Apartment Complex: " + complex + "\n"
                + "Floor Number: " + floorNum + "\n"
                + "Pets allowed: " + petsOK + "\n"
                + "Rent: " + rform.format(price) + "\n"; 
         return apartment; 
    }
    
    
}
