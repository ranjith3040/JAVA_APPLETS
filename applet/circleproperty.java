import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="circleproperty.class" height=500 width=500>
</applet> */
public class circleproperty extends Applet implements ActionListener
{
Label l1,l2,l3,l4;
TextField t1,t2,t3,t4;
Button b;
public void init()
{
l1=new Label("Enter the radius :");
l2=new Label("Diameter :");
l3=new Label("Circumference :");
l4=new Label("Area :");
t1=new TextField(50);
t2=new TextField(50);
t3=new TextField(50);
t4=new TextField(50);
b=new Button("Calculate");
add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);
add(l4);add(t4);
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
double n,d,c,a;
n=Integer.parseInt(t1.getText());
d=2*n;
c=3.14*d;
a=3.14*n*n;
t2.setText(Double.toString(d));
t3.setText(Double.toString(c));
t4.setText(Double.toString(a));
}
}
