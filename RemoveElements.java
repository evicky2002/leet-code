public class RemoveElements {
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

    public ListNode removeElements(ListNode head, int val) {
        ListNode start = head;
        int imposter = val;

        if (head == null) {
            return head;
        }
        if (head.next == null) {
            if (head.val == imposter) {
                head = null;
                return head;
            } else {
                return head;
            }
        }

        while (head.val == imposter) {
            if (head.next == null) {
                head = null;
                break;
            } else {
                head = head.next;
            }
        }

        ListNode prevNode = start;
        ListNode targetNode = start.next;
        while (targetNode != null) {
            System.out.println("val : " + targetNode.val);
            if (targetNode.val == imposter) {
                prevNode.next = targetNode.next;
                targetNode = targetNode.next;

            } else {
                targetNode = targetNode.next;
                prevNode = prevNode.next;
            }
        }
        return head;

    }
}
