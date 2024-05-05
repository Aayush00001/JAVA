import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="Ass9" width=500 height=300></applet>
*/
public class Ass9 extends Applet  implements ActionListener
{
	Choice c1;
	Button b1;
	Label lb1;
	public void init()
	{
		
		c1=new Choice();
		b1=new Button("Show");
		lb1=new Label("Programming language Selcted : C ");
		c1.add("C");
		c1.add("C++");
		c1.add("Java");
		c1.add("PHP");
		c1.add("Android");
		setLayout(null);
		c1.setBounds(90,90,90,50);
		b1.setBounds(200,90,60,20);
		lb1.setBounds(80,20,240,20);
		add(c1);
		add(b1);
		add(lb1);
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
		else if(c1.getSelectedItem()=="Android")
			lb1.setText("Programming language Selcted : Android");
	}
}