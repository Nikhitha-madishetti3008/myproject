import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="TAExample" width=500 height=500></applet>*/
public class TAExample extends Applet implements ActionListener
{
Label l1,l2;
TextArea t;
Button b;
public void init()
{
l1=new Label("word length");
l2=new Label("char length");
t=new TextArea();
b=new Button("count words");
add(l1);
add(l2);
add(t);
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String text=t.getText();
String words[]=text.split("\\s");
l1.setText("words:"+words.length);
l2.setText("characters:"+text.length());
}
}