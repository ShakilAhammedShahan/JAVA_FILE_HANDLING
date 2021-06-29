import java.io.*;
/**
 * Created by Fakrul Uddin on 12/8/2016.
 */
public class BufferWriting {
    public static void main(String[] args) throws IOException {
        FileWriter fw= new FileWriter("./src/name2.txt",true);
        BufferedWriter bf= new BufferedWriter(fw);
        String s="secret";        bf.write(s);
        bf.close();
    }
}
