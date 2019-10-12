import java.awt.*;
import java.applet.*;
/*<applet code="PanelDemo" width=500 height=500></applet>*/
public class PanelDemo extends Applet
{
public void init()
{
setLayout(new BorderLayout());
Panel p1=new Panel();
p1.setBackground(Color.blue);
p1.add(new Button("hello"));
p1.add(new Button("hi"));
p1.add(new Button("hai"));
add(p1,BorderLayout.NORTH);
Panel p2=new Panel();
p2.setBackground(Color.yellow);
p2.add(new Button("how"));
p2.add(new Button("are you"));
add(p2,BorderLayout.EAST);
Panel p3=new Panel();
p3.setBackground(Color.green);
p3.setLayout(new GridLayout(2,2));
p3.add(new Button("welcome"));
p3.add(new Button("II year"));
p3.add(new Button("I sem"));
p3.add(new Button("cse a"));
add(p3,BorderLayout.CENTER);
}
}