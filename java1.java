import java.awt.*;
import java.awt.event.*;
/*
<applet code="java1"width=400 height=400>
<applet>
*/
public class java1 extends Frame implements ActionListener
{
TextField tf1,tf2;
Button b1;
Label l1,l2;
java1()
{
l1=new Label("Amount in rupees");
l1.setBounds(30,50,150,20);
tf1=new TextField();
tf1.setBounds(150,50,150,20);
l2=new Label("Amount in dollers");
l2.setBounds(30,100,150,20);
tf2=new TextField();
tf2.setBounds(150,100,150,20);
b1=new Button("convert");
b1.setBounds(50,200,50,50);
b1.addActionListener(this);
add(tf1);
add(l1);
add(tf2);
add(l2);
add(b1);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
String s1=tf1.getText();
double a=Double.parseDouble(s1);
double b=0;
if(e.getSource()==b1)
{
b=a/67;
}
String result=String.valueOf(b);
tf2.setText(result);
}
public static void main(String args[])
{
new java1();
}
}