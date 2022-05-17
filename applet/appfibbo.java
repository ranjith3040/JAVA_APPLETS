import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="appfibbo.class" height=500 width=500>
</applet> */
public class appfibbo extends Applet implements ActionListener
{
Label l1,l2;
TextField t1,t2;
Button b;
public void init()
{
l1=new Label("Enter the number : ");
l2=new Label("Result : ");
t1=new TextField(20);
t2=new TextField(20);
b=new Button("Fibbo");
add(l1);add(t1);
add(l2);add(t2);
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
int n,count;
n=Integer.parseInt(t1.getText());
count=1;
for(int i=0;i<=n;i++)
{
count=count+i;
}
t2.setText(Integer.toString(count));
}
}