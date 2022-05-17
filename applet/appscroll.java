import java.io.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code="appscroll.class" height=500 width=500></applet> */
public class appscroll extends Applet implements AdjustmentListener
{
Scrollbar vsc,hsc;
TextField t1,t2;
Label l1,l2;
public void init()
{
vsc=new Scrollbar(Scrollbar.VERTICAL,1,1,1,100);
hsc=new Scrollbar(Scrollbar.HORIZONTAL,1,1,1,100);
l1=new Label("Vertical Scroll Bar Value is:");
l2=new Label("Horizontal Scroll Bar Value is:");
t1=new TextField(15);
t2=new TextField(15);
add(vsc);
add(l1);add(t1);
add(hsc);
add(l2);add(t2);
vsc.addAdjustmentListener(this);
hsc.addAdjustmentListener(this);
}
public void adjustmentValueChanged(AdjustmentEvent ae)
{
int n;
n=vsc.getValue();
t1.setText(String.valueOf(n));
n=hsc.getValue();
t2.setText(Integer.toString(n));
}
}