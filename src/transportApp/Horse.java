package transportApp;

public class Horse implements Animal, Vehicle {
  private int fuel;
  private String name;

  public Horse(String name) {
    this.fuel = 0;
    this.name = name;
  }

  @Override
  public int getFuelLevel() {
    return fuel;
  }

  @Override
  public String getPath() {
    return "Grass";
  }

  @Override
  public void addFuel(int units) {
    //it's okay to pass already established methods to satisfy conditions
    eat(units);
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
