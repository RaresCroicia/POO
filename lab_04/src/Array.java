import java.util.*;

public class Array {
    //Vectorul in care se vor retine elementele
    private Vector vector;

    //Constructor clasei
    public Array() {
        //Instantierea vectorului cu elemente
        vector = new Vector();
    }

    //Metoda care adauga un element in vector, folosind pozitia curenta
    public void addElement(Integer x) {
        vector.add(x);
    }

    //Metoda care adauga un element in vector, tinand cont de pozitia indicata
    public void addElement(Integer x, int poz) {
        if(poz >= 0 && poz <= vector.size()) {
            vector.add(poz, x);
        }
    }

    //Metoda care returneaza elementul aflat in vector la pozitia indicata
    public int get(int poz) {
        int result;
        if(poz >= 0 && poz < vector.size()) {
            result = (int) vector.get(poz);
            return result;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    //Metoda ce intoarce numarul de elemente din vector
    public int getSize() {
        return vector.size();
    }

    //Metoda pentru stergerea unui element din vector
    public boolean remove(Integer x) {
        return vector.remove(x);
    }

    //Metoda pentru stergerea elementului de pe pozitia pos din vector
    public Integer remove(int pos) {
        return (Integer) vector.remove(pos);
    }

    //Metoda uzitata pentru afisarea unui obiect de tip Array
    public String toString() {
        String result = "{";
        for(int i = 0; i < vector.size(); i++) {
            result += get(i) + ", ";
        }
        result += "}";
        return result;
    }

    public void sort() {
        Collections.sort(vector);
    }
}

class SortedArray extends Array{
    public void addElement(Integer x) {
        super.addElement(x);
        super.sort();
    }

}

class MyStack{
    private Array arr;
    MyStack(){
        arr = new Array();
    }

    public void push(Integer x){
        arr.addElement(x, 0);
    }

    public Integer pop(){
        if(arr.getSize() >= 0)
            return arr.remove(0);
        return Integer.MIN_VALUE;
    }

    public String toString(){
        String ans = "[";
        for(int i = 0; i < arr.getSize()-1; i++){
            ans += arr.get(i);
            ans += ",";
        }
        if(arr.getSize() >= 1){
            ans += arr.get(arr.getSize()-1);
        }
        ans += "]";
        return ans;
    }
}

class TestArr{
    public static void main(String[] args) {
        SortedArray sArr = new SortedArray();
        MyStack stack = new MyStack();
        sArr.addElement(10);
        sArr.addElement(5);
        sArr.addElement(7);
        System.out.println(sArr);
        sArr.remove((Integer)7);
        System.out.println(sArr);
        stack.push(10);
        stack.push(7);
        stack.push(100);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);

    }

}