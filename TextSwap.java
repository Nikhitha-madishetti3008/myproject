import java.awt.*;
import java.awt.event.*;
/*<applet code="TextSwap" width=400 height=400></applet>*/
public class TextSwap extends Frame implements ActionListener
{
TextField tf1,tf2;
Button b1;
TextSwap()
{
tf1=new TextField();
tf1.setBounds(50,50,150,20);
tf2=new TextField();
tf2.setBounds(50,100,150,20);
b1=new Button("swap");
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
	String s1=tf1.getText();
	String s2=tf2.getText();
	String temp;
if(e.getSource()==b1)
{
	temp=s1;
	s1=s2;
	s2=temp;
}
String result=String.valueOf(s1);
String result1=String.valueOf(s2);
tf1.setText(result);
tf2.setText(result1);
}
public static void main(String args[])
{
	new TextSwap();
}
}