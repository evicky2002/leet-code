public class GetDecimalValue {
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

    public int getDecimalValue(ListNode head) {
        String binary = "";
        int result = 0;
        ListNode currNode = head;
        while (currNode != null) {
            binary += currNode.val;
            currNode = currNode.next;
        }
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int temp = Character.getNumericValue(binary.charAt(i));
            result += temp * Math.pow(2, power);
            power++;
        }
        return result;
    }
}
