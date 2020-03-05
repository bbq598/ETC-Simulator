package edu.bu.met.cs665;

import java.util.ArrayList;

public class Etccenter {

  private static Etccenter uniqueInstance;

  private Etccenter() {
    
  }
  
  //this method used to make sure this class have only one instance
  public static synchronized Etccenter getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Etccenter();
    }
    return uniqueInstance;
  }
  
  //assign transpondersid start with 1000
  public int transpondersid = 1000;
  
  //this one use to store the customer object
  ArrayList<Customer> customer = new ArrayList<>();
  
  //this use to store highway object
  ArrayList<Highway> highway = new ArrayList<>();
  
  /**
   * registe highway.
   * @param highway : obj highway
   */
  
  public void registhighway(Highway highway) {
    this.highway.add(highway);

  }
  
  /**
   * registe car to the center and customer.
   * @param veichle : obj veichle
   * @param customer : obj customer
   */
  
  
  public void registCar(Veichle veichle, Customer customer) {
    veichle.setTranspondersid(transpondersid);
    transpondersid++;
    customer.carlist.add(veichle);

  }
  
  /**
   * registe customer to the center.
   * @param customer : obj customer
   */
  
  public void registCustomer(Customer customer) {
    this.customer.add(customer);

  }
  
  /**
   * use to send update to all the customer.
   * 
   */
  
  public void update() {
    
    //use loop to call every customer's update method
    for (int i = 0; i < customer.size(); i++) {
      customer.get(i).update();
    }


  }

}
