import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="Java6" width=500 height=500>
</applet>
*/
public class Java6 extends Applet implements ItemListener,ActionListener
{
Choice Category=null;
Button b1;
Label l1,l2;
TextField tf1;
TextArea t1;
public void init()
{
Label l1=new Label("Title");
Label l2=new Label("Name");
tf1=new TextField();
t1=new TextArea();
Category=new Choice();
Category.add("Mr");
Category.add("Miss");
Category.add("Mrs");
b1=new Button("Add");
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
String s1=Category.getSelectedItem();
String s2=tf1.getText();
String s3;
s3=s1.concat(s2);
t1.setText(s3);
}
}