/**
 * Created by kond on 2017. 03. 01..
 */
public class Animal {

  public Animal() {
    System.out.println("Animal is created");
  }

  public Animal(String type) {
    System.out.println(type + " animal is created");
  }

  public void sleep() {
    System.out.println("The animal is sleeping");
  }

  public void sleep(String type) {
    System.out.println("The " + type + " is sleeping");
  }

  public void eat() {
    System.out.println("The animal is eating");
  }
}
