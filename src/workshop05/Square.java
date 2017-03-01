package workshop05;

/**
 * Created by kond on 2017. 03. 01..
 */
public class Square extends Block {

  public Square(int length) {
    super(length);
  }

  public int getArea() {
    return (this.getLength() * this.getLength());
  }

  public String toString() {
    return ("Square[" + this.getLength() + "]");
  }
}
