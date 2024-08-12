import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int i = 1, j = 60;

        while (j >= 0) {
            String output = String.format("I=%d J=%d", i, j);
            System.out.println(output);
            i+=3;
            j-=5;
        }
    }
}