import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;
import java.io.FileReader;

class descendingComparator implements Comparator<String>{
    public int compare(String i1, String i2){
        return i2.compareTo(i1);
    }
}

public class Problema_01 {
    public TreeSet printWords(String path){
        try {
        FileReader file = new FileReader(path);
        BufferedReader reader = new BufferedReader(file);
        TreeSet tset = new TreeSet();
        String strCurrLine;
        while ((strCurrLine = reader.readLine()) != null){
            System.out.println(strCurrLine);
            String[] words = strCurrLine.split(" ");
            for(int i = 0; i < words.length; i++)
                tset.add(words[i]);
            //tset.add(strCurrLine);
        }

        return tset;
        }
        catch (FileNotFoundException e){
            System.out.println("Problema: nu a gasit fisierul");
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println("Probleme la IO");
            e.printStackTrace();
        }
        return null;
    }

    public TreeSet printWordsComparator(TreeSet ts){
        TreeSet tset = new TreeSet(new descendingComparator());
        for(Object value : ts){
            tset.add(value);
        }
        return tset;
    }

    public static void main(String[] args){
        Problema_01 obj = new Problema_01();
        TreeSet tset = obj.printWords("test01.txt");
        System.out.println(tset);
        TreeSet tsetDesc = obj.printWordsComparator(tset);
        System.out.println(tsetDesc);

    }
}
