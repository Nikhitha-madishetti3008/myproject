import java.applet.Applet;
import java.awt.*;
public class para1 extends Applet
{
public void paint(Graphics g)
{
    String name;
    int age;
    name=getParameter("n");
    age=Integer.parseInt(getParameter("a"));
    g.drawString("your name is"+name,100,100);
g.drawString("my age is:"+age, 100, 120);
}
}
  