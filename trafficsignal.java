import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="trafficsignal"width=400 height=400>
</applet>
*/
public class trafficsignal extends Applet
{
public void paint(Graphics g)
{
	while(true)
	{
		try
		{
	g.setColor(Color.green);
    g.drawString("north",150,100);
	g.drawLine(150,100,150,200);
	g.setColor(Color.red);
	g.drawString("south",150,210);
	g.setColor(Color.red);
	g.drawString("east",200,150);
	g.setColor(Color.red);
	g.drawLine(100,150,200,150);
g.drawString("west",70,150);
Thread.sleep(6000);

g.setColor(Color.red);
g.drawString("north",150,100);
	g.drawLine(150,100,150,200);
	g.setColor(Color.red);
	g.drawString("south",150,210);
	g.setColor(Color.green);
	g.drawString("east",200,150);
	g.setColor(Color.red);
	g.drawLine(100,150,200,150);
g.drawString("west",70,150);
Thread.sleep(6000);

g.setColor(Color.red);
g.drawString("north",150,100);
	g.drawLine(150,100,150,200);
	g.setColor(Color.green);
	g.drawString("south",150,210);
	g.setColor(Color.red);
	g.drawString("east",200,150);
	g.setColor(Color.red);
	g.drawLine(100,150,200,150);
g.drawString("west",70,150);
Thread.sleep(6000);
	
g.setColor(Color.red);
g.drawString("north",150,100);
	g.drawLine(150,100,150,200);
	g.setColor(Color.red);
	g.drawString("south",150,210);
	g.setColor(Color.red);
	g.drawString("east",200,150);
	g.setColor(Color.green);
	g.drawLine(100,150,200,150);
g.drawString("west",70,150);
Thread.sleep(6000);
}
catch(Exception e)
{
	System.out.println(e);
	}
}
}
}