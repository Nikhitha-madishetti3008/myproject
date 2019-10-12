import java.awt.*;
import java.awt.event.*;
public class myWindow extends Frame implements ActionListener
{
MenuBar mb;
public myWindow(String title)
{
super(title);
mb=new MenuBar();
setMenuBar(mb);
Menu m1,m2;
m1=new Menu("draw");
m2=new Menu("Colors");
MenuItem i1,i2,i3,i4,i5;
i1=new MenuItem("Line");
i2=new MenuItem("Rectangle");
i3=new MenuItem("Exit");
i4=new MenuItem("Green");
i5=new MenuItem("Red");
m1.add(i1);
m1.add(i2);
m1.add(i3);
m2.add(i4);
m2.add(i5);
mb.add(m1);
mb.add(m2);
i1.addActionListener(this);
i2.addActionListener(this);
i3.addActionListener(this);
i4.addActionListener(this);
i5.addActionListener(this);
addWindowListener(new myWindowHandler());
}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
Graphics g=getGraphics();
if(str.equals("Line"))
g.drawLine(100,100,200,300);
else if(str.equals("Rectangle"))
g.drawRect(160,60,100,80);
else if(str.equals("Green"))
setBackground(Color.green);
else if(str.equals("Red"))
setBackground(Color.red);
else if(str.equals("Exit"))
System.exit(1);
}
class myWindowHandler extends WindowAdapter
{
public void windowClosing(WindowEvent we)
{
dispose();
}
}
}
class menu1
{
public static void main(String args[])
{
myWindow m=new myWindow("frame window");
m.setSize(600,600);
m.setVisible(true);
}
}
