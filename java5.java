import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="java5" width=500 height=500>
</applet>
*/
public class java5 extends Applet implements ActionListener,ItemListener
{
List list=null;
Button b1;
Label l1,l2;
TextField tf1;
TextArea t1;
public void init()
{
l1=new Label("Title");
Label l2=new Label("Name");
tf1=new TextField();
t1=new TextArea();
list=new List(3,false);
list.add("Mr");
list.add("Miss");
list.add("Mrs");
b1=new Button("Add");
add(l1);
add(list);
add(l2);
add(tf1);
add(t1);
add(b1);
b1.addActionListener(this);
list.addItemListener(this);
}
public void paint(Graphics g)
{
	g.drawString(list.getSelectedItem(),10,70);
	
}
public void itemStateChanged(ItemEvent ie)
{
repaint();
}
public void actionPerformed(ActionEvent e)
{
String s1=list.getSelectedItem();
String s2=tf1.getText();
String s3;
s3=s1.concat(s2);
t1.setText(s3);
}
}