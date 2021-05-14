package pro.edu;
/*
  @author   george
  @project   exercises
  @class  DuplicatesInListnode
  @version  1.0.0 
  @since 15.03.2021 - 17.05
*/

public class DuplicatesInListnode {
    public static class ListNode{
        private int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + ((next != null) ? next.val : "null") +
                    '}';
        }
    }




        public static ListNode deleteDuplicates(ListNode head){
            ListNode current = head;
            while ( current.next != null){
           //     System.out.println(current);
                if (current.val == current.next.val){
                    current.next = current.next.next;
                } else{
                    current = current.next;
                }
            }
            return head;
        }

        public static void printList(ListNode head){
        ListNode current = head;
        while (current != null) {
         System.out.println(current);
            current = current.next;
        }
        }

        public static void main(String[] args) {
            ListNode e4 = new ListNode(4, null);
            ListNode e3 = new ListNode(3, e4);
            ListNode e2 = new ListNode(1, e3);
            ListNode e1 = new ListNode(1, e2);
            ListNode head = new ListNode(0, e1);

            printList(head);
            System.out.println("-------------------------");
            printList(deleteDuplicates(head));


    }
}
