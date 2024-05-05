//example of choce with iteam event
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Awt_choice" width=200 height=200>
</applet>*/
public class Awt_choice extends Applet implements Itemlistener
{
	choice c1;
	public void init()
	{
		c1=new choice();
		c1.add("select color");
		c1.add("RED");
		c1.add("YELLOW");
		c1.add("GREEN");
		c1.add("Byte");
		c1.add("BLACK");
		c1.add("CYAN");
		c1.add("PINK");
		c1.add("magenta");
		add(c1);
		c1.addItemlistener(this);
	}
	public void itemstatechanged(ItemEvent ie)
	{
		int index=c1.getselectedIndex();
		switch(index)
		{
			case 0:
				this.setBackground(color.white);
				break;
			case 1:
				this.setBackground(color.RED);
				break;
			case 2:
				this.setBackground(color.YELLOW);
				break;
			case 3:
				this.setBackground(color.GREEN);
				break;
			case 4:
				this.setBackground(color.BLUE);
				break;
			case 5:
				this.setBackground(color.BLACK);
				break;
			case 6:
				this.setBackground(color.CYAN);
				break;
			case 7:
				this.setBackground(color.PINK);
				break;
			case 8:
				this.setBackground("magenta");
				break;
		}
	}
}