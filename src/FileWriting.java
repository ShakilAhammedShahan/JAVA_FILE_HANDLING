
import java.io.*;
import java.io.IOException;

/**
 * Created by Fakrul Uddin on 12/8/2016.
 */
public class FileWriting {
    public static void main(String[] args) throws IOException {
        int i;
        FileOutputStream fout = new FileOutputStream("./src/name2.txt", true);
        String s = "I have some ";
        char[] ch = s.toCharArray();
        for ( i = 0; i < s.length(); i++)
        {
            fout.write(ch[i]);
        }
        fout.close();
    }
}
