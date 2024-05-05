import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="Ass10" width=500 height=300></applet>
*/
public class Ass10 extends Applet  implements ActionListener
{
	Choice c1,c2;
	Button b1;
	Label lb1,lb2;
	public void init()
	{
		
		c1=new Choice();
		c2=new Choice();
		b1=new Button("Show");
		lb1=new Label("Programming language Selcted : C");
		lb2=new Label(" Framework Selcted : Turbo C++");
		c1.add("C");
		c1.add("C++");
		c1.add("Java");
		c1.add("PHP");
		c2.add("Turbo C++");
		c2.add("Spring Hibernate");
		c2.add("Codelgniter");
		setLayout(null);
		c1.setBounds(90,90,90,50);
		c2.setBounds(90,150,95,50);
		b1.setBounds(200,115,60,20);
		lb1.setBounds(20,20,225,20);
		lb2.setBounds(250,20,240,20);
		add(c1);
		add(c2);
		add(b1);
		add(lb1);
		add(lb2);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(c1.getSelectedItem()=="C")
			lb1.setText("Programming language Selcted : C");
		else if(c1.getSelectedItem()=="C++")
			lb1.setText("Programming language Selcted : C++");
		else if(c1.getSelectedItem()=="Java")
			lb1.setText("Programming language Selcted : Java");
		else if(c1.getSelectedItem()=="PHP")
			lb1.setText("Programming language Selcted : PHP");
		if(c2.getSelectedItem()=="Turbo C++")
			lb2.setText(" Framework Selcted : Turbo C++");
		else if(c2.getSelectedItem()=="Spring Hibernate")
			lb2.setText(" Framework Selcted : Spring Hibernate");
		else if(c2.getSelectedItem()=="Codelgniter")
			lb2.setText(" Framework Selcted : Codelgniter");
	}
}