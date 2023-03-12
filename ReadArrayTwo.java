import java.util.*;
class ReadArrayTwo
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
 System.out.print("Enter size of array : ");
  int n=sc.nextInt();
  int a[]=new int[n];
  int b[]=new int[n];
System.out.print("Enter elements of a :");
  for(int i=0;i<n;i++)
   a[i]=sc.nextInt();

System.out.print("Enter elements of b :"); 
for(int i=0;i<n;i++)
  b[i]=sc.nextInt();

System.out.println("elements of a");
for(int i=0;i<n;i++)
  System.out.print(a[i]);

System.out.println();
System.out.println("elements of b");
for(int i=0;i<n;i++)
 System.out.print(b[i]);
}
}