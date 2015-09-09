
public class deleteNodeLinkedList
{

    public static void del(Node node)
    {
        node.val = node.next.val;
        node.next = node.next.next
        //empty reference cleaned up by Garbage Collector
    }

    public static void main(String[] args)
    {
        del(node);
    }
    
}
