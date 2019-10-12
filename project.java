import java.util.*;
class items
{
Double n;
int  ch;
String str;
double price,total=0;
double watt=0.5;
items()
{
while(true)
{
System.out.println("enter any choice");
System.out.print("\n1.vegetables\n2.fruits\n3.junk food\n4.pulses\n5.calculation \n 6.format\n 7.exit \n");
Scanner c=new Scanner(System.in);
ch=c.nextLine();
switch(ch)
{
case 1:System.out.println("tomato,brinjal,potato,carrot");
		System.out.println("enter any item under vegetable");
	   Scanner s=new Scanner(System.in);
	   str=s.next();
	   if(str.equals("tomato"))
	   {
	   System.out.println("enter the quantity of tomates in kgs");
	   Scanner sc=new Scanner(System.in);
	   n=sc.nextDouble();
	   price=n*25;
	   total=total+price;
	   System.out.println("amount="+price+"\n total="+total);
	   }
	   else if(str.equals("brinjal"))
	   {
	   System.out.println("enter the quantity of brinjal in kgs");
	   Scanner sc1=new Scanner(System.in);
	   n=sc1.nextDouble();
	   price=n*25;
	    total=total+price;
	   System.out.println("amount="+price+"\n total="+total);
	   }
	   else if(str.equals("potato"))
	   {
	   System.out.println("enter the quantity of potato in kgs");
	   Scanner sc2=new Scanner(System.in);
	   n=sc2.nextDouble();
	   price=n*25;
	    total=total+price;
	   System.out.println("amount="+price+"\n total="+total);
	   }
	   else if(str.equals("carrot"))
	   {
	   System.out.println("enter the quantity of carrot in kgs");
	   Scanner sc3=new Scanner(System.in);
	   n=sc3.nextDouble();
	   price=n*25;
	    total=total+price;
	   System.out.println("amount="+price+"\n total="+total);
	   }
	   break;
case 2:System.out.println("enter any item under fruits");
	   System.out.println("apple,orange,guava,kiwi");
	   Scanner s1=new Scanner(System.in);
	   str=s1.nextLine();
       if(str.equals("apple"))
	   {
	   System.out.println("enter the quantity of apple in kgs");
	   Scanner sc4=new Scanner(System.in);
	   n=sc4.nextDouble();
	   price=n*25;
	    total=total+price;
	   System.out.println("amount="+price+"\n total="+total);
	   }
	   else if(str.equals("orange"))
	   {
	   System.out.println("enter the quantity of orange in kgs");
	  Scanner sc5=new Scanner(System.in);
	   n=sc5.nextDouble();
	   price=n*25;
	    total=total+price;
	   System.out.println("amount="+price+"\n total="+total);
	   }
	   else if(str.equals("guava"))
	   {
	   System.out.println("enter the quantity of guava in kgs");
	   Scanner sc6=new Scanner(System.in);
	   n=sc6.nextDouble();
	   price=n*25;
	    total=total+price;
	   System.out.println("amount="+price+"\n total="+total);
	   }
	   else if(str.equals("kiwi"))
	   {
	   System.out.println("enter the quantity of kiwi in kgs");
	  Scanner sc7=new Scanner(System.in);
	   n=sc7.nextDouble();
	   price=n*25;
	    total=total+price;
	   System.out.println("amount="+price+"\n total="+total);
	   }
	   break;
case 3:System.out.println("enter any item junk food");
	  System.out.println("chocolates,biscuits,juices,chips,snacks");
	  Scanner s2=new Scanner(System.in);
	  str=s2.nextLine();
       if(str.equals("chocolates"))
	   {
	   System.out.println("enter the quantity of chocolates ");
	   Scanner sc8=new Scanner(System.in);
	   n=sc8.nextDouble();
	   price=n*10;
	   total=total+price;
	   System.out.println("amount="+price+"\n total="+total);
	   }
	   else if(str.equals("biscuits"))
	   {
	   System.out.println("enter the quantity of biscuits in pkts");
	   Scanner sc9=new Scanner(System.in);
	   n=sc9.nextDouble();
	   price=n*20;
	   total=total+price;
	   System.out.println("amount="+price+"\n total="+total);
	   }
	   else if(str.equals("juices"))
	   {
	   System.out.println("enter the quantity of juices in ltrs");
	   Scanner sc10=new Scanner(System.in);
	   n=sc10.nextDouble();
	   price=n*25;
	   total=total+price;
	   System.out.println("amount="+price+"\n total="+total);
	   }
	   else if(str.equals("chips"))
	   {
	   System.out.println("enter the quantity of chips in pkts");
	   Scanner sc11=new Scanner(System.in);
	   n=sc11.nextDouble();
	   price=n*20;
	   total=total+price;
	   System.out.println("amount="+price+"\n total="+total);
	   }
	   else if(str.equals("snacks"))
	   {
	   System.out.println("enter the quantity of snacks in pkts");
	  Scanner sc12=new Scanner(System.in);
	  n=sc12.nextDouble();
	   price=n*30;
	    total=total+price;
	   System.out.println("amount="+price+"\n total="+total);
	   }
	   break;
case 4:System.out.println("enter any item pulses");
	   System.out.println("drypeas,lentils,chickpeas,horsegram");
	  Scanner s3=new Scanner(System.in);
	 str=s3.nextLine();
       if(str.equals("drypeas"))
	   {
	   System.out.println("enter the quantity of drypeas");
	    Scanner sc13=new Scanner(System.in);
	  n=sc13.nextDouble();
	   price=n*10;
	    total=total+price;
	   System.out.println("amount="+price+"\n total="+total);
	   }
	   else if(str.equals("lentils"))
	   {
	   System.out.println("enter the quantity of lentils");
	   Scanner sc14=new Scanner(System.in);
	  n=sc14.nextDouble();
	   price=n*20;
	    total=total+price;
	   System.out.println("amount="+price+"\n total="+total);
	   }
	   else if(str.equals("chickpeas"))
	   {
	   System.out.println("enter the quantity of chickpeas");
	  Scanner sc15=new Scanner(System.in);
	   n=sc15.nextDouble();
	   price=n*25;
	    total=total+price;
	   System.out.println("amount="+price+"\n total="+total);
	   }
	   else if(str.equals("horsegram"))
	   {
	   System.out.println("enter the quantity of horsegram");
	  Scanner sc16=new Scanner(System.in);
	   n=sc16.nextDouble();
	   price=n*20;
	    total=total+price;
	   System.out.println("amount="+price+"\n total="+total);
	   }
	   break;
	case 5:System.out.print("\n calculation");
	total=total*watt;
	System.out.print("\n total with discount="+total);
	System.out.println();
	break;
	case 6:System.out.print("\n***************************");
	System.out.print("\n WELCOME TO CITY SUPER MARKET");
	System.out.print("\n \n 4-1-115,JUBLIHILLS,HYDERABAD");
	System.out.print("\n\n***************************");
	System.out.print("\n------items taken-----");
	System.out.print("\n total="+total);
	System.out.print("\n \n **************************************");
	System.out.print("\n**********THANK U;VISIT AGAIN*************");
	System.out.print("\n\n ****************************************\n");
	break;
	   case 7:System.exit(1);
	   break;	   
}
}
}
}
class billTest 
{
	public static void main(String args[])
	{
		items i=new items();
	}
}
	   
	   
	   

	   
	   