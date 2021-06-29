/**
 * Created by Fakrul Uddin on 12/8/2016.
 */
import java.io.File;
import java.io.IOException;

public class FileExample1 {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\p2p\\shumon\\My document\\computer science in uiu\\5th semister\\Java lab\\fileHandeling\\src\\name1.txt");
        f1.createNewFile();
        System.out.println("Is exist:"+f1.exists());
        System.out.println("File size:"+f1.length());
    }
}
