package transportApp;

//if you want to cherry pick
import java.util.Random;
//if you want to import everything
// import java.util.*;

public class KoiFish extends Fish {
  private int stripeCount;

  public KoiFish(String color, double weight) {
    super("Koi", color, weight); //calls constructor of parent class

    /*
      the following are unneeded because parent constructor is being used
        this.type = "Koi";
        this.color = color;
        this.weight = weight;
    */

    //Random not really 'random', but to us it'll be randomly sequenced
    //.nextInt will grab a random number between 0 and input, default is big number
    this.stripeCount = new Random().nextInt(3);
  }

  //methods can still be created and be unique from parent class
  public void bePretty() {
    System.out.println("The " + this.color + " Koi fish shimmers in the warm sunlight...");
  }
  
  @Override
  public String toString() {
    //instead of typing everything, can call parent class method and add to it
    String rtnStr = super.toString();
    rtnStr += "\nNumber of Stripes: " + stripeCount;
    return rtnStr;
  }
}
