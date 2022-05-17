import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="applist.class" height=400 width=400>
</applet> */
public class applist extends Applet implements ActionListener{
List li1;
TextField t1;
Label l1,l2;
public void init()
{
l1=new Label ("Choose Actor Name: ");
li1=new List(3,false);
t1=new TextField(20);
l2=new Label("Flim Name is ");
li1.add("Ajith");
li1.add("Vijay");
li1.add("Surya");
li1.add("Madavan");
add(l1);add(li1);
add(l2);add(t1);
li1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String st;
st=li1.getSelectedItem();
if(st=="Ajith");
t1.setText("Gritam");

if(st=="Vijay");
t1.setText("Bagavathi");


if(st=="Surya");
t1.setText("friends");


if(st=="Madavan");
t1.setText("Erandu");
}
}