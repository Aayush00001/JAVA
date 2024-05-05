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
            System.out.println("Integer parameter Valid");
        }
    }

    public static void main(String[] args) {
        try {
            check(15);
        } catch (compute e) {
            System.out.println(e);
        }
        System.out.println("Program Worked sucessfully");
    }
}
