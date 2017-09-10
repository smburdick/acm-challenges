public class Node {
  private int a;
  public Node next;
  public int getValue() { return a; }
  public Node(int a) { this.a = a; }
  public String toString() { return next != null ? a + "->" + next.toString() : Integer.toString(a); }
}
