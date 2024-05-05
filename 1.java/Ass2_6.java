//Define a class Book having instance variable title, price and no_of_page. Define
//default and parameterized constructor to initialize instance variable. Define show()
//method to display all information as output. Create two objects and demonstrate.
class Book
{
    String title;
    int price,no_of_page;
    Book()
    {
        title="My_Book";
        price=500;
        no_of_page=257;
    }
    Book(String t,int p,int nop)
    {
        title=t;
        price=p;
        no_of_page=nop;
    }
    void show()
    {
        System.out.println("Title of book:"+title);
        System.out.println("Price of book:"+price);
        System.out.println("Nuber of pages:"+no_of_page);
    }

}
class Ass2_6
{
    public static void main(String[] args)
    {
        Book b1=new Book();
        b1.show();

        Book b2=new Book("oop with java",780,1500);
        b2.show();
    }
}