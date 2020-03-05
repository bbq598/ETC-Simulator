package edu.bu.met.cs665;

public class Segments {

  public Segments() {
    
  }

  public Segments(int gateid1, int gateid2, int distance, int price) {
    this.setGateid1(gateid1);
    this.setGateid2(gateid2);
    this.setDistance(distance);
    this.setPrice(price);
  }
  
  //int gateid1
  public int gateid1;
  
  //int gateid2
  public int gateid2;
  
  //int distance
  public int distance;
  
  //int price
  public int price;

  /**
   * getter method.
   * @return the gateid1
   */
  public int getGateid1() {
    return gateid1;
  }

  /**
   * setter method.
   * @param gateid1 the gateid1 to set
   */
  public void setGateid1(int gateid1) {
    this.gateid1 = gateid1;
  }

  /**
   * getter method.
   * @return the gateid2
   */
  public int getGateid2() {
    return gateid2;
  }

  /**
   * setter method.
   * @param gateid2 the gateid2 to set
   */
  public void setGateid2(int gateid2) {
    this.gateid2 = gateid2;
  }

  /**
   * getter method.
   * @return the distance
   */
  public int getDistance() {
    return distance;
  }

  /**
   * setter method.
   * @param distance the distance to set
   */
  public void setDistance(int distance) {
    this.distance = distance;
  }

  /**
   * getter method.
   * @return the price
   */
  public int getPrice() {
    return price;
  }

  /**
   * setter method.
   * @param price the price to set
   */
  public void setPrice(int price) {
    this.price = price;
  }



}
