import java.util.StringTokenizer;

public class Problema_02 {

    int getOccurrences_01(String s, String s1){
        String[] substrings = s.split(" ");
        int occurrences = 0;
        for(String substring : substrings){
            if(substring.equals(s1))
                occurrences++;
        }
        return occurrences;
    }

    int getOccurrences_02(String s, String s1){
        StringTokenizer st = new StringTokenizer(s,":,.-? \n");
        int occurrences = 0;
        while(st.hasMoreTokens()){
            if(st.nextToken().equals(s1))
                occurrences++;
        }
        return occurrences;
    }

    public static void main(String[] args){
        Problema_02 object = new Problema_02();
        String s1 = "Marius, de ce nu l-ai ajutat pe George? Era de datoria ta sa vezi ce poti face.";
        String s2 = "ce";
        int occ_1 = object.getOccurrences_01(s1, s2);
        System.out.println("Functia #1: " + occ_1);
        int occ_2 = object.getOccurrences_02(s1, s2);
        System.out.println("Functia #1: " + occ_2);
    }
}
