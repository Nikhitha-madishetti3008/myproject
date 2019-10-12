import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Test5" width=400 height=400></applet>*/
public class Test5 extends Applet implements MouseListener,MouseMotionListener
{
int x=0,y=0;
String msg="MouseEvents";
    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
        setBackground(Color.red);
        setForeground(Color.gray);
    }
    public void mouseEntered(MouseEvent m)
    {
	
        setBackground(Color.blue);
        showStatus("mouse entered");
        repaint();
    }
	public void mouseMoved(MouseEvent m)
	{
		msg="college";
		setBackground(Color.red);
		showStatus("mouse moved");
		repaint();
	}
    public void mouseExited(MouseEvent m){
         setBackground(Color.orange);
        showStatus("mouse clicked");
        repaint();
    }
    public void mousePressed(MouseEvent m){
        x=10;
        y=10;
        msg="sr";
        setBackground(Color.black);
        repaint();
    }
    public void mouseReleased(MouseEvent m)
	{
		x=10;
		y=10;
		msg="engineering";
        showStatus("mouse released");
    }
    public void mouseDragged(MouseEvent m)
	{
		x=m.getx();
		y=m.gety();
		msg="college";
        showStatus("mouse dragged");
    }
    public void mouseClicked(MouseEvent m){
        showStatus("mouse clicked");
    }
    public void paint(Graphics g){
        g.drawString(msg, 100, 100);
    }
}
   
 
