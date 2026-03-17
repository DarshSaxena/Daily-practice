import java.util.Scanner;
class Average
{
    public static void main(String[] args)
    {
 Scanner sc=new Scanner(System.in);
 int sum=0;
        System.out.print("Enter size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
             sum=sum+arr[i];
            System.out.print("the sum is :"+sum);
        }
        int avg=sum/size;
        System.out.print("the avg is"+avg);
        
    }
}
