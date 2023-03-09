class Palindrome
	{
		public static void main(String[] arg)
			{
				int n,m,d,rev=0,n1;
				n=Integer.parseInt(arg[0]);
            n1=n;
				while(n>0)
					{
    					d=n%10;
    					rev=rev*10+d;
    					n=n/10;
					}
			if(n1==rev)
				{ System.out.println("palindrome number"); }
			else
				{ System.out.println("not palindrome number"); }
	}
}