package edu.bu.met.cs665;

import java.util.ArrayList;

/**
 * This class is use to genurate different highways. 
 * @author bbq59
 *
 */
public class Highway {
  
  //use different to serperate the differnet objects
  
  public String name;
  
  //empty constuctor
  
  public Highway() {

  }

  public Highway(String name) {
    this.setName(name);
  }
  
  //the array list used to store segementlists
  
  ArrayList<Segments> segmentslist = new ArrayList<>();
  
  /**
   * use to add the obj segments to the arraylist.
   * @param segments : the obj segments
   */
  public void regist(Segments segments) {
    this.segmentslist.add(segments);
  }

  /**
   * the getter method.
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * the setter method.
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }
  
  /**
   * the method to store gateid and transpondersid when a car pass a gate.
   * @param customer : obj customer
   * @param veichle : obj veichle
   */
  public void gateSensor(Segments segment, Customer customer, Veichle veichle) {
    ArrayList<Integer> entergate = new ArrayList<>();
    entergate.add(segment.gateid1);
    entergate.add(segment.gateid2);
    entergate.add(veichle.transpondersid);
    customer.gatehistory.add(entergate);
  }


}
