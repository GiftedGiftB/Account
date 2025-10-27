import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CustomModifier {
    public static void main(String[] args){
        try {
            // 1. create path that points to file
            String filePath = "c:\\Users\\DELL\\Desktop\\Account.java";

            //2. read file data using class Files
            byte[] data = readDataFrom(filePath);
            System.out.println(new String(data));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static byte[] readDataFrom(String filePath) throws IOException{
        Path path = Paths.get(filePath);
        byte[] data = Files.readAllBytes(path);
        return data;
    }
}
