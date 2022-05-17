import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="frame.class" height=300 width=300></applet> */
class win1 extends Frame
{
win1(String title)
{
setLayout(new GridLayout(1,1));
}
public void paint(Graphics g)
{
g.drawString("My Window",100,100);
}
}
public class frame extends Applet implements ActionListener
{
win1 w;
Button b1,b2;
public void init()
{
b1=new Button("show window");
b2=new Button("hide window");
w=new win1("My own window");
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