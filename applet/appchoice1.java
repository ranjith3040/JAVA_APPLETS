import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="appchoice1.class" height=400 width=400> 
</applet> */
public class appchoice1 extends Applet implements ItemListener
{
Choice course;
TextField t1;
Label l1,l2;
public void init()
{
l1=new Label("Select Course Name :");
course=new Choice();
t1=new TextField(15);
l2=new Label("Fees Allowted");
course.add("DBS");
course.add("DOA");
course.add("DCA");
course.add("PGDCA");
add(l1);add(course);
add(l2);add(t1);
course.addItemListener(this);
}
public void itemStateChanged(ItemEvent ie)
{
String st;
st=course.getSelectedItem();
if(st=="DBS")
{
t1.setText("2400");
}

if(st=="DOA")
{
t1.setText("3200");
}
if(st=="DCA")
{
t1.setText("5800");
}
if(st=="PGDCA")
{
t1.setText("14000");
}

}
}