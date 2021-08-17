package transportApp;

public class Main {
  public static void main(String[] args) {
    Horse myHorse = new Horse("Chester");
    myHorse.eat(15);
    myHorse.move();
    System.out.println(myHorse);
  }
}