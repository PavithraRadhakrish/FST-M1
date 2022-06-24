package activities;

import org.apache.commons.io.FileUtils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Text;


public class Activity14 {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Pavithra\\IdeaProjects\\FST_Java\\src\\main\\java\\activities\\New_Text_File.txt");
        boolean fileStatus = file.createNewFile();
        if(fileStatus) {
            System.out.println("File got successfully created");
            FileUtils.writeStringToFile(file,"Welcome");
            /*OutputStream out = new BufferedOutputStream(Files.newOutputStream("C:\\Users\\Pavithra\\IdeaProjects\\FST_Java\\src\\main\\java\\activities\\New_Text_File.txt",CREATE,APPEND)){
                out.write("Welcome");
            }*/
        } else {
            System.out.println("File not created");
        }

        File fileUtil = FileUtils.getFile("C:\\Users\\Pavithra\\IdeaProjects\\FST_Java\\src\\main\\java\\activities\\New_Text_File.txt");
        System.out.println("Data in file : " + FileUtils.readFileToString(fileUtil, "UTF8"));

        File destDir = new File("resources");
        FileUtils.copyFileToDirectory(file, destDir);

        File newFile = FileUtils.getFile(destDir, "New_Text_File.txt");
        String newFileData = FileUtils.readFileToString(newFile, "UTF8");
        System.out.println("Data in new file: " + newFileData);
    }
}
