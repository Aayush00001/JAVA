//write program to create chedckbox and radio option
import java.awt.*;
import java.applet.*;
/*<applet code="Awt2" width=400 height=300>
</applet>*/
public class Awt2 extends Applet
{
	public void init()
	{
		checkbox c1=new checkbox("java",true);
		checkbox c2=new checkbox("php");
		checkbox c3=new checkbox("ds");
		add(c1);
		add(c2);
		add(c3);
	}

}