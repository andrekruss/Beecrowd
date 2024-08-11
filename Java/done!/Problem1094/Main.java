import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static char parseInputChar(String inputString) {
        String animal = inputString.split(" ")[1];
        return animal.charAt(0);

    }

    public static int parseInputNumber(String inputString) {
        String value = inputString.split(" ")[0];
        return Integer.parseInt(value);
    }

    public static void main(String[] args) throws IOException {

        int totalCounter = 0;
        int rabbitCounter = 0;
        int ratCounter = 0;
        int frogCounter = 0;

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        for(int i = 1; i <= n; i++) {
            String inputString = in.nextLine();
            int value = parseInputNumber(inputString);
            char animal = parseInputChar(inputString);

            totalCounter += value;

            switch (animal) {
                case 'C':
                    rabbitCounter += value;
                    break;
                case 'R':
                    ratCounter += value;
                    break;
                case 'S':
                    frogCounter += value;
                    break;
                default:
                    break;
            }
        }

        float rabbitPercentage = ((float) rabbitCounter / totalCounter) * 100;
        float ratPercentage = ((float) ratCounter / totalCounter) * 100;
        float frogPercentage = ((float) frogCounter / totalCounter) * 100;

        System.out.println(String.format("Total: %d cobaias", totalCounter));
        System.out.println(String.format("Total de coelhos: %d", rabbitCounter));
        System.out.println(String.format("Total de ratos: %d", ratCounter));
        System.out.println(String.format("Total de sapos: %d", frogCounter));
        System.out.println(String.format("Percentual de coelhos: %.2f %%", rabbitPercentage));
        System.out.println(String.format("Percentual de ratos: %.2f %%", ratPercentage));
        System.out.println(String.format("Percentual de sapos: %.2f %%", frogPercentage));

        in.close();
    }
}
