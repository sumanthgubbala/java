import java.util.*;
class ReadArrayAdd
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter size of array : ");
 int n=sc.nextInt();
 int a[]=new int[n];
 int b[]=new int[n];
 int c[]=new int[n];
                                   //input
System.out.print("Enter elements of A : ");
  for(int i=0;i<n;i++)
    a[i]=sc.nextInt();                  //input
System.out.print("Enter Elements of B : ");
  for(int i=0;i<n;i++)
    b[i]=sc.nextInt();                  //input
System.out.println("Adding two Array Result"); 
 for(int i=0;i<n;i++)
    c[i]=a[i]+b[i];             //Adding two arrays output
                                   
 for(int i=0;i<n;i++)
    System.out.println(c[i]);    //output
 




}
}