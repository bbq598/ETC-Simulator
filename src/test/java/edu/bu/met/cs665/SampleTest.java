package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SampleTest {

  public SampleTest() {}

  /**
   * test the output of the project.
   * 
   */
  @Test
  public void Testname() {

    Veichle car = new Veichle("car", "Car");
    assertEquals("car", car.name);
  }

  /**
   * test the output of the project.
   * 
   */
  @Test
  public void TestTrue() {

    Veichle car = new Veichle("car", "Truck");
    car.setLoadweight(30);;
    assertTrue(car.getLoadweight() == 30);
  }
  
  /**
   * test the output of the project.
   * 
   */
  @Test
  public void TestSize() {
    
    Etccenter etc = Etccenter.getInstance();
    
    //see if genurate enough customer
    for (int i = 0; i < 20; i++) {
      Veichle veichle = new Veichle("Car" + i, "Car");
      Veichle veichle2 = new Veichle("Taxi" + i, "Taxi");
      Veichle veichle3 = new Veichle("Van" + i, "Van");
      Veichle veichle4 = new Veichle("Truck" + i, "Truck");
      Customer customer = new Customer("customer" + i);
      etc.registCustomer(customer);
      etc.registCar(veichle, customer);
      etc.registCar(veichle2, customer);
      etc.registCar(veichle3, customer);
      etc.registCar(veichle4, customer);
    }
    assertTrue(etc.customer.size() ==20);
    
    
  }

  
  
}
