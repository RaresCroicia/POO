import java.util.Vector;

public class Problema_06 {

    public void add(Vector v, Object e, Vector keys, int[] freq){
        v.add(e);
        if(!keys.contains(e.getClass()))
            keys.contains(e.getClass());
        if(keys.contains(e.getClass())){
            freq[keys.indexOf(e.getClass())]++;
        }
    }

    public static void main(String[] args){
        Vector v = new Vector();
        Vector keys = new Vector();
        int[] freq = new int[10];
        Problema_06 obj = new Problema_06();
        obj.add(v, 7.5, keys, freq);
        obj.add(v, "String", keys, freq);
        obj.add(v, "text", keys, freq);
        obj.add(v, 10, keys, freq);
        for(int i = 0; i < keys.size(); i++){
            System.out.println("Clasa " + keys.elementAt(i) + "apare de " + freq[keys.indexOf(keys.elementAt(i))] + "ori");
        }
    }

}
