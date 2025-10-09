import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CustomFileReader {
    public static void main(String[] args){
        try {
            // 1. create path that points to file
            String filePath = "c:\\Users\\DELL\\Desktop\\Account.java";
            Path path = Paths.get(filePath);

            //2. read file data using class Files
            List<String> data = Files.readAllLines(path);
            String fileContent = String.join("\n", data);
            System.out.println(fileContent);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

//    private static byte[] readDataFrom(String filePath) throws IOException{
//        Path path = Paths.get(filePath);
//        byte[] data = Files.readAllBytes(path);
//        return data;
//    }
}
