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
TextField tf1,tf2,tf3,tf4,tf5,tf6,tf6,tf7,tf8;
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
l4=new Label("year"):
tf4=new TextField();
 b1=new Button("submit"):
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
 add(l3)
 add(tf3);
 add(l4);
 add(tf4);
 add(l4);
 add(b1);
 add(b2);
 add(ta);
 tf1.addActionListener();
 tf2.addActionListener();
 tf4.addActionListener();
 tf3.addActionListener();
  tf5.addActionListener();
 tf6.addActionListener();
 tf7.addActionListener();
 tf8.addActionListener();
 b1.addActionListener();
 b2.addActionListener();
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
 FileinputStream fis=new FileinputStream("D:\myjava\details.class ");
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
 tf1.getText(" ");
  tf2.getText(" ");
  tf3.getText(" ");
  tf4.getText(" ");
  }
  }
 