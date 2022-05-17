
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="appflames1.class" height=500 width=500 bgcolor="blue">
</applet> */
public class appflames1 extends Applet implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b;
public void init()
{
l1=new Label("Your Name : ");
l2=new Label("Your Partner Name : ");
l3=new Label("Result : ");
t1=new TextField(60);
t2=new TextField(60);
t3=new TextField(50);
b=new Button("Relation");
add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String name1,name2 ;
  
    name1=(t1.getText());
    
    name2=(t2.getText());
    String s1 = name1;
    String s2 = name2;
    for (int i = 0; i < name1.length(); i++) {
        for (int j = 0; j < name2.length(); j++) {
            if (name1.charAt(i) == name2.charAt(j)) {
            name1 = name1.replaceFirst(String.valueOf(name1.charAt(i)), "#");
            name2 = name2.replaceFirst(String.valueOf(name2.charAt(j)), "#");
            }
        }
    }
    String result = name1 + name2;
    result = result.replaceAll("#", "");
    int resultLength = result.length();
    String baseInput = "flames";
    char relationIs = 0;
    int temp = 0;
    if (resultLength > 0) {
        temp = resultLength % baseInput.length();
    }
    if (temp == 0 && resultLength >= 6) {
        relationIs = 's';
    } else {
        int count = temp - 1;
        if (count >= 0) {
            relationIs = baseInput.charAt(count);
      
        }
    }
    switch (relationIs) {
        case 'f':
            t3.setText("friendship");
            break;
        case 'l':
            t3.setText("Lovers");
            break;
        case 'a':
            t3.setText("Affection");
            break;
        case 'm':
            t3.setText("Marriage");
            break;
        case 'e':
           t3.setText("Enemy");
            break;
        case 's':
            t3.setText("Brother or Sister");
            break;
        default:
            t3.setText("FLAME Test works only for different names");
            break;
    }
}}
