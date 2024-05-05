import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet code="Ass12" height=200 width=300></applet>
public class Ass12 extends Applet implements ActionListener
{
	Button b1;
	TextField t1,t2,t3;
	public void init()
	{
		b1=new Button("Fill");
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		setLayout(null);
		b1.setBounds(100,53,29,20);
		t1.setBounds(30,10,56,25);
		t2.setBounds(100,10,56,25);
		t3.setBounds(170,10,56,25);
		b1.addActionListener(this);
		add(b1);
		add(t1);
		add(t2);
		add(t3);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		int r=Integer.parseInt(t1.getText());
		int g=Integer.parseInt(t2.getText());
		int b=Integer.parseInt(t3.getText());
		Graphics ga=this.getGraphics();
		Color color=new Color(r,g,b);
		ga.setColor(color);
		ga.fillRect(50,69,60,60);		
	}
}