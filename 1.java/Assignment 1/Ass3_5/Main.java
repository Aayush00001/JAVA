interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Test_Multiple implements Printable, Showable {
    public void print() {
        System.out.println("Hii this is Print()");
    }

    public void show() {
        System.out.println("Hii this is Show()");
    }
}

class Main {
    public static void main(String[] args) {
        Test_Multiple obj = new Test_Multiple();
        obj.print();
        obj.show();
    }

}
