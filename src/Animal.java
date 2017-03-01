import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by kond on 2017. 03. 01..
 */
public class Animal {
  private int lifeExpentancy; // years
  private Boolean isCarnivore;

  public Animal() {
    this.lifeExpentancy = 10;
    this.isCarnivore = false;
    System.out.println("created an animal.");
  }

  public Animal(int lifeExpentancy, Boolean isCarnivore) {
    this.lifeExpentancy = lifeExpentancy;
    this.isCarnivore = isCarnivore;
  }

  public void sleep() {
    System.out.println("animal sleeps");
  }

  public void sleep(String type) {
    System.out.println("The " + type + " is sleeping");
  }

  public void eat() {
    System.out.println("The animal is eating");
  }

  public void speak() {
    System.out.println("animal speaks");
  }

  public String toString() {
    return ("isCarnivore=" + this.isCarnivore + ", lifeExpectancy=" + this.lifeExpentancy);
  }
}
