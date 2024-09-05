/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.practice;
import java.util.Scanner;

public class HomePractice {

    
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       String type;
       House home1 = new House("75 N Lee St.", "Flint", "MI", 48501, 3, 2, "Janice Sherman", "eXp Realty", 1911, 3784.3);
       House home2 = new House("483 Ravenwood Rd", "Birmingham", "MI", 35005, 5, 3, "Scott Williams", "Century 21", 2009, 3456.8);
       Apartment apt1 = new Apartment("12 McFarland Blvd", "Auburn Hills", "MI", 48309, 2, 1,
             "Frank Goodrich", "Redfin", "Bridge Creek Apartments", 2, 'N');
       Apartment apt2 = new Apartment("563 Cross St.", "Birmingham", "MI", 35005, 4, 2,
               "Taylor Daniels", "Keller Williams Reality", "Willows Edge Apartments", 3, 'Y');
       Condo condo1 = new Condo("5259 Marion Dr", "Grand Rapids", "MI", 49501, 3, 2, "Melinda Randalls", "Re/Max", 500.0, 2);
       Condo condo2 = new Condo("642 Lyons Rd", "Traverse City", "MI", 49684, 2, 1, "Gale Weathers", "Century 21", 350.0, 1);
       home1.setPrice(180000.0);
       home2.setPrice(515000.0);
       apt1.setPrice(940.0);
       apt2.setPrice(1350.0);
       condo1.setPrice(325000.0);
       condo2.setPrice(198400.0);
       

       System.out.println("Enter in the type of home you'd like to view: House, condo or apartment. To view all lisitngs, type in 'all': ");
       type = scn.nextLine();
       switch (type){
           case "house":
           System.out.println("Showing all house listings: \n");
           System.out.println(home1.toString());
           System.out.println(home2.toString());
           break;
            
           case "apartment":
           System.out.println("Showing all apartment listings: \n");
           System.out.println(apt1.toString());
           System.out.println(apt2.toString());
           break;
           
           case "condo":
           System.out.println("Showing all condo listings: \n");
           System.out.println(condo1.toString());
           System.out.println(condo2.toString());
           break;
           
           case "all": 
           System.out.println("Showing all listings: \n");
           System.out.println(home1.toString());
           System.out.println(home2.toString());
           System.out.println(apt1.toString());
           System.out.println(apt2.toString());
           System.out.println(condo1.toString());
           System.out.println(condo2.toString());
           break;
           
           default:
           System.out.println("Invalid home type. Please try again.");
           break; 
       }
       
           
     
    }
    
}
