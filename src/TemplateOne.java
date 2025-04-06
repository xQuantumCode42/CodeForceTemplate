import java.util.Scanner;

public class TemplateOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=0; i<n; i++) {
            int input = scanner.nextInt();
            int result = func(input);
            System.out.println(result);
        }
        scanner.close();
    }

    private static int func(int input) {
        return 0;
    }
}