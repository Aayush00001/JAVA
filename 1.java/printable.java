//Class Interface
interface printable{
    void print();
}
class Test_interface implements printable{
    public void print(){
        System.out.println("Ayush");
    }
    public static void main(String args[]){
        Test_interface obj = new Test_interface();
        obj.print();
    }
}