public class DMN {
  public static void main(String[] args) {
    new DMN();
  }

  public DMN() {
    testCase1();
    testCase2();
    testCase3();
    testCase4();
  }

  private void deleteMiddleNode(Node n) {
    if (n == null || n.next == null) return;
    if (n.next.next == null) {
      System.out.println(n.next);
      return;
    }
    Node runner = n.next;
    Node prev = n;
    Node start = n;
    while (runner != null && runner.next != null) {
      prev = n;
      n = n.next;
      runner = runner.next.next;
    }
    prev.next = n.next;
    System.out.println(start);
  }

  private void testCase2() {
    Node n1 = new Node(0);
    n1.next = new Node(1);
    n1.next.next = new Node(2);
    n1.next.next.next = new Node(3);
    n1.next.next.next.next = new Node(4);
    n1.next.next.next.next.next = new Node(5);
    deleteMiddleNode(n1);
  }

  private void testCase1() {
    Node n1 = new Node(0);
    n1.next = new Node(1);
    n1.next.next = new Node(2);
    n1.next.next.next = new Node(3);
    n1.next.next.next.next = new Node(4);
    n1.next.next.next.next.next = new Node(5);
    n1.next.next.next.next.next.next = new Node(6);
    deleteMiddleNode(n1);
  }

  private void testCase3() {
    deleteMiddleNode(new Node(0));
  }

  private void testCase4() {
    Node n = new Node(0);
    n.next = new Node(1);
    deleteMiddleNode(n);
  }



}
