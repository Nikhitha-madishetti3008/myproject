import java.awt.*;
import java.awt.event.*;
/*<applet code="propass" width=400 height=400></applet>*/
public class propass extends Frame implements ActionListener
{
	Label l1,l2;
TextField tf1,tf2,tf3,tf4;
Button b1;
propass()
{
	l1=new Label("userId");
	l1.setBounds(30,50,150,20);
tf1=new TextField();
tf4=new TextField();
tf3=new TextField();
tf1.setBounds(100,50,150,20);
l2=new Label("password");
l2.setBounds(30,100,150,20);
tf2=new TextField();
tf2.setBounds(100,100,150,20);
tf2.setEchoChar('*');
b1=new Button("submit");
b1.setBounds(50,200,50,50);
b1.addActionListener(this);
add(l1);
add(tf1);
add(l2);
add(tf2);
add(b1);
add(tf3);
add(tf4);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
	String s=e.getActionCommand();
	String s1=tf1.setText(tf3.getText());
	String s2=tf2.setText(tf4.getText());
	String temp;
if(e.getSource()==b1)
{
	temp=s1;
	s2=temp;
}
}
public static void main(String args[])
{
	new propass();
}
}