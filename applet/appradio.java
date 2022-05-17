import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="appradio.class" height=400 width=400>
</applet> */
public class appradio extends Applet implements ItemListener
{
CheckboxGroup cg;
Checkbox c1,c2;
TextField t1,t2,t3;
Label l1,l2,l3,l4;
public void init()
{
l1=new Label("Enter Name : ");
l2=new Label("Enter Age : ");
l3=new Label("Enter Sex : ");
l4=new Label("Result : ");
t1=new TextField(15);
t2=new TextField(15);
t3=new TextField(30);
cg=new CheckboxGroup();
c1=new Checkbox("Male",cg,false);
c2=new Checkbox("Female",cg,false);

add(l1);add(t1);
add(l2);add(t2);
add(l3);add(c1);add(c2);
add(l4);add(t3);
c1.addItemListener(this);
c2.addItemListener(this);
}
public void itemStateChanged(ItemEvent ie)
{
String st;
int age;
age=Integer.parseInt(t2.getText());
st=cg.getSelectedCheckbox().getLabel();
if(st=="Male" && age>21)
t3.setText(t1.getText()+" is Eligible to the job");
else if(st=="Female" && age>18)
t3.setText(t1.getText()+" is Eligible to the job");
else
t3.setText(t1.getText()+" is Not Eligible to job");
}
}