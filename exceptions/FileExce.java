package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExce {

    public static void main(String[] args) throws IOException {
        method1();
    }


    static void method1() throws FileNotFoundException
    {
        method2();
    }

    private static void method2() throws FileNotFoundException {
        FileReader fileReader=new FileReader("D:\\Github Projects\\Android\\Java-Code\\exceptions\\a.txt");

        String s =new String();

        System.out.println();

    }

}
