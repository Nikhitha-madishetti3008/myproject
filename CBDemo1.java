import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="CBDemo1" width=500 height=500></applet>*/
public class CBDemo1 extends Applet implements ItemListener
{	
Checkbox cb1;
Checkbox  cb2;
Checkbox cb3;
public void init()
{
cb1=new Checkbox("c");
cb2=new Checkbox("data structures");
cb3=new Checkbox("OOPC-Java");
add(cb1);
add(cb2);
add(cb3);
cb1.addItemListener(this);
cb2.addItemListener(this);
cb3.addItemListener(this);
}
public void itemStateChanged(ItemEvent ie)
{
repaint();
}
public void paint(Graphics g)
{
g.drawString("C:"+cb1.getState(),10,80);
g.drawString("DS"+cb2.getState(),10,100);
g.drawString("OOPC:"+cb3.getState(),10,120);
}
}