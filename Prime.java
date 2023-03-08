class Prime
{
public static void main(String[]args)
{
 boolean p=true;
 int n=Integer.parseInt(args[0]);
 for(int i=2; i<=Math.sqrt(n); i++)
  {
    if( n % i ==0)
   {
     p=false;
     break;
    }
  }
 if(p)
  {
    System.out.println(n+" is a prime number");
   } 
else{ 
 System.out.println(n+" is not a prime number");
 } 
}
}