import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Problema_04 {
    public void printThose(String path){
        try {
            FileReader file = new FileReader(path);
            BufferedReader reader = new BufferedReader(file);
            TreeMap<String, LinkedList<Integer>> tm;
            tm = new TreeMap<String, LinkedList<Integer>>();
            String strCurrLine;
            int currLine = 1;
            while ((strCurrLine = reader.readLine()) != null){
                System.out.println(strCurrLine);
                String[] words = strCurrLine.split(" ");
                for(int i = 0; i < words.length; i++){
                    LinkedList<Integer> ll;
                    if(tm.containsKey(words[i])) {
                        ll = tm.get(words[i]);
                    }
                    else{
                        ll = new LinkedList<Integer>();
                    }
                    if(!ll.contains(currLine))
                        ll.add(currLine);
                    tm.put(words[i], ll);
                }
                currLine++;
            }
            Set<String> keys = tm.keySet();
            for(String key : keys){
                System.out.println(key);
                System.out.println(tm.get(key));
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Problema: nu a gasit fisierul");
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println("Probleme la IO");
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Problema_04 obj = new Problema_04();
        obj.printThose("test01.txt");
    }
}
