import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[][] mas = new int[3][2];
        int[][] mas2 = new int[mas[0].length][mas.length];
        for (int i =0; i < mas.length; i++){
            for (int j =0; j < mas[0].length; j++){
                int n = Integer.parseInt(reader.readLine());
                mas[i][j] = n;
            }

        }

        for (int i = 0; i < mas.length; i++){
            for (int j = 0; j < mas[0].length; j++){
                System.out.print(mas[i][j]+ " ");
            }
            System.out.println();
        }

        for (int i = 0; i < mas2.length; i++){
            for (int j = 0; j < mas2[0].length; j++){
                mas2[i][j] = mas[j][i];
            }
        }

        for (int i = 0; i < mas2.length; i++){
            for (int j = 0; j < mas2[0].length; j++){
                System.out.print(mas2[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("pull request");
    }
}