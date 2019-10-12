import java.applet.*; 
import java.awt.*; 
 /*<applet code="appletParameter" width=400 height=400></applet>*/
public class appletParameter extends Applet 
{
  private String strDefault = "Hello! Java Applet.";
  public void paint(Graphics g) 
{
  String strParameter = this.getParameter("Message");
  if (strParameter == null)
 	 strParameter = strDefault;
  g.drawString(strParameter, 50, 25);
  } 
}


 
