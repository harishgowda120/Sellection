//package datastruct;
class Node
{
    int data;
    Node next;
}
class Linkedlist
{
    Node head;
    public void insert(int data)
    {
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=null;
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node n=head;
            while (n.next!=null) 
            {
                n=n.next;
                
            }
            n.next=newnode;
        }

    }

    public void show(Node head)
    {
        Node n=head;
        if(head==null)
        {
            System.out.println("enter some elements first");
            
        }
        else
        {
        System.out.println("the linked list elements are:");
        while(n.next!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.print(n.data+" ");
        }
        System.out.println();

    }

    public void insertbeg(int data)
    {
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=null;
        if(head!=null)
        {
            newnode.next=head;
            head=newnode;
        }
        else
        {
            head=newnode;
        }
    }

    public void insertat(int in,int data)
    {
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=null;
        Node n=head;

        for(int i=0;i<in-1;i++)
        {
            n=n.next;

        }
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            newnode.next=n.next;
            n.next=newnode;
        }
    }

    public void deletat(int in)
    {
        Node p=head;
        Node q=new Node();
        if(in==0)
        {
            head=head.next;
        }

        for(int i=1;i<in+1;i++)
        {
           q=p;
           p=p.next;
        }
        q.next=p.next;


    }
    public void deletatend()
    {
        Node p=head;
        Node q=new Node();
        while (p.next!=null) 
        {
            q=p;
            p=p.next;
            
        }
        q.next=null;
    }

    public Node Reverse(Node head)
    {
        int count=0;
        Node RevHead=new Node();
        Node temp=head;
        while (temp.next!=null) 
        {
            count=count+1;
            temp=temp.next;  
        }
        System.out.println(count);
        for(int i=0;i<count+1;i++)
        {
            temp=head;
            for(int j=count-i;j>0;j--)
            {
                temp=temp.next;
            }
            if(RevHead.data==0)
            {
                RevHead.data=temp.data;
            }
            else
            {
                Node newnode=new Node();
                newnode.data=temp.data;
                Node n=RevHead;
                while (n.next!=null) 
                {
                    n=n.next;
                }
                n.next=newnode;    
            }
        }
        System.out.println("the reversed linked list elements are:");
        while(RevHead.next!=null)
        {
            System.out.print(RevHead.data+" ");
            RevHead=RevHead.next;
        }
        System.out.print(RevHead.data+" ");

        return RevHead;
    }

}

class RunnerList 
{
    public static void main(String[] arg)
    {
        Linkedlist ll=new Linkedlist();
        ll.insert(34);
        ll.insert(20);
        ll.insert(45);
        ll.insert(64);
        ll.insert(50);
        ll.show(ll.head);

        //ll.insertbeg(60);
        //ll.show(ll.head);

        //ll.insertat(2, 81);
        //ll.show(ll.head);

        //ll.deletatend();
        //ll.show(ll.head);

        //ll.deletat(2);
        //ll.show(ll.head);
        
        ll.Reverse(ll.head);
    }

}
