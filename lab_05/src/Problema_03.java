import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

class NumarNegativ extends Exception{
    NumarNegativ(){
        super("Numarul introdus este negativ!");
    }
}

public class Problema_03 {

    Vector vector = new Vector();

    public void myRead() throws Exception{
        Scanner scanner = new Scanner(System.in);
        while(1 != 0){
            int number;
            number = scanner.nextInt();
            if(number < 0)
                throw new NumarNegativ();
            vector.addElement(number);
        }
    }

    public static void main(String[] args){
        Problema_03 obj = new Problema_03();
        try{
            obj.myRead();
        }
        catch(NumarNegativ e){
            System.out.println("Elementul maxim este: " + Collections.max(obj.vector));
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
