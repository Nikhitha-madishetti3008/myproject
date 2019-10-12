import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="ScrollBarDemo" width=500 height=500></applet>*/
public class ScrollBarDemo extends Applet implements AdjustmentListener
{
Scrollbar hsb,vsb;
int hr,vr;
public void init()
{
hsb=new Scrollbar(Scrollbar.HORIZONTAL,10,100,10,1000);
vsb=new Scrollbar(Scrollbar.VERTICAL,10,100,10,1000);
add(hsb);
add(vsb);
hsb.addAdjustmentListener(this);
vsb.addAdjustmentListener(this);
}
public void adjustmentValueChanged(AdjustmentEvent ae)
{
hr=hsb.getValue();
vr=vsb.getValue();
repaint();
}
public void paint(Graphics g)
{
g.setColor(Color.red);
g.fillOval(20,20,hr,vr);
}
}