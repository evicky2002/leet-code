public class MergeNodes {
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

    public ListNode mergeNodes(ListNode head) {
        ListNode result = head;
        ListNode currNode = head;
        ListNode leftGate = new ListNode();
        ListNode rightGate = new ListNode();
        int whichZero = 0;
        while (currNode != null) {
            if (currNode.val == 0 && whichZero == 0) {
                leftGate = currNode;
                whichZero = 1;
            } else if (currNode.val == 0 && whichZero == 1) {
                rightGate = currNode;
                whichZero = 0;
            }
            if (whichZero == 0) {
                ListNode temp = getSum(leftGate, rightGate);
                currNode = temp.next;
                // call get sum
            } else {
                currNode = currNode.next;
            }
        }
        ListNode lastNode = result.next;
        ListNode lastPrevious = result;

        while (lastNode.next != null) {
            lastPrevious = lastPrevious.next;
            lastNode = lastNode.next;
        }
        lastPrevious.next = null;
        return result;

    }

    public ListNode getSum(ListNode leftGate, ListNode rightGate) {
        ListNode start = leftGate;
        int sum = 0;
        while (leftGate != rightGate) {
            sum += leftGate.next.val;
            leftGate = leftGate.next;
        }
        System.out.println(sum);
        start.val = sum;
        start.next = rightGate;
        return start;
    }
}
