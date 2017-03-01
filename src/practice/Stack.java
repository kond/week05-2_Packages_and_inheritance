package practice;

import java.util.ArrayList;

/**
 * Created by kond on 2017. 03. 01..
 */
public class Stack {
  private ArrayList<Integer> integerStack = new ArrayList<Integer>();


  public void push(Integer item) {
    this.integerStack.add(item);
  }

  public Integer pop() {
    try {
      Integer result = this.integerStack.get(integerStack.size() - 1);
      this.integerStack.remove(integerStack.size() - 1);
      return result;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Can\'t pop from empty stack.");
      return null;
    }
  }

  public int size() {
    return integerStack.size();
  }
}
