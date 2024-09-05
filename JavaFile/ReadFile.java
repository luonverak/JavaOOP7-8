import java.io.FileReader;

public class ReadFile {
 
    public static void main(String[] args) {

        char[] readFile = new char[100];
        try {

            FileReader fileReader = new FileReader("person.txt");

            fileReader.read(readFile);
            System.out.println(readFile);
            
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
