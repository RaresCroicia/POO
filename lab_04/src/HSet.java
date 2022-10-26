import java.util.Enumeration;
import java.util.Hashtable;

public class HSet extends Hashtable {

    //Adauga un element in multime, daca nu exista deja
    public boolean add(Object value){
        if(this.containsKey(value))
            return false;
        this.put(value, value);
        return true;
    }
    //returneaza un String cu elementele multimii (doar cheile, nu perechi)
    public String toString(){
        Enumeration enu = this.keys();
        String ans = new String();
        ans = "";
        while(enu.hasMoreElements()){
            ans += enu.nextElement();
            ans += ";";
        }
        return ans;
    }
    //Sterge perechea corespunzatoare cheii, intorcand valoarea
    public Object remove(Object key){
        super.remove(key);
        return key;
    }
}

class TestHS{
    public static void main(String args[]) {
        HSet set = new HSet();
        set.add("Laborator");
        set.add("Agregare");
        set.add("Mostenire");
        System.out.println(set);
        System.out.println(set.size());
        set.add("Laborator");
        if(set.size() == 4) {
            System.out.println("Multimea nu trebuie sa contina duplicate!");
        }
        System.out.println(set.remove("POO"));
        System.out.println(set.remove("Laborator"));
        if(set.size() != 2) {
            System.out.println("Stergerea nu functioneaza!");
        }
        set.add("Supradefinire");
        set.add("Supraincarcare");
        System.out.println(set);
    }
}