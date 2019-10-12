import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="Java4" width=400 height=400></applet>*/
public class Java4 extends Applet implements ActionListener
{
TextField tf1,tf2,tf3,tf4,tf5;
Button b1,b2,b3;
Label l1,l2,l3,l4,l5;
public void init()
{
   Label l1=new Label("English");
	//l1.setBounds(30,50,150,20);
    Label l2=new Label("Analytical skills");
    //l2.setBounds(30,100,150,20);
	Label l3=new Label("General Knowledge");
    //l3.setBounds(30,150,150,20);
	Label l4=new Label("Total");
	//l4.setBounds(30,200,150,20);
	l5=new Label("Grade");
	//l5.setBounds(30,250,150,20);
	tf1=new TextField();    
	//tf1.setBounds(100,50,150,20);
	tf2=new TextField();    
	//tf2.setBounds(100,100,150,20);
	tf3=new TextField();
    //tf3.setBounds(100,150,150,20);
	tf4=new TextField();
	//tf4.setBounds(100,200,250,20);
	tf5=new TextField();
	//tf5.setBounds(100,250,150,20);
	b1=new Button("Get Total");
	//b1.setBounds(50,200,50,50);
	b2=new Button("Get Grade");
	//b2.setBounds(120,200,50,25);
	b3=new Button("Exit");
	//b3.setBounds(190,200,50,50);
	add(l1);
	add(tf1);
	add(l2);
	add(tf2);
	add(l3);
	add(tf3);
	add(l4);
	add(tf4);
	add(l5);
	add(tf5);
	add(b1);
	add(b2);
	add(b3);
	b1.addActionListener(this);
	b2.addActionListener(this);
     b3.addActionListener(this);
	 }
public void actionPerformed(ActionEvent e)
{
	String s=e.getActionCommand();
	String s1=tf1.getText();
	String s2=tf2.getText();
	String s3=tf3.getText();
	String s4="";
	int a=Integer.parseInt(s1);
	int b=Integer.parseInt(s2);
	int c=Integer.parseInt(s3);
	int d=0;
		if(e.getSource()==b1)
	{
		d=a+b+c;
	}
	else if(e.getSource()==b2)
	{
			  if(d>200 && d<=300)
		 s4="A";
      else if(d>100&&d<=200)
        s4="B";		  
	}
	else if(e.getSource()==b3)
	{
	System.exit(0);
	}
	String result=String.valueOf(d);
	//String result1=String.valueOf(s4);
	tf4.setText(result);
	tf5.setText(s4);
}
}

