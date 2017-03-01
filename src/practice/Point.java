package practice;

/**
 * Created by kond on 2017. 03. 01..
 */
public class Point {
  private int x;
  private int y;

  public Point() {
    this(0, 0);
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int[] getXY() {
    int[] result = {this.x, this.y};
    return result;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void setXY(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "(" + x + "," + y + ")";
  }

  public Double distance(int x, int y) {
    return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
  }

  public Double distance(Point p) {
    return Math.sqrt(Math.pow(p.getX() - this.x, 2) + Math.pow(p.getY() - this.y, 2));
  }

  public Double distance() {
    return this.distance(0, 0);
  }

}
