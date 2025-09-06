package streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

public class CopyingFromOneToAnother {
    public static void main(String[] args) throws IOException {


//        FileOutputStream fos;
//        FileInputStream fis;

        FileReader fis;
        FileWriter fos;

        int c;

//        fis = new FileInputStream("D:\\Bits Pilani\\Semester 2\\Objecr Oriented Programming and Design\\Java Programs\\Programs\\streams\\A.txt");
//
//        fos = new FileOutputStream("D:\\Bits Pilani\\Semester 2\\Objecr Oriented Programming and Design\\Java Programs\\Programs\\streams\\B.txt");
          fis = new FileReader("D:\\Bits Pilani\\Semester 2\\Objecr Oriented Programming and Design\\Java Programs\\Programs\\streams\\A.txt");

        fos = new FileWriter("D:\\Bits Pilani\\Semester 2\\Objecr Oriented Programming and Design\\Java Programs\\Programs\\streams\\B.txt");

        try {

            while ((c=fis.read() )!= -1) {
                fos.write(c);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fis.close();
            fos.close();
        }

    }
}
