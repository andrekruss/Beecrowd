import java.util.Scanner;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        double pi = 3.14159;

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        double r = Double.parseDouble(input);

        System.out.println(
            String.format("A=%.4f", pi * r * r)
        );

        in.close();
    }
}
