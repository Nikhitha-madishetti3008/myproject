import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<appletcode="Javaass7"width=400 height=400>
</applet>
*/
public class Javaass7 extends Applet implements ActionListener
{
TextField tf1,tf2,tf3,tf4;
Button b1,b2;
Label l1,l2,l3,l4;
public void init()
	{
   l1=new Label("Principal");
   tf1=new TextField();    
   b1=new Button("Calculate");
   l2=new Label("Rate of interest");
	tf2=new TextField();   
   b2=new Button("cancel");	
	l3=new Label("Time(years)");
	tf3=new TextField();
	l4=new Label("Interest");    
	tf4=new TextField();
	add(l1);
	add(tf1);
	add(b1);
	add(l2);
	add(tf2);
	add(b2);
    add(l3);
	add(tf3);
	add(l4);
	add(tf4);
	b1.addActionListener(this);
	b2.addActionListener(this);
	tf1.addActionListener(this);
	tf2.addActionListener(this);
	tf3.addActionListener(this);
	tf4.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
	String s=e.getActionCommand();
	String s1=tf1.getText();
	String s2=tf2.getText();
	String s3=tf3.getText();
	int a=Integer.parseInt(s1);
	int b=Integer.parseInt(s2);
	int c=Integer.parseInt(s3);
	int d=0;
	if(s.equals("calculate"))
	{
		d=(a*b*c)/100;
	String result=String.valueOf(d);
	tf4.setText(result);	
		}
	else if(s.equals("cancel"))
	{
		tf1.setText(" ");
		tf2.setText(" ");
		tf3.setText(" ");
		tf4.setText(" ");
	}
}
}