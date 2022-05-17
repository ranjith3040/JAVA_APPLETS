import java.awt.*;
import java.applet.*;
/* <applet code="banner.class" height=400 width=400></applet> */
public class banner extends Applet implements Runnable
{
String msg="A Simple Moving Banner";
Thread t=null;
int state;
boolean stopf;
public void init()
{
setBackground(Color.cyan);
setForeground(Color.red);
}
public void start()

{
t=new Thread(this);
stopf=false;
t.start();
}
public void run()
{
char ch;
for(;;)
{
try
{
repaint();
Thread.sleep(250);
ch=msg.charAt(0);
msg=msg.substring(1,msg.length());
msg=msg+ch;
if(stopf)
break;
}
catch(InterruptedException ie)
{}
}
}
public void stop()
{
stopf=true;
t=null;
}
public void paint(Graphics g)
{
g.drawString(msg,50,30);
}
}