package transportApp;

public abstract class Fish {
  //if abstract, make properties protected to pass down to child class
  protected String color;
  protected String type;
  protected double weight;

  public Fish(String type, String color, double weight) {
    this.type = type;
    this.color = color;
    this.weight = weight;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void swim() {
    System.out.println("Swish Splash");
  }

  @Override
  public String toString() {
    return "Type: " + type + "\n" +
            "Color: " + color + "\n" +
            "Weight: " + weight;
  }
}
