import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by kond on 2017. 03. 01..
 */
public class Dog extends Animal {
  private Boolean hasTail = true;

  public Dog() {
    super(15,true);
    System.out.println("new dog");
  }

  public Boolean getHasTail() {
    return this.hasTail;
  }

  public void speak() {
    System.out.println("dog barks");
  }

  public void beg() {
    System.out.println("dog begs");
  }
}
