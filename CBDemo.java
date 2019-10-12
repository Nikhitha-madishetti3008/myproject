import java.awt.*;
import java.applet.*;
/*<applet code="CBDemo" width=500 height=500></applet>*/
public class CBDemo extends Applet
{
public void init()
{
Checkbox cb1=new Checkbox();
cb1.setLabel("My Checkbox 1");
Checkbox cb2=new Checkbox("My Checkbox 2",true);
add(cb1);
add(cb2);
}
}import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author Harikaraj
 */
public class Test2 extends Applet implements MouseListener,MouseMotionListener{
int x=0,y=0;
String msg="MouseEvent";

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
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
    public void mouseReleased(MouseEvent m){
        showStatus("mouse released");
    }
    public void mouseDragged(MouseEvent m){
        showStatus("mouse dragged");
    }
    public void mouseClicked(MouseEvent m){
        showStatus("mouse clicked");
    }
    public void paint(Graphics g){
        g.drawString(msg, 100, 100);
    }
}
        // TODO start asynchronous download of heavy resources
 
