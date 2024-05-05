class compute extends Exception {
    compute(String s) {
        super(s);
    }
}

class Main {
    static void check(int a) throws compute {
        if (a > 10) {
            throw new compute("Integer parameter Invalid");
        } else {
            System.out.println("Integer parameter valid");
        }
    }

    public static void main(String[] args) {
        try {
            check(15);
        } catch (compute c) {
            System.out.println(c);
        } finally {
            System.out.println("This is Final block");
        }
        System.out.println("Program worked sucessfully");
    }
}