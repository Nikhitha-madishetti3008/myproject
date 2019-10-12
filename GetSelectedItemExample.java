import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/*<applet code="GetSelectedItemExample" width=200 height=200></applet>*/
public class GetSelectedItemExample extends Applet implements ItemListener,ActionListener
{
Choice Categiory=null;
Label l1,l2;
TextArea t;
Button b1;
public void init()
{
	l1=new Label("Title");
	l2=new Label("name");
	t=new TextArea();
	b1=new Button("add");
Categiory=new Choice();
Categiory.add("mr");
Categiory.add("miss");
Categiory.add("ms");
add(Categiory);
add(l1);
add(l2);
add(t);
add(b1);
Categiory.addItemListener(this);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
	String s1=Categiory.getSelectedItem();
	String s2=t.getText();
	if(e.getSource()==b1)
	{
		s1.concat(s2);
	}
	String result=String.valueOf(result);
	t.setText(result);
}
public void paint(Graphics g){
g.drawString(Categiory.getSelectedItem(),10,70);
}
public void itemStateChanged(ItemEvent ie){
repaint();
}
}


