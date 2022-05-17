import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="appbutt.class" height=400 width=400></applet>*/
public class appbutt extends Applet implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2,b3,b4;
public void init()
{
l1=new Label("Enter A value");
l2=new Label("Enter B value");
l3=new Label("Result is");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
b1=new Button("Multiply");
b2=new Button("Modulus");
b3=new Button("Divide");
b4=new Button("Fact");
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
int a,b,c,i;
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=0;

if(ae.getActionCommand()=="Multiply")
{
c=a*b;
}
t3.setText(Integer.toString(c));

if(ae.getActionCommand()=="Modulus")
{
c=a%b;
}
t3.setText(Integer.toString(c));

if(ae.getActionCommand()=="Divide")
{
c=a/b;
}
t3.setText(Integer.toString(c));
if(ae.getActionCommand()=="Fact")
{
c=1;
for(i=1;i<=a;i++)
{
c=c*i;
}

t3.setText(Integer.toString(c));
}
}
}