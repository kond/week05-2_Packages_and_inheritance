package practice;

/**
 * Created by kond on 2017. 03. 01..
 */
public class Line {
  private Point start;
  private Point end;

  public Line(Point p1, Point p2) {
    this.start = p1;
    this.end = p2;
  }

  public Line(int x1, int y1, int x2, int y2) {
    this(new Point(x1, y1), new Point(x2, y2));
  }

  public Point getStart() {
    return start;
  }

  public Point getEnd() {
    return end;
  }

  public Double getLength() {
    return this.start.distance(this.end);
  }

  public void setStart(Point start) {
    this.start = start;
  }

  public void setStart(int x, int y) {
    this.start = new Point(x, y);
  }

  public void setEnd(Point end) {
    this.end = end;
  }

  public void setEnd(int x, int y) {
    this.end = new Point(x, y);
  }
}
