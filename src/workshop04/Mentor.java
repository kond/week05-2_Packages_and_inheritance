package workshop04;

/**
 * Created by kond on 2017. 03. 01..
 */
public class Mentor extends Person {
  private String seniorityLevel;
  private String subject;

  public Mentor(String name, int age, String seniorityLevel, String subject) {
    super(name, age);
    this.seniorityLevel = seniorityLevel;
    this.subject = subject;
  }

  public String toString() {
    return (super.toString() + " is a(n) " + this.subject + " " + this.seniorityLevel);
  }
}
