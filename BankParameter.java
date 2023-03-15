import java.util.*;
/** bank account */
class Act{
 
	int acct;
 	String name;
 	float bal;
void insert(int a, String b,float c){
       acct=a;
	 name=b;
	 bal=c;	
		}
void display(){
	 System.out.println("Account Number : "+acct);
	 System.out.println("Holder name : "+name);
	 System.out.println("Balance : "+bal);
	}
void deposit(float z){
	 bal+=z;
 	 System.out.println("Toatal Balance : "+bal);
	}
void withdraw(float z){
	 bal=bal-z;
	 System.out.println("Remaining Balance : "+bal);
	}
}
class BankParameter
{
public static void main(String[] args)
{
	Act a1=new Act();
	int x;
      String y;
      float z,d,w;
      Scanner sc=new Scanner(System.in);
       System.out.print("Enter Account number : ");
       x=sc.nextInt();
	 sc.nextLine(); 
       System.out.print("Enter name : ");
       y=sc.nextLine();
       System.out.print("Enter Balance : ");
       z=sc.nextFloat();
     System.out.print("Enter Details : ");
	a1.insert(x,y,z);
      System.out.println("Information");
      a1.display();
      System.out.print("Enter Deposit amount : ");
        d=sc.nextFloat();
         a1.deposit(d);
         //a1.display();
      System.out.print("Enter withdraw amout : ");
        w=sc.nextFloat();
        a1.withdraw(w);
        //a1.display();
 }
}