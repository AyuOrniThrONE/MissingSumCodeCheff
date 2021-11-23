import java.util.Scanner;

public class missingSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (1 <= t && t <= 50) {
            for (int j = 0; j< t; j++) {
                int n = sc.nextInt();
                if (1 <= n && n <= 1000) {
                    for(int i = 0; i < n; i++){
                        System.out.print(3*i + i +1 + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
