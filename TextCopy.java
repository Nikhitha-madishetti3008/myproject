import java.awt.*;
import java.awt.event.*;
/*<applet code="TextCopy" width=400 height=400></applet>*/
public class TextCopy extends Frame implements ActionListener
{
TextField tf1,tf2;
Button b1;
TextCopy()
{
tf1=new TextField();
tf1.setBounds(50,50,150,20);
tf2=new TextField();
tf2.setBounds(50,100,150,20);
b1=new Button("copy");
b1.setBounds(50,200,50,50);
b1.addActionListener(this);
add(tf1);
add(tf2);
add(b1);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
	String a=tf1.getText();
	String b;
	String temp;
if(e.getSource()==b1)
{
	temp=a;
	b=temp;
}
String result=String.valueOf(a);
String result1=String.valueOf(a);;
tf1.setText(result);
tf2.setText(result1);
}
public static void main(String args[])
{
	new TextCopy();
}
}