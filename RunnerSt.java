//import java.io.BufferedReader;
//import java.io.InputStreamReader;



class Stack 
{
    int tos=-1,n=5;
    int[] stack=new int[n];
    int temp;
    public void push(int data)
    {
        if(tos==n-1)
        {
            System.out.println("the stack overflow");
        }
        else
        {
        tos+=1;
        stack[tos]=data;
        }
        
    }

    public void pop()
    {
        if(tos==-1)
        {
            System.out.println("the stack is underflow");

        }
        else
        {
            System.out.println("the element that is poped is:"+ stack[tos]);
            tos--;

        }

    }
    public void display()
    {
        if(tos==-1)
        {
            System.out.println("the stack is underflow");

        }
        else
        {
            temp=tos;
            System.out.print("the stack elements are:");
            for(int i=temp;i>=0;i--)
            {
                System.out.print(stack[i]+" ");
            }
            System.out.println();

        }

    }


    
}
public class RunnerSt 
{
    
    public static void main(String[] args) 
    {
        Stack stob=new Stack();
        stob.push(35);
        stob.push(57);
        stob.push(78);
        stob.push(89);
        stob.push(25);

        stob.display();

        stob.pop();
        stob.display();

        stob.pop();
        stob.display();
        
    }
    /**InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
    int n=Integer.parseInt(br.readLine());**/

       
}
