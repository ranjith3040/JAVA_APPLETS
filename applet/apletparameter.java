import java.applet.*;
import java.awt.*;
public class apletparameter extends Applet
{
private String strDefault="Hello! Java Applet.";
public void paint(Graphics g)
{
String strParameter = this.getParameter("Message");
if(strParameter == null)
strParameter = strDefault;
g.drawString(strParameter,50,25);
}
}