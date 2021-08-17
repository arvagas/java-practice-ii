package transportApp;

import java.util.*;
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
    
    //will not work because abstract class cannot be called
    // Fish myFish = new Fish("Koi", "Orange", 1.5);

    // KoiFish myKoi = new KoiFish("Orange", 1.5);
    // System.out.println(myKoi);
    // myKoi.bePretty();

    //make new List, with this type ---> create new ArrayList with this type
    List<KoiFish> fishList = new ArrayList<KoiFish>();
    System.out.println(fishList.size());
    fishList.add(new KoiFish("Orange", 1.5));
    fishList.add(new KoiFish("Blue", 2.0));
    fishList.add(new KoiFish("Green", 1.0));
    
    //will store reference in variable so you can directly remove if necessary
    // KoiFish fakeFish = new KoiFish("Green", 1.0);
    // fishList.add(fakeFish);
    // System.out.println(fishList.size());
    // fishList.remove(fakeFish);

    // System.out.println(fishList.size());
    // System.out.println(fishList);

    // for (int i = 0; i < fishList.size(); i++) {
    //   fishList.get(i).bePretty();
    // }

    //faster way to call custom objects in an array list, but lose out on index
    for (KoiFish k : fishList) {
      k.bePretty();
    }
  }
}