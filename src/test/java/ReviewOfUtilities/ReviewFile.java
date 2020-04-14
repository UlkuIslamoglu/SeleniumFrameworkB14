package ReviewOfUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReviewFile {

    public static void main(String[] args) throws IOException {

        Properties properties=new Properties();
        FileInputStream file=new FileInputStream("review.properties");
        properties.load(file);
        String s=properties.getProperty("day");
        System.out.println(s);

    }
}