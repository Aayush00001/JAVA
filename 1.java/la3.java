//Create one class named "Box" having three member variable named "double width,height, depth", create default and parameter 
//constructors and one method named "double volume()".
public class la3
{
    double width, height, depth;
    int boxNo;
    la3(double w, double h, double d, int num)
    {
        width = w;
        height = h;
        depth = d;
        boxNo = num;
    }
    la3()
    {
        width = height = depth = 0;
    }
    la3(int num)
    {
        
        this();
 		boxNo = num;
    }
 
    public static void main(String[] args)
    {
        la3 box1 = new la3(1);
        System.out.println(box1.width);
    }
}