import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="appcube.class" height=400 width=400>
</applet> */
public class appcube extends Applet implements ActionListener
{
Label l1,l2;
TextField t1,t2;
Button b;
public void init()
{
l1=new Label("Enter the number :");
l2=new Label("Cube of Number :");
t1=new TextField(20);
t2=new TextField(20);
b=new Button("Cube");
add(l1);add(t1);
add(l2);add(t2);
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
int n,c;
n=Integer.parseInt(t1.getText());
c=n*n*n;
t2.setText(Integer.toString(c));
}
}
