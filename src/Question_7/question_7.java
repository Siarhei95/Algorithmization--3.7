package Question_7;
import java.util.*;

public class question_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the size of array n1: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the size of array n2: ");
        int n2 = scanner.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++) {
            a[i] = random.nextInt(50);
        }
        for (int i = 0; i < n2; i++) {
            b[i] = random.nextInt(50);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println("First array: " + Arrays.toString(a));
        System.out.println("Second array: " + Arrays.toString(b));

        for (int i = 0; i < a.length; i++) {
            boolean num = true;
            for (int j = 0; j < b.length; j++) {
                if (a[i] < b[j]) {
                    System.out.printf("%d element of the first array insert before %d element of the second array\n", i, j);
                    num = false;
                    break;
                }
            }
            if (num)
                System.out.printf("%d element of the first array insert after the last element of the second array\n", i);
        }
    }
}







