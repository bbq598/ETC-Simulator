package edu.bu.met.cs665;

public class PriceCalculate {
  public PriceCalculate() {
    
  }
  /**
   * use to calculate the total price and distance.
   * @param highway : obj highway
   * @param customer : obj customer
   * @param gateid1 : int gateid1
   * @param gateid2 : int gateid2
   */
  
  public void price(Highway highway, Customer customer, Veichle veichle, int gateid1, int gateid2) {
    int count = 0; 
    int temp;
    
    //reset price to 0 
    int price = 0; 
    
    //reset distance to 0
    int distance = 0; 
    // if gate 2 < gate 2 means customer come from another direction
    if (gateid1 > gateid2) { 
      
      //swipe the gate 2 and gate 1 value
      temp = gateid1;
      gateid1 = gateid2;
      gateid2 = temp;
    }

    //use this loop to calculate the total price 
    for (int i = 0; i < highway.segmentslist.size(); i++) { 
      int totalprice = 0;
      int totaldistance = 0;
      if (highway.segmentslist.get(i).gateid1 >= gateid1
          && highway.segmentslist.get(i).gateid2 <= gateid2) {
        highway.gateSensor(highway.segmentslist.get(i), customer, veichle);
        totalprice = highway.segmentslist.get(i).price;
        totaldistance = highway.segmentslist.get(i).distance;
        count++;
      }
      price = price + totalprice;
      distance = distance + totaldistance;
    }
    // implement the discount siutation
    if (count >= 5) { 
      price *= 0.9;
    }
    //then decide the final price by different car type
    switch (veichle.cartype) { 

      case "Car":
        if (veichle.isHavetrailer()) {
          price *= 2;
        } else {
          price *= 1;
        }
        break;
      case "Van":
        price *= 1.5;
        break;

      case "Taxi":
        price *= 0.5;
        break;
      case "Truck":
        price = 2 * price + veichle.loadweight * price;
        break;
      default:
        System.out.println("There is somthing wrong");

    }
    //upgrade the data to custome
    if (customer.monthlystatement.size() != 0) { 
      price = customer.monthlystatement.get(0) + price;
      customer.monthlystatement.set(0, price);
      distance = customer.monthlystatement.get(1) + distance;
      customer.monthlystatement.set(1, distance);
    } else {
      customer.monthlystatement.add(price);
      customer.monthlystatement.add(distance);
    }

  }

}
