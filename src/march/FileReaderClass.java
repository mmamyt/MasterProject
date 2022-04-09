package march;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

    public static String fileReader(String path) throws IOException {
        File file = new File(path);
        FileReader fr = new FileReader(file);
        char [] charArr = new char[(int) file.length()];
        fr.read(charArr);
        String fileContent = new String(charArr);
        return fileContent;
    }

    public static void main(String[] args) throws IOException{
        String content = fileReader("src/march/browser.txt");
        System.out.println(content);
    }

}
