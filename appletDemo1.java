import java.applet.Applet;
import java.awt.*;
/*<applet code="appletDemo1"height=400 width=400></applet>*/
public class appletDemo1 extends Applet 
{
String msg="hai";	
public void init()
    {
   setBackground(Color.gray);
    setForeground(Color.blue); 
}
public void paint(Graphics g)
{
    g.drawString(msg,100,100);   
}
}
    
    