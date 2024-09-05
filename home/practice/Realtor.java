/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.practice;

/**
 *
 * @author pep02
 */
public class Realtor {
    
    private String agent;
    private String company;
   
  public Realtor(String agent, String company){
        this.agent = agent;
        this.company = company;
    }
  
  public String getAgent(String agent){
      return agent;
  }
  
  public String getCompany(String company){
      return company; 
  }
  
  public String toString(){
      String r = "Agent: " + agent + "\n"
              + "Company: " + company + "\n";
      return r;
  }

}
