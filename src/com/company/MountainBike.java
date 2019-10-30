package com.company;

public class MountainBike extends Bike {

  private String suspension, type;
  private int frameSize;

  public MountainBike() {
    this("Bull Horn", "Hardtail", "Maxxis", "dropper", 27, "RockShox XC32", "Pro", 19);
  } // end constructor

  public MountainBike(
      String handleBars,
      String frame,
      String tyres,
      String seatType,
      int numGears,
      String suspension,
      String type,
      int frameSize) {
    super(handleBars, frame, tyres, seatType, numGears);
    this.suspension = suspension;
    this.type = type;
    this.frameSize = frameSize;
  } // end constructor

  public String toString() {
    return super.toString()
        + "This mountain bike is a "
        + this.type
        + " bike and has a "
        + this.suspension
        + " suspension and a frame size \n"
        + "\t\tof "
        + this.frameSize
        + "inches.";
  }

  public void printDescription() {
    super.printDescription();
    System.out.println(
        "This mountain bike is a "
            + this.type
            + " bike and has a "
            + this.suspension
            + " suspension and a frame size \n"
            + "\t\tof "
            + this.frameSize
            + "inches.");
  } // end method printDescription
} // end class MountainBike
