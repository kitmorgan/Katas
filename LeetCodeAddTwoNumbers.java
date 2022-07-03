import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCodeAddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void Solution(ListNode a, ListNode b) {
        ListNode nodeA = a;
        ListNode nodeB = b;
        ListNode initial = new ListNode(a.val + b.val);

        while(nodeA.next != null && nodeB.next != null){
            ListNode nodeANext = nodeA.next;
            ListNode nodeBNext = nodeB.next;
            ListNode initialNext = new ListNode(nodeANext.val + nodeBNext.val);
            initial.next = initialNext;

        }
    }
}
