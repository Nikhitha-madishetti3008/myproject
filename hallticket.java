import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.io.*;
/*
<appletcode="hallticket"width=400 height=400>
</applet>
*/
public class hallticket extends Applet implements ActionListener
{
Label l1,l2,l3,l4;
TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
Button b1,b2;
TextArea ta;
public void init()
{
l1=new Label("student name");
tf1=new TextField();
l2=new Label("father name");
tf2=new TextField();
l3=new Label("roll no");
tf3=new TextField();
l4=new Label("year");
tf4=new TextField();
 b1=new Button("submit");
 b2=new Button("clear");
 ta=new TextArea(" ");
 tf5=new TextField();
 tf6=new TextField();
 tf7=new TextField();
 tf8=new TextField();
 add(l1);
 add(tf1);
 add(l2);
 add(tf2);
 add(l3);
 add(tf3);
 add(l4);
 add(tf4);
 add(l4);
 add(b1);
 add(b2);
 add(ta);
 add(tf5);
 add(tf6);
 add(tf7);
 add(tf6);
 tf1.addActionListener(this);
 tf2.addActionListener(this);
 tf4.addActionListener(this);
 tf3.addActionListener(this);
 tf5.addActionListener(this);
 tf6.addActionListener(this);
 tf7.addActionListener(this);
 tf8.addActionListener(this);
 b1.addActionListener(this);
 b2.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
 if(ae.getSource()==b1)
 {
 tf5.setText(tf1.getText());
  tf6.setText(tf2.getText());
  tf7.setText(tf3.getText());
  tf8.setText(tf4.getText());
 try
 {
 FileInputStream fis=new FileInputStream("D:\\myjava\\details.txt");
 int i;
 while((i=fis.read())!=-1)
 ta.append(" "+(char)i);
 fis.close();
 }
 catch(Exception e)
 {
 }
 }
 else if(ae.getSource()==b2)
 {
 tf1.setText(" ");
  tf2.setText(" ");
  tf3.setText(" ");
  tf4.setText(" ");
  }
  }
}