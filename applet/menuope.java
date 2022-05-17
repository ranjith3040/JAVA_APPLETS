import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="menuope.class" height=300 width=300> 
</applet> */
class win1 extends Frame implements ActionListener
{
MenuBar mymenu;
Menu operations,colors;
MenuItem o1,o2,o3,o4,c1,c2,c3;
Label l1,l2,l3;
TextField t1,t2,t3;
win1(String title)
{
super(title);
setLayout(new GridLayout(1,1));
mymenu=new MenuBar();
operations=new Menu("Operations");
colors=new Menu("Colors");
o1=new MenuItem("Add");
o2=new MenuItem("Sub");
o3=new MenuItem("Mul");
o4=new MenuItem("Div");
operations.add(o1);
operations.add(o2);
operations.add(o3);
operations.add(o4);
o1.addActionListener(this);
o2.addActionListener(this);
o3.addActionListener(this);
o4.addActionListener(this);
c1=new MenuItem("Red");
c2=new MenuItem("Blue");
c3=new MenuItem("Green");
c1.addActionListener(this);
c2.addActionListener(this);
c3.addActionListener(this);
colors.add(c1);
colors.add(c2);
colors.add(c3);
mymenu.add(operations);
mymenu.add(colors);
setMenuBar(mymenu);
l1=new Label("Enter A value");
l2=new Label("Enter B value");
l3=new Label("Result :");
t1=new TextField(15);
t2=new TextField(15);
t3=new TextField(15);
add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);
}
public void actionPerformed(ActionEvent ae)
{
int a,b,c;
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=0;
if(ae.getSource()==o1)
{
c=a+b;
}
if(ae.getSource()==o2)
{
c=a-b;
}
if(ae.getSource()==o3)
{
c=a*b;
}
if(ae.getSource()==o4)
{
c=a/b;
}
t3.setText(Integer.toString(c));
if(ae.getSource()==c1)
{
setBackground(Color.red);
}
if(ae.getSource()==c2)
{
setBackground(Color.blue);
}
if(ae.getSource()==c3)
{
setBackground(Color.green);
}
}
}
public class menuope extends Applet implements ActionListener
{
win1 w;
Button b1,b2;
public void init()
{
b1=new Button("Show Window");
b2=new Button("Hide Window");
w=new win1("My Own Window");
add(b1);
add(b2);
w.setSize(200,200);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
w.setVisible(true);
else if(ae.getSource()==b2)
w.setVisible(false);
}
}