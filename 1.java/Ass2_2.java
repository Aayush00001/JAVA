//Create a class Rectangle having instance variable length and width of type double.
//Write a method to calculate area of rectangle. Set the value of length and width using
//setValue( ) method. Define area method to calculate area. Create an object of the
//class and display the area.
class rectangle 
 { 
    int l,b; 
    void setval(int x,int y) 
    { 
       l=x; 
       b=y; 
    } 
    int area() 
    { 
        return (l*b); 
    } 
 }; 
 class Ass2_2 
 { 
    public static void main (String args[]) 
    { 
    	rectangle rectangle=new rectangle(); 
        rectangle.setval (50,8); 
        System.out.println("Area of Rectangle is:->"+rectangle.area()); 
    } 
 }; 