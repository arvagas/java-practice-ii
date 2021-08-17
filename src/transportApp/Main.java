package transportApp;

public class Main {
  public static void main(String[] args) {
    // Horse myHorse = new Horse("Chester");
    // myHorse.eat(15);
    // myHorse.addFuel(5);
    // myHorse.move();
    // System.out.println(myHorse);
    // System.out.println(myHorse.getPath());
    // System.out.println(myHorse.getFuelLevel());

    /*
      Parent > Child
      Parent class can pass off to multiple child classes
      Child class can only inherit from one parent class
        One way to get around is Class A > Class B > Class C
    */
    
    // Fish myFish = new Fish("Koi", "Orange", 1.5);
    KoiFish myKoi = new KoiFish("Orange", 1.5);
    System.out.println(myKoi);
    myKoi.bePretty();
  }
}