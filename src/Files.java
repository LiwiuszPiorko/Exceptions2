import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) throws IOException {
        //Products[]productsArray=new Products[6];
        File file = new File("produkty.txt");
        Scanner fileScan = new Scanner(file);
        while (fileScan.hasNext()) {
            String products = fileScan.next();
            System.out.println(products);
        }
    }
}
