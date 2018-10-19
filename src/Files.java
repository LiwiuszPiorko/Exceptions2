import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Files {
    public static void main(String[] args) throws FileNotFoundException, IOException {


        File file = new File("produkty.txt");
        try (Scanner fileScan = new Scanner(file)) {

            double sum = 0;
            double bigger=0;

            while (fileScan.hasNext()) {

                String line = fileScan.nextLine();
                String[] splittedLine = line.split(",");
                String name = splittedLine[0];
                String manufacturer = splittedLine[1];
                String priceString = splittedLine[2];
                Double price = Double.valueOf(priceString);
                Products product = new Products(name, manufacturer, price);
                System.out.println(product);
                sum=sum+product.getPrice();
                for (bigger = 0; bigger <=product.getPrice(); bigger++) {
                }
            }
            System.out.println("Dziś na zakupy wydałeś: "+ sum);
            System.out.println("Twój największy wydatek to: "+ bigger);

        } catch (FileNotFoundException e) {
            System.err.println("Plik nie istnieje");
        }
    }
}

