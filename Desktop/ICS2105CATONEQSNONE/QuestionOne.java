import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = scanner.nextInt();
        }

        int[] rotatedArray = rotLeft(a, d);
        for (int num : rotatedArray)
        {
            System.out.print(num + " ");
        }
    }

    public static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + n - d) % n;
            rotatedArray[newIndex] = a[i];
        }
        return rotatedArray;
    }
}
