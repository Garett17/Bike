package com.company;

public class BikeDriver {

  public static void main(String[] args) {

    RoadBike bike1 = new RoadBike();
    RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);
    MountainBike bike3 = new MountainBike();
    // Bike bike4 = new Bike();

    //Bike bike4 = new Bike();
    //Bike bike5 = new Bike();
    MountainBike bike6 = new MountainBike();

    System.out.println(bike1.toString());
    System.out.println(bike2.toString());
    System.out.println(bike3.toString());

    Bike myBikes[] = {bike1, bike2, bike3};
    for (Bike b : myBikes) {
      System.out.println(b.toString());
      // virtual method invocation
    }

    // bike1.printDescription();
    // bike2.printDescription();
    // bike3.printDescription();
    // bike4.printDescription();
  } // end method main
} // end class BikeDriver
