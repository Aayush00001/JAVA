import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//<applet code="Ass3" height=300 width=450></applet>
public class Ass3 extends Applet
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4,b5;
	public void init()
	{
		l1=new Label("First Number");
		l2=new Label("Second Number");
		l3=new Label("Result");
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		b1=new Button("Add");
		b2=new Button("Sub");
		b3=new Button("Mul");
		b4=new Button("Div");
		b5=new Button("Cancel");
		setLayout(null);
		l1.setBounds(50,55,100,20);
		t1.setBounds(200,55,100,20);
		l2.setBounds(50,100,100,20);
		t2.setBounds(200,100,100,20);
		l3.setBounds(50,145,100,20);
		t3.setBounds(200,145,100,20);
		b1.setBounds(50,190,60,20);
		b2.setBounds(120,190,60,20);
		b3.setBounds(190,190,60,20);
		b4.setBounds(260,190,60,20);
		b5.setBounds(330,190,60,20);
		add(l1);
		add(l2);
		add(l3);
		add(b1);
		add(t1);
		add(t2);
		add(t3);
		add(b2);
		add(b3);	
		add(b4);
		add(b5);
		b1.addActionListener(new handler());
		b2.addActionListener(new handler());
		b3.addActionListener(new handler());
		b4.addActionListener(new handler());
		b5.addActionListener(new handler());
	}
	public class handler implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
			int a,b,c;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			String s=e.getActionCommand();
			if(s.equals("Add"))
			{
			c=a+b;
			t3.setText(""+c);
			}
			else if(s.equals("Sub"))
			{
			c=a-b;
			t3.setText(""+c);
			}
			else if(s.equals("Mul"))
			{
			c=a*b;
			t3.setText(""+c);
			}
			else if(s.equals("Div"))
			{
			c=a/b;
			t3.setText(""+c);
			}
			else if(s.equals("Cancel"))
			{
				System.exit(0);
			}
		}
	}
	
}