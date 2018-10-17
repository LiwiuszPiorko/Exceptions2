import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Files {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        File file = new File("produkty.txt");
        try (Scanner fileScan = new Scanner(file)) {
            while (fileScan.hasNext()) {
                String nextLine = fileScan.next();
                String[] product = nextLine.split(" ");
                System.out.println(Arrays.toString(product));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Plik nie istnieje");
        }
    }
}
