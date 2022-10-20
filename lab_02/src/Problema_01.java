public class Problema_01 {

    public int getOccurrences_01(String s1, String s2){
        int occurrences = 0;
        for(int i = 0; i < s1.length() - s2.length(); i++){
            if(s1.substring(i, i + s2.length()).equals(s2))
                occurrences++;
        }
        return occurrences;
    }

    public int getOccurrences_02(String s1, String s2){
        int pos = 0;
        int occurrences = 0;
        if(s1.indexOf(s2) == -1)
            return occurrences;
        while(pos != -1){
            pos = s1.indexOf(s2, pos);
            if(pos == -1)
                break;
            occurrences++;
            s1 = s1.substring(pos + s2.length());
        }
        return occurrences;
    }

    public static void main(String[] args){
        Problema_01 object = new Problema_01();
        String s1 = "si";
        String s = "sir1 si cu sir2 fac un sir3";
        int occ_1 = object.getOccurrences_01(s, s1);
        System.out.println("Functia #1: " + occ_1);
        int occ_2 = object.getOccurrences_02(s, s1);
        System.out.println("Functia #2: " + occ_2);
    }
}
