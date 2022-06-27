import java.util.LinkedList;

public class LCaddtwo {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public static void main(String[] args) {

    }
    public ListNode Solution(ListNode l1, ListNode l2){
          ListNode setUp = new ListNode(0);
          ListNode current = setUp;
          int carry = 0;
          while (l1.next != null || l2 != null) {
              int l1value = (l1 != null) ? l1.val : 0;
              int l2value = (l2 != null) ? l2.val : 0;
              int sum = carry + l1value + l2value;
              current.next = new ListNode(sum % 10);
              carry = sum / 10;
              current = current.next;
              if (l1 != null) l1 = l1.next;
              if (l2 != null) l2 = l2.next;
          }
          if(carry > 0){
              current.next = new ListNode(carry);
          }
          return  setUp.next;
    }
}
