package com.company;
// abstract
public abstract class Bike implements BikeParts {

  @Override
  public String getHandleBars() {
    return null;
  }

  @Override
  public int getSeatTypes() {
    return 0;
  }

  @Override
  public int getTyers() {
    return 0;
  }

  private String handleBars, frame, tyres, seatType;
  private int NumGears;
  private final String make;

  public Bike() {
    this.make = "Oracle Cycles";
  } // end constructor

  public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
    this.handleBars = handleBars;
    this.frame = frame;
    this.tyres = tyres;
    this.seatType = seatType;
    if (numGears < 1) {
      NumGears = 1;
    }
    NumGears = numGears;
    this.make = "Oracle Cycles";
  } // end constructor

  public String toString() {
    return this.make
        + "This bike has "
        + this.handleBars
        + " handlebars on a "
        + this.frame
        + " frame with "
        + this.NumGears
        + " gears."
        + "\nIt has a "
        + this.seatType
        + " seat with "
        + this.tyres
        + " tyres.";
  }

  protected void printDescription() {
    System.out.println(
        "\n"
            + this.make
            + "\n"
            + "This bike has "
            + this.handleBars
            + " handlebars on a "
            + this.frame
            + " frame with "
            + this.NumGears
            + " gears."
            + "\nIt has a "
            + this.seatType
            + " seat with "
            + this.tyres
            + " tyres.");
  } // end method printDescription
} // end class Bike
