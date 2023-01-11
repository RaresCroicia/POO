package probl2;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test01.in");
            LineNumberReader lnr = new LineNumberReader(fr);
            int i = 1;
            String lineRead = lnr.readLine();
            while(lineRead != null) {
                if(i % 2 == 1)
                    System.out.println("Linia " + i + ": " + lineRead);
                i++;
                lineRead = lnr.readLine();
            }

        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
