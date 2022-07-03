import java.io.*;

public class fileStreamTest {
    public static void main(String args[]) {
        try {
            byte bWrite[] = {11,22,33,44,5,3,3,3,3,3,3,3};
            OutputStream os = new FileOutputStream("wjm_test.txt");
            for(int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]);
            }
            os.close();

            // InputStream is = new FileInputStream("wjm_test.txt");
            // int size = is.available();
            // for(int i = 0; i < size; i++) {
            //     System.out.print((char) is.read() + " ");
            // }

            // is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
