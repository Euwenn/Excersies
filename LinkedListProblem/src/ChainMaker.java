import java.util.Scanner;

public class ChainMaker
{
    public static void main ( String[] args )
    {
        int num = 0;

        Node node0 = new Node( 223 );
        Node node1 = new Node( 493 );
        Node node2 = new Node( -47 );
        Node node3 = new Node(  33 );
        Node node4 = new Node(  90 );
        Node node5 = new Node(  120 );
        Node node6 = new Node(  10 );


        node0.setPrev(null);
        node0.setNext( node1 );
        node1.setPrev(node0);
        node1.setNext( node2 );
        node2.setPrev(node1);
        node2.setNext( node3 );
        node3.setPrev(node2);
        node3.setNext( node4  );
        node4.setPrev(node3);
        node4.setNext(node5);
        node5.setPrev(node4);
        node5.setNext(node6);
        node6.setPrev(node5);
        node6.setNext(null);

        System.out.println("Please pick a number: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        // Traverse the Linked List in a loop
        boolean flag = false;
        Node p = node0;
        while (  p != null  )
        {
            if(num == p.getValue())
            {
                System.out.println("The number is in the list.");
                flag = true;
            }

            System.out.print("" + p );
            p = p.getNext();
        }

        p = node6;
        System.out.println("Reversed List Order.");
        while(p != null)
        {

            System.out.print("" + p );
            p = p.getPrev();
        }

        if(!flag)
        {
            System.out.println("The number is not in the list.");
        }

        System.out.println( "\nEnd of List");

    }

}
