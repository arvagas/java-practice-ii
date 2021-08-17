package transportApp;

public class Horse implements Animal {
  private int fuel;
  private String name;

  public Horse(String name) {
    this.fuel = 0;
    this.name = name;
  }

  @Override //okay to leave out, but it's good form
  public void move() {
    fuel--;
  }

  @Override
  public void eat(int units) {
    fuel += units;
  }

  @Override
  public String speak() {
    return "Nay!";
  }

  @Override
  public String toString() {
    String rtnStr = "Name: " + name + "\n" +
                    "Fuel: " + fuel;
    return rtnStr;
  }
}
