public class MiddleNode {
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

    public ListNode middleNode(ListNode head) {
        ListNode resultNode;
        if (head.next == null) {
            resultNode = head;
            return resultNode;
        }
        ListNode headNode = head;
        ListNode currNode = head;
        int length = 0;
        int mid = 0;
        while (currNode != null) {
            currNode = currNode.next;
            length++;
        }
        mid = length / 2;
        int i = 0;
        while (i < mid - 1) {
            headNode = headNode.next;
            i++;
        }
        resultNode = headNode.next;
        return resultNode;
    }
}
