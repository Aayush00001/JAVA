//Class Interface
interface printable1{
    void print();
}
interface showable{
    void show();
}
class Test_interface implements printable1,showable{
    public void print(){
        System.out.println("Ayush");
    }
    public void show(){
        System.out.println("---------------------");
    }
    public static void main(String args[]){
        Test_interface obj = new Test_interface();
        obj.show();
        obj.print();
    }
}