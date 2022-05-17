import java.io.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code="appareaz.class" height=800 width=800>
</applet> */
public class appareaz extends Applet implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2,b3,b4;
public void init()
{
l1=new Label("Enter I st value");
l2=new Label("Enter II nd value");
l3=new Label("Result");
t1=new TextField(30);
t2=new TextField(30);
t3=new TextField(30);
b1=new Button("Triangle");
b2=new Button("Rectangle");
b3=new Button("Square");
b4=new Button("circle");
add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);
add(b1);add(b2);
add(b3);add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
double a,b,c;
a=Double.parseDouble(t1.getText());
b=Double.parseDouble(t2.getText());
c=0;
if(ae.getActionCommand()=="Triangle")
{
c=0.5*a*b;
}
if(ae.getActionCommand()=="Rectangle")
{
c=a*b;
}
if(ae.getActionCommand()=="Square")
{
c=a*b;
}
if(ae.getActionCommand()=="circle")
{
c=3.14*a*b;
}
t3.setText(Double.toString(c));
}
}