import java.util.*;
class Account
{
  int acct;
  String name;
  float bal;


  void insert()
  {
   System.out.println("Enter Account details : ");
   Scanner sc=new Scanner(System.in);
   acct=sc.nextInt();
   sc.nextLine();
   name=sc.nextLine();
   bal=sc.nextFloat();
  }
  void display()
  { 
   System.out.println("Account number : "+acct);
   System.out.println("Name : "+name);
   System.out.println("Balance : "+bal);
  }
  void deposit()
  {
   System.out.print("Enter Deposit Amount : ");
   Scanner sc=new Scanner(System.in);
   int amt=sc.nextInt();
   bal+=amt;
   }
   void withdraw()
   {
    System.out.print("Enter Withdraw amount : ");
    Scanner sc=new Scanner(System.in);
    float amt=sc.nextFloat();
    bal=bal-amt;
    if(bal<=1000)
    System.out.println("cannot withdarw amount");
    else
    System.out.println("balance");
   }
}
class Bank
{
public static void main(String[] args)
 {

   Account a1=new Account();
    a1.insert();
    a1.display();
    a1.deposit();
    a1.withdraw();
  }

}