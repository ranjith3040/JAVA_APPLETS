import java.awt.*;
import java.applet.*;
import java.awt.Font;
import java.awt.Graphics;
public class appfont extends Applet
{
public void paint(Graphics g)
{
Font fp=new Font("TimesRoman",Font.PLAIN,18);
Font fb=new Font("TimesRoman",Font.BOLD,20);
Font fi=new Font("TimesRoman",Font.ITALIC,16);
Font fbi=new Font("Arial",Font.BOLD+Font.ITALIC,20);
g.setFont(fp);
g.drawString("This is Plain Text",100,100);
g.setFont(fb);
g.drawString("This is Bold text",100,200);
g.setFont(fi);
g.drawString("This is italic text",100,300);
g.setFont(fbi);
g.drawString("This is Bold Italic Text",100,400);
}
}