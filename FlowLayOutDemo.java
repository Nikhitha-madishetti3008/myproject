import java.awt.*;
class FlowLayoutDemo
{
public static void main(String args[])
{
Frame f=new Frame();
f.setTitle("my frame");
f.setBackground(Color.cyan);
f.setForeground(Color.red);
f.setLayout(new FlowLayout());
Button b1=new Button("submit");
Button b2=new Button("cancel");
f.add(b1);
f.add(b2);
f.setSize(500,300);
f.setVisible(true);
}
}