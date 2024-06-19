public class Node
{
    private Node next;
    private Node prev;
    private int  value;

    public Node ( int val )
    {
        value = val;
        next = null;
        prev = null;
    }

    public int  getValue() {
        return value;
    }
    public Node getNext()  {
        return next;
    }

    public void setValue( int val ) {
        value = val;
    }
    public void setNext( Node nxt ) {
        next = nxt;
    }

    public Node getPrev()  {
        return prev;
    }

    public void setPrev( Node prv ) {
        prev = prv;
    }


    public String toString() {
        return value + ", ";
    }
}

