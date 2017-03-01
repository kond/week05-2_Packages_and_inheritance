package workshop05;

/**
 * Created by kond on 2017. 03. 01..
 */
public class Rectangle {
  private int width;
  private int height;

  public Rectangle() {
    this(1, 1);
  }

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public Double getArea() {

  }
}
