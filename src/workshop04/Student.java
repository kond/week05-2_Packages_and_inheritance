package workshop04;

import java.util.ArrayList;

/**
 * Created by kond on 2017. 03. 01..
 */
public class Student extends Person {
  private ArrayList<Integer> grades = new ArrayList<Integer>();

  public Student(String name, int age) {
    super(name, age);
  }

  private Double getAverage() {
    Double avg = 0.0;

    for(int grade : grades) {
      avg += grade;
    }

    avg /= grades.size();

    return avg;
  }

  public void addGrade(int grade) {
    if(grade > 0 && grade < 6) {
      grades.add(grade);
    } else {
      System.out.println("Grade can between 1 to 5");
    }
  }

  public String toString() {
    return (super.toString() + " average: " + this.getAverage());
  }
}
