import java.awt.*; 
import java.applet.Applet; 

/*<applet code="Main" width=400 height=400></applet> */ 

public class Main extends Applet
{ 
    public void paint(Graphics g) 
    { 
        g.drawOval(80, 70, 150, 150); 
        g.drawOval(120, 120, 15, 15);  
        g.drawOval(170, 120, 15, 15); 
        g.setColor(Color.GRAY); 
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);  
        g.setColor(Color.BLACK);
        g.drawLine(140, 170, 150, 130);
        g.drawLine(140, 170, 160, 170);
        g.drawArc(125, 180, 60, 20, 180, 180); 

    }
}
