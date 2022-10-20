import java.util.*;

public class Problema_03 {

    public int removeAndGetOccurrences(Vector v, int nr){
        int occurrences = 0;
        while(v.contains(nr)){
            occurrences++;
            v.removeElement(nr);
        }
        return occurrences;
    }

    public static void main(String[] args){
        Vector vec = new Vector(20);
        Random gen = new Random();
        Problema_03 object = new Problema_03();
        for(int i = 0; i < 20; i++)
            vec.add(gen.nextInt(10));

        int x = 3;
        System.out.println("Vectorul inainte de stergerea aparitiilor lui 3");
        for(int i = 0; i < vec.size(); i++)
            System.out.println(vec.elementAt(i));

        int max = -1, min = 11, pozMin = 0, sum = 0;

        for(int i = 0; i < vec.size(); i++){
            int actual = (int)vec.elementAt(i);
            if(actual > max)
                max = actual;
            if(actual < min){
                min = actual;
                pozMin = i;
            }
            sum += actual;
        }

        System.out.println("Maximul este: " + max);
        System.out.println("Pozitia minimului este: " + pozMin);
        System.out.println("Media aritmetica este: " + (float)sum / vec.size());


        int occurrs = object.removeAndGetOccurrences(vec, x);
        System.out.println("Numarul 3 a aparut de " + occurrs + " ori");

        System.out.println("Vectorul dupa stergerea aparitiilor lui 3");
        for(int i = 0; i < vec.size(); i++)
            System.out.println(vec.elementAt(i));

    }
}
