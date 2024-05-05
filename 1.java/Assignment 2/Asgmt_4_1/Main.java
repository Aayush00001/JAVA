public class Main {
    public static void main(String[] args) {
        try {
            int[] arr = new int[2];
            arr[3] = 30 / 0;
            System.out.println("3rd Element is: " + arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }
    }

}