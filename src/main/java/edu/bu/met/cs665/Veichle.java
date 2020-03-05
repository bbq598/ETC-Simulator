
package edu.bu.met.cs665;


/**
 * the veichle class to genurate the car object with differnet car type.
 * @author xiaoqing
 *
 */

public class Veichle {

  public String name;
  public String cartype;
  public int transpondersid;
  public boolean havetrailer = false;
  public int loadweight = 0;

  public Veichle() {
    
  }
  

  public Veichle(String name, String cartype) {
    this.setName(name);
    this.setCartype(cartype);
  }

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
   * getter method. 
   * @return the cartype
   */
  public String getCartype() {
    return cartype;
  }

  /**
   * setter method.
   * @param cartype the cartype to set
   */
  public void setCartype(String cartype) {
    this.cartype = cartype;
  }

  /**
   * getter method.
   * @return the transpondersid
   */
  public int getTranspondersid() {
    return transpondersid;
  }

  /**
   * setter method.
   * @param transpondersid the transpondersid to set
   */
  public void setTranspondersid(int transpondersid) {
    this.transpondersid = transpondersid;
  }

  /**
   * boolean method return the boolean value.
   * @return
   */
  public boolean isHavetrailer() {
    return havetrailer;
  }

  /**
   * seteter method.
   * @param havetrailer the havetrailer to set
   */
  public void setHavetrailer(boolean havetrailer) {
    
    //if car type not car does not let the object set the value
    if (cartype.equals("Car")) { 
      this.havetrailer = havetrailer;
    } else {
      System.out.println("Wrong car type");
    }
  }

  /**
   * getter method.
   * @return the loadweight
   */
  public int getLoadweight() {
    return loadweight;
  }

  /**
   *setter method.
   * @param loadweight the loadweight to set
   */
  public void setLoadweight(int loadweight) {
    
    //if the car type is not truck does not let it change the value 
    if (cartype.equals("Truck")) { 
      this.loadweight = loadweight; 
    } else {
      System.out.println("Wrong car type");
    }
  }



}
