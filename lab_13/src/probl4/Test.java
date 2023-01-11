package probl4;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        int cuvinte = 0;
        try {
            FileReader in = new FileReader(new File("test02.in"));
            StreamTokenizer str = new StreamTokenizer(in);
            while(str.nextToken() != StreamTokenizer.TT_EOF) {
                if(str.ttype == StreamTokenizer.TT_WORD)
                    cuvinte ++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Am numarat vreo " + cuvinte + " de cuvinte");
        }
    }
}
