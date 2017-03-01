package workshop05;

/**
 * Created by kond on 2017. 03. 01..
 */
public class Block extends Rectangle {
  private int length;
  private int volume;

  public Block() {
    this(1);
  }

  public Block(int length) {
    this.length = length;
  }

  public int getLength() {
    return length;
  }

  public int getVolume() {
    return volume;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }
}
