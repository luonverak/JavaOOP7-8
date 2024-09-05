import java.io.File;

public class CreateFile {

    public static void main(String[] args) {
        
        // How to create file?
        File file = new File("person.txt");
        try {
            if(file.createNewFile()){
                System.out.println("File create success!");
            }else{
                System.out.println("Failed create file!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}