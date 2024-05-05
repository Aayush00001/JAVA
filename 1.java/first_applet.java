import java.awt.*;
import java.applet.*;
/*<applet code="first_applet"height=300width=500>/applet>*/
public class first_applet extends applet
{
    String msg=" ";
    public void init()
    {msg+="init() called";}
    public void start()
    {msg+="start() called";}
    public void paint(Graphics g)
    {g.drawString(msg,30,30);}
    public void stop()
    {msg+="stop() called";}
    public void destroy()
    {msg+="destroy() called";}
}
