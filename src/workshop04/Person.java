package workshop04;

/**
 * Created by kond on 2017. 03. 01..
 */
public class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return (this.name + " (" + this.age + ")");
  }

}
