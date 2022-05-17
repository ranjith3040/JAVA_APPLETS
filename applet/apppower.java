import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="apppower.class" height=500 width=500> </applet> */
public class apppower extends Applet implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b;

public void init()
{
l1=new Label("Enter the number : ");
l2=new Label("Enter the power :");
l3=new Label("Value :");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
b=new Button("Click");
add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
double a,b,n;
n=Double.parseDouble(t1.getText());
a=Double.parseDouble(t2.getText());
b=Math.pow(n,a);
t3.setText(Double.toString(b));
}
}