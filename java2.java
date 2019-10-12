import java.awt.*;
import java.awt.event.*;
public class java2 extends Frame implements ActionListener
{
TextField tf1,tf2,tf3;
Button b1;
TextArea t;
Label l1,l2,l3;
java2()
{
l1=new Label("First name");
l1.setBounds(50,50,150,20);
tf1=new TextField();
tf1.setBounds(150,50,150,20);
l2=new Label("second name");
l2.setBounds(50,100,150,20);
tf2=new TextField();
tf2.setBounds(150,100,150,20);
l3=new Label("last name");
l3.setBounds(50,150,150,20);
tf3=new TextField();
tf3.setBounds(150,150,150,20);
b1=new Button("Append");
b1.setBounds(50,200,50,50);
t=new TextArea();
t.setBounds(150,250,150,20);
b1.addActionListener(this);
add(tf1);
add(l1);
add(tf2);
add(l2);
add(tf3);
add(l3);
add(b1);
add(t);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
String s1=tf1.getText();
String s2=tf2.getText();
String s3=tf3.getText();
String s4="";
s4=s1+s2+s3;
t.setText(s4);
}
public static void main(String args[])
{
new java2();
}
}