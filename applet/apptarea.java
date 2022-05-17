import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="apptarea.class" height=400 width=400></applet> */
public class apptarea extends Applet
{
public void init()
{
String msg;
msg="Raghu,\n 34 Anna street,\n Salem";
Label l1=new Label("Address");
TextArea t1=new TextArea(msg,5,20);
add(l1);
add(t1);
}
}