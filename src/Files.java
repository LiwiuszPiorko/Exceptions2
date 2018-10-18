import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Files {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        String[] products1 = new String[1];
        File file = new File("produkty.txt");
        try (Scanner fileScan = new Scanner(file)) {

            while (fileScan.hasNext()) {
                for (int i = 0; i < products1.length; i++) {
                    products1[i] = fileScan.next();
                }
                System.out.print(Arrays.toString(products1));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Plik nie istnieje");
        }
    }
}
