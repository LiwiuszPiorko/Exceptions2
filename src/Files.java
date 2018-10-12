import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Files {
    public static void main(String[] args)throws IOException {
        File plik=new File("C:\\Użytkownicy\\user\\Pulpit\\produkty.txt");
        Scanner plikSkan=new Scanner(plik);
        System.out.println(plikSkan.nextLine());
        System.out.println(plikSkan.hasNextLine());
        System.out.println(plikSkan.nextInt());
        System.out.println(plikSkan.nextLine());
        System.out.println(plikSkan.nextLine());
        System.out.println(plikSkan.nextInt());


    }




}
