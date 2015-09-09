
public class removeAllDuplicatesLinkedList
{
    public static ListNode removeElements(ListNode head, int val)
    {
        if (head == null)   //recursive base case, reached end of list
            return null;

        head.next = removeElements(head.next, val)  //traverse till tail

        if (head.val == val)
            return head.next;
        else
            return head;

    }

    public static void main(String[] args)
    {
        removeElements(head);
    }
}