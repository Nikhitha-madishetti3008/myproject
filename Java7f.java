import java.awt.*;
import java.awt.event.*;
public class Java7f extends Frame implements ActionListener
{
TextField tf1,tf2,tf3,tf4;
Button b1,b2;
Label l1,l2,l3,l4;
Java7f()
{
   Label l1=new Label("Principal");
	l1.setBounds(20,50,150,20);
    Label l2=new Label("Rate of interest");
    l2.setBounds(20,100,150,20);
	Label l3=new Label("Time(years)");
    l3.setBounds(20,150,150,20);
	Label l4=new Label("Interest");
	l4.setBounds(20,200,150,20);
	tf1=new TextField();    
	tf1.setBounds(150,50,150,20);
	tf2=new TextField();    
	tf2.setBounds(150,100,150,20);
	tf3=new TextField();
    tf3.setBounds(150,150,150,20);
	tf4=new TextField();
	tf4.setBounds(150,200,250,20);
	tf4.setEditable(false);
	b1=new Button("Calculate");
	b1.setBounds(300,50,150,20);
	b2=new Button("Cancel");
	b2.setBounds(300,100,150,20);
	add(l1);
	add(tf1);
	add(b1);
	add(l2);
	add(tf2);
	add(b2);
    add(l3);
	add(tf3);
	add(l4);
	add(tf4);
	b1.addActionListener(this);
	b2.addActionListener(this);
	setSize(300,300);
    setLayout(null);
    setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
	String s=e.getActionCommand();
	String s1=tf1.getText();
	String s2=tf2.getText();
	String s3=tf3.getText();
	int a=Integer.parseInt(s1);
	int b=Integer.parseInt(s2);
	int c=Integer.parseInt(s3);
	int d=0;
	if(s.equals("calculate"))
	{
		d=(a*b*c)/100;
		String result=String.valueOf(d);
	tf4.setText(result);
	}
	else if(s.equals("cancel"))
	{
		tf1.setText(" ");
		tf2.setText(" ");
		tf3.setText(" ");
		tf4.setText(" ");
	}
}
	public static void main(String args[])
	{
	 new Java7f();
	}
}

