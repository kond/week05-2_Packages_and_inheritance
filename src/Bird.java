/**
 * Created by kond on 2017. 03. 01..
 */
public class Bird extends Animal {

  public Bird() {
    super(2,false);
    System.out.println("new bird");
  }

  public void speak() {
    System.out.println("bird chirps");
  }

  public void fly() {
    System.out.println("bird flies");
  }
}
