public class LearningStack {

  public static void main(String[] args) {
    System.out.println("Learning stack ");
    Stack s1 = new Stack(2);
    try {
      // s1.pop();
      s1.push(34);
      System.out.println(s1.getElement());
      s1.push(56);
      System.out.println(s1.getElement());
      s1.push(8);
    } catch (StackOverflowException e) {
      System.out.println(e);
    }
    // } catch (UnderflowException e) {
    //   System.out.println(e);
    // }
  }
}

class StackOverflowException extends Exception {

  public String toString() {
    return "Stack Overflow";
  }

  public String getMessage() {
    return "Stack Overflow";
  }
}

class UnderflowException extends Exception {

  public String toString() {
    return "Stack underflow";
  }

  public String getMessage() {
    return "Stack underflow";
  }
}

class Stack {

  private int size,
    position = -1;
  private int[] s;

  public Stack(int size) {
    this.size = size;
    this.s = new int[size];
  }

  public void push(int x) throws StackOverflowException {
    if (position >= size - 1) {
      throw new StackOverflowException();
    }
    s[++position] = x;
  }

  public void pop() throws UnderflowException {
    if (position <= -1) {
      throw new UnderflowException();
    }
    s[position--] = 0;
  }

  public int getElement() {
    return s[position];
  }
}
