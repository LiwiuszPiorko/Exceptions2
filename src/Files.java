import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class Files {
    public static void main(String[] args) throws FileNotFoundException, IOException {


        File file = new File("produkty.txt");
        try (Scanner fileScan = new Scanner(file)) {
            while (fileScan.hasNext()) {
                String line = fileScan.nextLine();
                String[] splittedLine = line.split(",");
                String name = splittedLine[0];
                String manufacturer = splittedLine[1];
                String priceString = splittedLine[2];
                Double price = Double.valueOf(priceString);
                Products product = new Products(name, manufacturer, price);
                System.out.println(product);
                double sum = product.returnSum(price,price);
                System.out.println("Dziś za swoje zakupy zapłaciłes: "+sum);
                double show=product.isBigger(price,price);
                System.out.println("Twój najwiekszy wydatek to: "+show);

            }
        } catch (FileNotFoundException e) {
            System.err.println("Plik nie istnieje");
        }
    }
}

