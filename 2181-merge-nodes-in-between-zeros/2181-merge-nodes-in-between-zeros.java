class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode write = head;
        ListNode curr = head.next;
        int sum = 0;
        while (curr !=null){
            if (curr.val != 0){
                sum= sum + curr.val;
            }
            else{
                write = write.next;
                write.val = sum;
                sum = 0;
            }
            curr = curr.next;
        }
        write.next = null;
        return head.next;
    }
}