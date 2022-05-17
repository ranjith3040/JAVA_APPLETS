import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="appcheck.class" height=400 width=400>
</applet> */
public class appcheck extends Applet implements ActionListener
{
Checkbox c1,c2,c3;
TextField t1;
Label l1,l2,l3;
Button b1;
public void init()
{
l1=new Label("Select Any Options ");
l2=new Label("Result ");
l3=new Label("Your value ");
t1=new TextField(15);
b1=new Button("click");
c1=new Checkbox("Ten");
c2=new Checkbox("Twenty");
c3=new Checkbox("Thirty");
add(l1);add(c1);add(c2);add(c3);
add(l2);add(t1);
add(l3);add(b1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
int a,b,c,tot;
a=0;
b=0;
c=0;
if(c1.getState()==true)
a=10;
else
a=0;
if(c2.getState()==true)
b=20;
else
b=0;
if(c3.getState()==true)
c=30;
else;
c=0;
tot=a+b+c;
t1.setText(Integer.toString(tot));
}
}
