import java.applet.Applet;
import java.awt.*;
/*<applet code="appletDemo2"height=400 width=400></applet>*/
public class appletDemo2 extends Applet 
{
String msg="hai";	
public void paint(Graphics g)
{
    g.drawString(msg,100,100);  
 Color c=new Color(200,100,200);
    setForeground(c);	
}
}