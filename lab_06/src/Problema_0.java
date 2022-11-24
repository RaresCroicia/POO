import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

class SortedVector extends Vector{
    Comparator c;
    SortedVector(Comparator c){
        this.c = c;
    }


    public boolean add(Object o) {
        super.add(o);
        Collections.sort(this, c);
        return true;
    }
}


public class Problema_0 {
    public static void main(String[] args){
        SortedVector sv = new SortedVector(new Comparator(){
            public int compare(Object o1, Object o2){
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return (i1.compareTo(i2));
            }
        });
        sv.add(5);
        sv.add(3);
        sv.add(7);
        System.out.println(sv);
    }
}
