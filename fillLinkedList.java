public class fillLinkedList {
    public static void main(String[] args) {
        int[] nums = {8,5,1,0};
        ListNode head = new ListNode(nums[0]);
        printList(fillList(head, nums));
    }
    //print listnode values
    public static void printList(ListNode head){
        if(head == null){
            return;
        }

        System.out.print(head.val +", ");

        printList(head.next);
    }
    //make a new listnode with all the values inside of an array
    public static ListNode fillList(ListNode head, int[] nums){
        ListNode current = head;

        //we start the list at the second element in the array because we initialise the head initially to contain the first value inside of the array
        for(int i = 1; i < nums.length; i++){
            //from here we set the next value to be the current value inside of the array
            current.next = new ListNode(nums[i]);

            //iterate through the next cycle of current
            current = current.next;
        }
        
        return head;
    }
}
