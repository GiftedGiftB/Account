package nio.writers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CustomDataWriter {
    public static void main(String[] args){
        try {
            String data = "It sure as hell wasn't six million";
            String directoryPath = "c:\\Users\\DELL\\Desktop\\";
            String filename = "data.txt";
            Path path = Paths.get(directoryPath, filename);
            if(!Files.exists(path)){
                createFile(directoryPath, filename);
            }
            System.out.println(path);
            Files.writeString(path, data);
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createFile(String directoryPath, String fileName){
        try {
            Path path = Paths.get(directoryPath + fileName);
            Files.createFile(path);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
