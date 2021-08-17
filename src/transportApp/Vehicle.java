package transportApp;

public interface Vehicle {
  void move();
  int getFuelLevel();
  String getPath();
  void addFuel(int units);
}
