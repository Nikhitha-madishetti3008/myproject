import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class TextFieldExample1 extends Applet implements ActionListener
{
TextField tf1,tf2,tf3;
Button b1,b2;
t.TextArea()
{
Label l=new Label("first name");
Label l1=new Label("second name");
Label l3=new Label("last name");
TextFieldExample1()
{
tf1=new TextField();
tf1.setBounds(50,50,150,20);
tf2=new TextField();
tf2.setBounds(50,100,150,20);
tf3=new TextField();
tf3.setBounds(50,150,150,20);
tf3=new TextField();
b1=new Button("Concatinate");
b1.setBounds(50,200,50,50);
b2=new Button("Reset");
b2.setBounds(120,200,50,50);
add(tf1);
add(tf2);
add(tf3);
add(b1);
add(b2);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
String s1=tf1.getText();
String s2=tf2.getText();
String c;
}
public static void main(String args[])
{
new TextFieldExample1();
}
}