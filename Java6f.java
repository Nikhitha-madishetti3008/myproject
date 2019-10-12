import java.awt.*;
import java.awt.event.*;
public class Java6f extends Frame implements ItemListener,ActionListener
{
Choice Category=null;
Button b1;
Label l1,l2;
TextField tf1;
TextArea t1;
Java6f()
{
Label l1=new Label("Title");
l1.setBounds(50,50,150,20);
Category=new Choice();
Category.add("Mr");
Category.add("Miss");
Category.add("Mrs");
Label l2=new Label("Name");
l2.setBounds(50,100,150,20);
tf1=new TextField();
tf1.setBounds(100,100,150,20);
t1=new TextArea();
t1.setBounds(50,200,150,20);
b1=new Button("Add");
b1.setBounds(100,150,150,20);
add(l1);
add(Category);
add(l2);
add(tf1);
add(t1);
add(b1);
b1.addActionListener(this);
Category.addItemListener(this);
}
public void paint(Graphics g)
{
	g.drawString(Category.getSelectedItem(),10,70);
	
}
public void itemStateChanged(ItemEvent ie)
{
repaint();
}
public void actionPerformed(ActionEvent e)
{
	String s=e.getActionCommand();
String s1=Category.getSelectedItem();
String s2=tf1.getText();
String s3;
s3=s1.concat(s2);
t1.setText(s3);
}
public static void main(String args[])
{
new Java6f();
}
}