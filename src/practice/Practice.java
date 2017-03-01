package practice;

/**
 * Created by kond on 2017. 03. 01..
 */
public class Practice {
  public static void main(String[] args) {

    // Testing Stack
    Stack stack = new Stack();
    System.out.println(stack.pop());
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }
}
