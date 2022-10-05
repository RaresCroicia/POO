import java.util.Arrays;

public class Problema_8 {
    public static void main(String args[]){
        int[] vector = new int[10];
        int max = 20;
        int min = 1;
        int range = max - min + 1;
        for(int i = 0; i < 10; i++)
            vector[i] = (int)(Math.random() * range) + min;

        int numar_ales = vector[0];
        System.out.println("Numar ales = " + numar_ales);

        System.out.println("Vector random:");
        for(int i = 0; i < 10; i++)
            System.out.println(vector[i]);

        Arrays.sort(vector);
        System.out.println("\nVector sortat:");
        for(int i = 0; i < 10; i++)
            System.out.println(vector[i]);

        int index = Arrays.binarySearch(vector, numar_ales);
        System.out.println("Numarul a fost gasit la indexul " + index);
    }
}
