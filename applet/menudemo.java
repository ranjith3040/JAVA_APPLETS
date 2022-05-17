import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="menudemo.class" height=300 width=300> </applet> */
class win1 extends Frame implements ActionListener
{
MenuBar mymenu;
Menu file,edit,exit;
MenuItem f1,f2,f3,e1,e2,e3;
win1(String title)
{
super(title);
setLayout(new GridLayout(1,1));
mymenu=new MenuBar();
file=new Menu("File");
edit=new Menu("Edit");
exit=new Menu("Exit");
f1=new MenuItem("Open");
f2=new MenuItem("Close");
f3=new MenuItem("Exit");
file.add(f1);
file.add(f2);
file.add(f3);
f1.addActionListener(this);
f2.addActionListener(this);
f3.addActionListener(this);
e1=new MenuItem("Copy");
e2=new MenuItem("Cut");
e3=new MenuItem("Paste");
e1.addActionListener(this);
e2.addActionListener(this);
e3.addActionListener(this);
edit.add(e1);
edit.add(e2);
edit.add(e3);
mymenu.add(file);
mymenu.add(edit);
mymenu.add(exit);
setMenuBar(mymenu);
}
public void actionPerformed(ActionEvent ae)
{}
}
public class menudemo extends Applet implements ActionListener
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