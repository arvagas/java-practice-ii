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
    // List<KoiFish> fishList = new ArrayList<KoiFish>();
    //Can leave ArrayList blank as it knows it's dealing with Fish from earleir
    List<Fish> fishList = new ArrayList<>();
    // System.out.println(fishList.size());
    fishList.add(new KoiFish("Orange", 1.5));
    fishList.add(new KoiFish("Blue", 2.0));
    fishList.add(new KoiFish("Green", 1.0));
    fishList.add(new Salmon("Green", 2.0));
    
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
    // for (KoiFish k : fishList) {
    //   k.bePretty();
    // }

    //lambda expression: pass a function into a function
    // fishList.forEach( (KoiFish k) -> {k.bePretty();} );

    //sort method:
    // fishList.sort( (KoiFish k1, KoiFish k2) -> {
    //   return (k1.getWeight() > k2.getWeight() ? 1 : -1);
    // });

    //shorthand of above
    //since fishList already knows it's type KoiFish, you don't need to reiterate
    // fishList.sort( (k1, k2) -> (k1.getWeight() > k2.getWeight() ? 1 : -1));

    // fishList.forEach( (KoiFish k) -> {
    //   System.out.println(k.getWeight());
    // });

    // printFilteredFish(fishList, (k) -> k.getWeight() > 1.5);
    // printFilteredFish(fishList, (k) -> k.getColor() == "Green");
    printFilteredFish(fishList, (k) -> k.getWeight() > 1.5);
  }

  public static void printFilteredFish(List<Fish> fishList, FishTester fishTester) {
    for (Fish f : fishList) {
      if (fishTester.test(f)) {
        System.out.println(f);
      }
    }
  }
}