import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="RBDemo" width=500 height=500></applet>*/
public class RBDemo extends Applet implements ItemListener
{
CheckboxGroup cbg;	
Checkbox cb1;
Checkbox  cb2;
Checkbox cb3;
public void init()
{
cbg=new CheckboxGroup();
cb1=new Checkbox("c",cbg,false);
cb2=new Checkbox("data structures",cbg,false);
cb3=new Checkbox("OOPC-Java",cbg,false);
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
Checkbox chk=cbg.getSelectedCheckbox();
g.drawString(chk.getLabel()+"is slected",10,80);
}
}
