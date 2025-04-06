package problems.contest;

import java.util.Scanner;

public class CloudberryJam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=0; i<n; i++) {
            int input = scanner.nextInt();
            int result = needBerries(input);
            System.out.println(result);
        }
        scanner.close();
    }

    private static int needBerries(int jam) {
        return jam * 2;
    }
}
