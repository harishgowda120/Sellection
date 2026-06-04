public class Insersion {
    public static void main(String[] arg)
    {
        int arr[]={3,6,2,1,5};
        int key;
        int i,j,n=arr.length;
        System.out.println("Array before sorting:");
        for(int num:arr)
        {
            System.out.print(num+" ");
   
        }
        for(i=1;i<n;i++)
        {
            key=arr[i];
            j=i-1;
            while( j>=0 && arr[j]>key )
            {
                arr[j+1]=arr[j];
                j-=1;


            }
            arr[j+1]=key;
        }
        System.out.println();

        System.out.println("Array aftre sorting:");
        for(int num:arr)
        {
            System.out.print(num+" ");
   
        }
    }
    
}
