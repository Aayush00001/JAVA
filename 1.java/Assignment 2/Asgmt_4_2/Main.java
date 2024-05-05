class Main {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            int sum = (a + b + c);
            int per = sum / 3 * 100;
            System.out.println("Percentage is: " + per);
        } catch (NumberFormatException E) {
            System.out.println("Error is: " + E);
        }
    }
}