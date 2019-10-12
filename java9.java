import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="java9"width=400 height=400></applet>*/
public class java9 extends Applet implements ActionListener
{
TextField tf1,tf2;
Button b1;
Label l1;
public void init()
{
Label l1=new Label("enter a number");
//l1.setBounds(30,50,150,20);
tf1=new TextField();
//tf1.setBounds(50,50,200,20);
tf2=new TextField();
//tf2.setBounds(50,200,200,20);
b1=new Button("Check");
//b1.setBounds(50,100,50,20);
add(l1);
add(tf1);
add(b1);
add(tf2);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
	String s=e.getActionCommand();
String s1=tf1.getText();
String s2=null;
int a=Integer.parseInt(s1);
if(s.equals("Check"))
{
	if(a>=0)
		s2="positive";
	else
		s2="negative";
}
tf2.setText(s2);
}
}
	
	
