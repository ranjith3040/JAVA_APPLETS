import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="apptext.class" height=400 width=400></applet>*/
public class apptext extends Applet implements FocusListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
public void init()
{
l1=new Label("Enter A value");
l2=new Label("Enter B value");
l3=new Label("Resut is");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);
t2.addFocusListener(this);
}
public void focusGained(FocusEvent fe)
{}
public void focusLost(FocusEvent fe)
{
int a,b,c;
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a+b;
t3.setText(Integer.toString(c));
}
}