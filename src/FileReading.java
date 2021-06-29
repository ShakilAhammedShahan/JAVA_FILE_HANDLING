import java.io.*;
/**
 * Created by Fakrul Uddin on 12/8/2016.
 */
public class FileReading {
    public static void main(String[] args)throws IOException {
        FileInputStream fis=new FileInputStream("./src/name2.txt");
        int i;
        do{
            i=fis.read();
            if(i!=-1)
                System.out.print((char)i);
        }while(i!=-1);
        fis.close();

    }
}
