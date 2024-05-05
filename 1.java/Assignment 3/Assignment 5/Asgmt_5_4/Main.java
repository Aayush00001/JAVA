import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//<applet code="Ass4" height=300 width=450></applet>
public class Ass4 extends Applet
{
	Label l1,l2;
	TextField t1,t2;
	Button b1;
	public void init()
	{
		l1=new Label("Enter any integer value");
		l2=new Label("Factorial value is:");
		t1=new TextField();
		t2=new TextField();
		b1=new Button("Compute");
		setLayout(null);
		l1.setBounds(150,0,150,50);
		t1.setBounds(130,50,166,20);
		l2.setBounds(150,80,150,20);
		t2.setBounds(130,120,166,20);
		b1.setBounds(175,175,60,20);
		add(l1);
		add(l2);
		add(b1);
		add(t1);
		add(t2);
		b1.addActionListener(new handler());
	}
	public class handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,fact=1,x;
			a=Integer.parseInt(t1.getText());
			for(int i=1;i<=a;i++)
			{
				 fact=fact*i; 
				
			}
			t2.setText(""+fact);
		}
	}
	
}