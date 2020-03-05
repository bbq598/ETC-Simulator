package edu.bu.met.cs665;

import java.util.ArrayList;

public class Customer {

  public Customer() {
    
  }

  public Customer(String name) {
    this.setName(name);

  }
  
  //string name to seperate different customer
  public String name;

  //this arraylist to store the car object 
  ArrayList<Veichle> carlist = new ArrayList<>();
  
  //this array list to store monthestatement
  ArrayList<Integer> monthlystatement = new ArrayList<>();
  
  //this array list to store the bill history
  ArrayList<ArrayList<Integer>> billhistory = new ArrayList<>();
  
  //this array list to store the gate history
  ArrayList<ArrayList<Integer>> gatehistory = new ArrayList<>();

  /**
   * getter method.
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * setter method.
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }
  
  /**
   * This method use to receive update from etc center then print the statement. 
   * 
   * 
   */
  
  public void update() {
    System.out.println(name + " here is your monthly statement for this month:\n"
        + "The bill for this moth are: " + monthlystatement.get(0) + " dollars.\n"
        + "Your drive miles for this month are: " + monthlystatement.get(1) + " miles.");
    billhistory.add(monthlystatement);
    //    ArrayList<Integer> monthlystatement = new ArrayList<>();
  }


}
