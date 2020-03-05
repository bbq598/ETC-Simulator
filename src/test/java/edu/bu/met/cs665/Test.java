package edu.bu.met.cs665;

import java.util.Random;

public class Test {

  /**
   * this is the simulate for the project
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    //instance the etc center and the price calculate
    Etccenter etc = Etccenter.getInstance();
    PriceCalculate price = new PriceCalculate();
    
    //use for loop to genural 20 customer
    //assume every customer have 4 cars
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
    
    //use for loop to genural 10 highways
    //each high way have 10 segments, with all unique gate id 
    int gateid1 = 0;
    for (int i = 0; i < 10; i++) {
      Highway highway = new Highway("highway" + i);
      for (int j = 0; j < 10; j++) {
        Random r = new Random();
        int num = r.nextInt(10) + 1;
        Segments segments = new Segments(gateid1, gateid1 + 1, num, num * 2);
        highway.regist(segments);
        gateid1++;
      }
      etc.registhighway(highway);
    }
    
    //assume one custome use etc 1-2 times a day. 
    //use for loop to genural 9 months 
    for (int j = 0; j < 9; j++) {
      
      //use for loop to genurate 20 customers 
      for (int i = 0; i < 20; i++) {
        
        //use for loop to genurate 30 days 
        for (int k = 0; k < 30; k++) {
          
          //use randome to get the param value 
          Random r = new Random();
          int highway = r.nextInt(10);
          int car = r.nextInt(4);
          int gate1 = r.nextInt(10);
          int gate2 = r.nextInt(10);
          while (gate1 == gate2) {
            gate2 = r.nextInt(10);
            if (gate1 != gate2)
              break;
          }
          price.price(etc.highway.get(highway), etc.customer.get(i),
              etc.customer.get(i).carlist.get(car),
              etc.highway.get(highway).segmentslist.get(gate1).gateid1,
              etc.highway.get(highway).segmentslist.get(gate2).gateid1);
          
          //make random assume customer may be need use highway another time
          int time = r.nextInt(2);
          if (time == 1) {
            int highway2 = r.nextInt(10);
            int car2 = r.nextInt(4);
            int gate12 = r.nextInt(10);
            int gate22 = r.nextInt(10);
            while (gate1 == gate2) {
              gate2 = r.nextInt(10);
              if (gate1 != gate2)
                break;
            }
            price.price(etc.highway.get(highway2), etc.customer.get(i),
                etc.customer.get(i).carlist.get(car2),
                etc.highway.get(highway2).segmentslist.get(gate12).gateid1,
                etc.highway.get(highway2).segmentslist.get(gate22).gateid1);
          }

        }
      }
      //etc calling update eveymonth
      etc.update();
    }
  }

}
