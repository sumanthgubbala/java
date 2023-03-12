import java.util.*;
class ReadArray
{
 public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter size : ");
 int n=sc.nextInt();
 int a[]=new int[n];
 for(int i=0;i<n;i++)
{
 a[i]=sc.nextInt();
}
for (int i=0;i<n;i++)
{
System.out.println(a[i]);
}


}
}