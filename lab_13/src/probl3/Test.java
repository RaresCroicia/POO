package probl3;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("testWrite.out");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String readLine = br.readLine();
            while(!readLine.equals("exit")) {
                writer.write(readLine);
                readLine = br.readLine();
            }
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
