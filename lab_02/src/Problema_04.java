import java.util.*;

public class Problema_04 {
    Vector reuniune(Vector set1, Vector set2){
        Vector setFinal = new Vector();
        for(int i = 0; i < set1.size(); i++){
            setFinal.add(set1.elementAt(i));
        }
        for(int i = 0; i < set2.size(); i++){
            if(!setFinal.contains(set2.elementAt(i)))
                setFinal.add(set2.elementAt(i));
        }
        return setFinal;
    }

    Vector intersectie(Vector set1, Vector set2){
        Vector setFinal = new Vector();
        for(int i = 0; i < set1.size(); i++)
            if(set2.contains(set1.elementAt(i)))
                setFinal.add(set1.elementAt(i));
        return setFinal;
    }

    Vector diferenta(Vector set1, Vector set2){
        Vector setFinal = new Vector();
        for(int i = 0; i < set1.size(); i++)
            setFinal.add(set1.elementAt(i));
        for(int i = 0; i < set2.size(); i++){
            if(setFinal.contains(set2.elementAt(i)))
                setFinal.removeElement(set2.elementAt(i));
        }
        return setFinal;
    }

    public static void main(String[] args){
        Vector set1 = new Vector();
        Vector set2 = new Vector();

        Random gen = new Random();
        for(int i = 0; i < 10; i++){
            set1.add(i);
            set2.add(i + 1);
        }

        System.out.println("Set 1: ");
        for(int i = 0; i < set1.size(); i++){
            System.out.println(set1.elementAt(i));
        }

        System.out.println("Set 2: ");
        for(int i = 0; i < set2.size(); i++){
            System.out.println(set2.elementAt(i));
        }

        Vector setNou;
        Problema_04 object = new Problema_04();
        setNou = object.reuniune(set1, set2);

        System.out.println("Set reunit: ");
        for(int i = 0; i < setNou.size(); i++){
            System.out.println(setNou.elementAt(i));
        }

        setNou = object.intersectie(set1, set2);
        System.out.println("Set intersectat: ");
        for(int i = 0; i < setNou.size(); i++){
            System.out.println(setNou.elementAt(i));
        }

        setNou = object.diferenta(set1, set2);
        System.out.println("Set diferenta (set1 - set2): ");
        for(int i = 0; i < setNou.size(); i++){
            System.out.println(setNou.elementAt(i));
        }
    }


}
