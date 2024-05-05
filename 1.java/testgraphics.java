import java.awt.*;
import java.applet.*;
/* <applet code="testgraphics"width=200height=200></applet>*/
public class testgraphics extends applet
{
    public void paint(Graphics g)
    {
        dimension d=getsize();
        g.setColor(color.RED);
        g.fillRect(0,0,d.width,d.height);
        g.setfont(new font("tims new roman",font.BOLD,24));
        g.setColor(color.BLUE);
        g.drawString("AAYUSH RADHANPARA",30,30);
    }
}
    
