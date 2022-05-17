import java.awt.*;
import java.applet.*;
public class appcolor extends Applet
{
Font f;
public void init()
{
setBackground(Color.blue);
setForeground(Color.red);
f=new Font("TimesRoman",Font.BOLD,20);
}
public void paint(Graphics g)
{
g.setFont(f);
g.drawString("Have a nice day",100,100);
}
}