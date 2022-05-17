import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="apponeto999.class" height=400 width=400>
</applet> */
public class apponeto999 extends Applet implements ActionListener
{
Label l1,l2;
TextField t1,t2;
Button b1;
{
l1=new Label("Enter the number: ");
l2=new Label("Converted: ");
t1=new TextField(50);
t2=new TextField(50);
b1=new Button("convert");
add(l1);add(t1);
add(l2);add(t2);
add(b1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
int n,m=0,k=0;
		String S="";
		
		n=Integer.parseInt(t1.getText());
if(n<101) {
			m=n%10;
			k=n/10;
			
			
			
			if(k==2)
			{
				S="Twenty";
			}
			else if(k==3)
			{
				S="Thirty";
			}
			else if(k==4)
			{
				S="Fourty";
			}
			else if(k==5)
			{
				S="Fifty";
			}
			else if(k==6)
			{
				S="Sixty";
			}
			else if(k==7)
			{
				S="Seventy";
			}
			else if(k==8)
			{
				S="Eighty";
			}
			else if(k==9)
			{
				S="Ninty";
			}
			while(n>0) {
			if(n==10) {
				t2.setText("Ten");
				break;
			}
			else if(n==12) {
				t2.setText("Twelve");
				break;
			}
			else if(n==13) {
				t2.setText("Thirteen");
				break;
			}
			else if(n==15) {
				t2.setText("Fifteen");
				break;
			}
			else if(n==16) {
				t2.setText("Sixteen");
				break;
			}
			else if(n==17) {
				t2.setText("Seventeen");
				break;
			}
			else if(n==18) {
				t2.setText("Eighteen");
				break;
			}
			else if(n==19) {
				t2.setText("Ninteen");
				break;
			}
			else if(n==20) {
				t2.setText("Twenty");
				break;
			}
			else if(n==30) {
				t2.setText("Thirty");
				break;
			}
			else if(n==40) {
				t2.setText("Fourty");
				break;
			}
			else if(n==50) {
				t2.setText("Fifty");
				break;
			}
			else if(n==60) {
				t2.setText("Sixty");
				break;
			}
			else if(n==70) {
				t2.setText("Seventy");
				break;
			}
			else if(n==80) {
				t2.setText("Eighty");
				break;
			}
			else if(n==90) {
				t2.setText("Ninty");
				break;
			}
			else if(n==100){
				t2.setText("Hundred");
				break;
			}
			{
			 if(m==1) {
				t2.setText(S+" one");
				break;
			}
			 else if(m==2) {
				 t2.setText(S+" two");
					break;
			 }
			 else if(m==3) {
				 t2.setText(S+" three");
					break;
			 }
			 else if(m==4) {
				 t2.setText(S+" four");
					break;
			 }
			 else if(m==5) {
				 t2.setText(S+" five");
					break;
			 }
			 else if(m==6) {
				 t2.setText(S+" six");
					break;
			 }
			 else if(m==7) {
				 t2.setText(S+" seven");
					break;
			 }
			 else if(m==8) {
				 t2.setText(S+" eight");
					break;
			 }
			 else if(m==9) {
				 t2.setText(S+" nine");
					break;
			 }
			}
			}
}





if(n>101) {
	int x,y,l,b;
	m=n%100;		// 256
	k=m%10;			// y-I x-II k-III 
	x=m/10;
	b=m/10;
	l=b;
	y=n/100;
	String s2="hundred and",S1="",S3="",S4="";
	
	switch(n) {
	case 101:
	{
		t2.setText("one"+s2+"one");
		break;
	}
	case 102:
	{
		t2.setText("one"+s2+"two");
		break;
	}
	case 103:
	{
		t2.setText("one"+s2+"three");
		break;
	}
	case 104:
	{
		t2.setText("one"+s2+"four");
		break;
	}
	case 105:
	{
		t2.setText("one"+s2+"five");
		break;
	}
	case 106:
	{
		t2.setText("one"+s2+"six");
		break;
	}
	case 107:
	{
		t2.setText("one"+s2+"seven");
		break;
	}
	case 108:
	{
		t2.setText("one"+s2+"eigth");
		break;
	}
	case 109:
	{
	//	t2.setText("one"+s2+"nine");
		break;
	}
	}
	
	
	if(y==1) {
		S="one";
		
	}
	else if(y==2) {
		S="two";
	
	}	
	else if(y==3) {
		S="three";
		
	}
	else if(y==4) {
		S="four";
		
	}
	else if(y==5 ) {
		S="five";
		
	}
	else if(y==6) {
		S="six";
		
	}
	else if(y==7) {
		S="seven";
		
	}
	else if(y==8 ) {
		S="eight";
		
	}	
	else if(y==9) {
		S="nine";
		
	}
	
	
	
	
	while(x!=0 && x!=1) {
		if(x==2) {
			S3="Twenty";
			break;
		}
		else if(x==3) {
			S3="Thirty";
			break;
		}
		else if(x==4) {
			S3="Fourty";
			break;
		}
		else if(x==5) {
			S3="Fifty";
			break;
		}
		else if(x==6) {
			S3="Sixty";
			break;
		}
		else if(x==7) {
			S3="Seventy";
			break;
		}
		else if(x==8) {
			S3="Eighty";
			break;
		}
		else if(x==9) {
			S3="Ninty";
			break;
		}	
		}
	
	
	if(k!=0 && x!=0 && x!=1) {
	if(k==1) {
		S1="one";
		
	}
	else if(k==2) {
		S1="two";
		
	}
	else if(k==3) {
		S1="three";
		
	}
	else if(k==4) {
		S1="four";
		
	}
	else if(k==5 ) {
		S1="five";
	
	}
	else if(k==6) {
		S1="six";
		
	}
	else if(k==7) {
		S1="seven";
		
	}
	else if(k==8 ) {
		S1="eight";
		
	}	
	else if(k==9) {
		S1="nine";
		
	}	
}
	
		
		
	if(x==0 || x==1) {
		if(x==1 && k==0) {
			S4="Ten";
			
			}
		else if(x==1 && k==1) {
			S4="Eleven";
			
		}
		else if(x==1 && k==2) {
			S4="Twelve";
			
		}
		else if(x==1 && k==3) {
			S4="Thirteen";
			
		}
		else if(x==1 && k==4) {
			S4="Fourteen";
			
		}
		else if(x==1 && k==5) {
			S4="Fifteen";
			
		}
		else if(x==1 && k==6) {
			S4="Sixteen";
			
		}
		else if(x==1 && k==7) {
			S4="Seventeen";
			
		}
		else if(x==1 && k==8) {
			S4="Eighteen";
			
		}
		else if(x==1 && k==9) {
			S4="Ninteen";
			
		}
		else
			 {
				if(k==1) {
					S1="one";
					
				}
				else if(k==2) {
					S1="two";
					
				}
				else if(k==3) {
					S1="three";
					
				}
				else if(k==4) {
					S1="four";
					
				}
				else if(k==5 ) {
					S1="five";
				
				}
				else if(k==6) {
					S1="six";
					
				}
				else if(k==7) {
					S1="seven";
					
				}
				else if(k==8 ) {
					S1="eight";
					
				}	
				else if(k==9) {
					S1="nine";
					
				}
			}
		
				
	}	
		
			
	t2.setText(S+" "+s2+" "+S3+" "+S1+""+S4);
	


	}}

}
