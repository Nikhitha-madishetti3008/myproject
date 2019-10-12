import java.util.*;
class account
{	
 String an,name,date;
 double bal,amt;
 	account(String n,String a2,double b2)
 	{
 	name=n;
 	an=a2;
 	bal=b2;
 	}
	void printaccount()
 	{	
 	System.out.print("\n name="+name+"\n accountno="+an+"\n balance="+bal);
 	}
	void withdrawalmoney(String t,double m)
	{
	date=t;
	amt=m;
 	if(amt<=bal)
	{
	 bal=bal-amt;
	 System.out.print("\n bal="+bal);
	}
	else
	System.out.print("\n withdrawal impossible");
	}	
	void depositmoney(String e,double o)
	{
	date=e;
	amt=o;
	bal=bal+amt;
	System.out.print("\n deposited balance="+bal);
	}
	void depositformat()
	{
 	System.out.print("\n ***********************");
	System.out.print("\n  STATE BANK OF INDIA");
	System.out.print("\n ****************************");
	System.out.print("\n \n WARANGAL,TELANGANA");
	System.out.print("\n  -----------------------------------------------");
	System.out.print("\n DATE :"+date);
	System.out.print("\n  ACCOUNTANT NAME :"+name+"\n ACCOUNT NUMBER:"+an);
	System.out.print("\n \n DEPOSITED AMOUNT:"+amt);
	System.out.print("\n \n RESULTANT BALANCE:"+bal);
	System.out.print("\n \n ********************************");
	System.out.print("\n THANK YOU");
	System.out.print("\n \n ********************************");
	}
	void withdrawalformat()
	{
	System.out.print("\n ***********************");
	System.out.print("\n \n STATE BANK OF INDIA");
	System.out.print("\n ****************************");
	System.out.print("\n \n WARANGAL,TELANGANA");
	System.out.print("\n \n -----------------------------------------------");
	System.out.print("\n DATE :"+date);
	System.out.print("\n NAME :"+name+"\n ACCOUNT NUMBER:"+an);
	System.out.print("\n \n WITHDRAWAL  AMOUNT:"+amt);
	System.out.print("\n \n RESULTANT BALANCE:"+bal);
	System.out.print("\n \n ********************************");
	System.out.print("\n THANK YOU");
	System.out.print("\n \n ********************************");
	}
}
class bank
{
 public static void main(String argv[])
 {
	Scanner sc=new Scanner(System.in);
	System.out.print("\n enter name of account holder:");
	String s1=sc.next();
	System.out.print("\n enter account number  of account holder:");
	String s2=sc.next();
	System.out.print("\n enter the balance:");
	double d1=sc.nextDouble();
   	account obj= new account(s1,s2,d1);
   	while(true)
   	{
		System.out.print("\n \n \n THE CHOICES ARE:");
		System.out.print("\n 1-printaccount  \n 2-withdrawal money \n 3-deposit money \n 4-deposit format \n 5-withdrawal format \n 6-exit \n");
		Scanner b=new Scanner(System.in);
		System.out.print("\n enter choice:");
		int ch=b.nextInt();
		switch(ch)
		{	 
		case 1:obj.printaccount();
	 		break;
		case 2:Scanner s=new Scanner(System.in);
			System.out.print("\n enter date of withdrawal:");
			String d=s.next();
			System.out.print("\n enter withdrawal amount:");
			double a=s.nextDouble();
			obj.withdrawalmoney(d,a);
	  		break;
		case 3:Scanner c=new Scanner(System.in); 
			System.out.print("\n enter deposit amount:");
        		double a1=c.nextDouble();
			System.out.print("\n enter date of deposition:");
			String d11=c.next();
			obj.depositmoney(d11,a1);
	 		break;
		case 4:obj.withdrawalformat();
	  		break;
		case 5:obj.depositformat();
	  		break;
		case 6:System.exit(1);
	    		break;       
}
}
}
}
   
