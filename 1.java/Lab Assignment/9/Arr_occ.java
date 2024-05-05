import java.util.*;

class Arr_occ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println("Enter The Number:");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        System.out.println(num + " has occured " + count + " times");
    }
}