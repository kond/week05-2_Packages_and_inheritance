/**
 * Created by kond on 2017. 03. 01..
 */
public class Bird extends Animal {

  public Bird() {
    super("Bird");
  }

  public void fly() {
    System.out.println("Bird can fly");
  }

  public void sleep() {
    System.out.println("The bird is sleeping");
  }

  public void eat() {
    System.out.println("The bird is eating");
  }

  public void nightyNight() {
    super.eat();
    this.sleep();
  }
}
