import java.awt.event.*;
import java.awt.*;
import java.applet.*;
/*<applet code="ButtonDemo" width=200 height=200></applet>*/
public class ButtonDemo extends Applet implements ActionListener 
{
	String  msg="";
    Button red,green;
    public void init() 
	{
        red=new Button("red");
        green=new Button("green");
        add(red);
        add(green);
        red.addActionListener(this);
        green.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        String Str=ae.getActionCommand();
        if
			(Str.equals("red")){
			setBackground(Color.red);
               }
        else {
			setBackground(Color.green);
       }
      }
}