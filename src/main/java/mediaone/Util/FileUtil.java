package mediaone.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileUtil<T> {

    private static final String productFilePath = "C:\\Users\\MY LAPTOP\\OneDrive\\Documents\\NetBeansProjects\\MediaOne\\src\\main\\java\\DataFile\\Product.txt";
    private static final String billBuyFilePath = "C:\\Users\\MY LAPTOP\\OneDrive\\Documents\\NetBeansProjects\\MediaOne\\src\\main\\java\\DataFile\\BillBuy.txt";

    public FileUtil() {
    }

    public void writeListToFile(String objectName, List<T> listObject) throws IOException {
        try {
            File file = new File(("product".equals(objectName) ? productFilePath : billBuyFilePath));
            ObjectOutputStream objectFile = new ObjectOutputStream(new FileOutputStream(file));

            // Write objects to file
            for (Object object : listObject) {
                objectFile.writeObject(object);
            }

            objectFile.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

    public List<T> readFile(String objectName) throws IOException, ClassNotFoundException {
        ArrayList<T> objectsList = new ArrayList<>();
        File file = new File(("product".equals(objectName) ? productFilePath : billBuyFilePath));
        System.out.println(file);
        ObjectInputStream objectFile = new ObjectInputStream(new FileInputStream(file));

        while (true) {
            try {
                T obj = (T) objectFile.readObject();
                System.out.println(obj.toString());
                objectsList.add(obj);
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
                break;
            }
        }
        objectFile.close();

        return objectsList;
    }
}
