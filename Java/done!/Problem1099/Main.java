import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            String[] inputs = in.nextLine().split(" ");
            int x = Integer.parseInt(inputs[0]);
            int y = Integer.parseInt(inputs[1]);

            if (x > y) {
                for (int j = y + 1; j < x; j++) {
                    if (j % 2 != 0)
                        sum += j;
                }
            }
            else if(x < y) {
                for (int j = x + 1; j < y; j++) {
                    if (j % 2 != 0)
                        sum += j;
                }
            }

            System.out.println(sum);
            sum = 0;
        }
        in.close();
    }
}
