
import java.io.FileWriter;

public class InputFile {
    public static void main(String[] args) {

        try {

            FileWriter fileWriter = new FileWriter("person.txt", true);

            fileWriter.write("\nThyda");
            if (fileWriter != null) {
                System.out.println("File save success!");
            }
            fileWriter.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
