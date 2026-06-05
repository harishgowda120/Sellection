class Queue
{
    int[] q=new int[5];
    int f=-1,r=-1,n=5;
    public void display()
    {
        System.out.print("the Q elements are :");
        for(int i=f;i!=r;i=(i+1)%n)
        {
            System.out.print(q[i]+" ");

        }
        System.out.print(q[r]+" ");
        System.out.println();
    }
    public void enqueue(int data)
    {
        if(f==-1&&r==-1)
        {
            f=r=0;

            q[r]=data;
        }
        else if((r+1)%n==f)
        {
            System.out.println("the Q is full");
        }
        else 
        {
            r=(r+1)%n;
            q[r]=data;
        }
        
        
    }

    public void dequeue()
    {
        if(r==-1&&f==-1)
        {
            System.out.println("the queue is empty!!");

        }
        else
        {
            System.out.println("the deleted item is:"+q[f]);
            f=(f+1)%n;
        }
    }
}
public class RunnerQ 
{
    public static void main(String[] args)
    {
        Queue obq=new Queue();
        obq.enqueue(10);
        obq.enqueue(20);
        obq.enqueue(49);
        obq.enqueue(29);
        obq.enqueue(2);
        obq.enqueue(59);

        obq.display();
        obq.dequeue();
        obq.display();

        obq.enqueue(67);
        obq.display();
    }
    
}
