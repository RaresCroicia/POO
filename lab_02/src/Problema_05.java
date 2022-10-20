import java.util.*;

public class Problema_05 {

    boolean exista(String text, String[] cuvinte){
        for(String cuvant : cuvinte)
            if(text.equals(cuvant))
                return true;
        return false;
    }

    String steluta(String text){
        String ans = new String();
        ans += text.charAt(0);
        for(int i = 0; i < text.length() - 2; i++)
            ans += '*';
        ans += text.charAt(text.length() - 1);
        return ans;
    }
    String cenzurare(String text, String[] cuvinte){
        String[] textSpart = text.split(" ");
        String ans = new String();
        boolean ok = true;
        String[] newString = new String[textSpart.length];
        for(String cuv : textSpart){
            Problema_05 obj = new Problema_05();
            if(obj.exista(cuv, cuvinte)) {
                ok = false;
                ans += steluta(cuv);
            }
            else{
                ans += cuv;
            }
            ans += ' ';
        }
        System.out.println(ok ? "Nimic suspect" : "Text suspect");
        return ans;
    }

    public static void main(String[] args){
        String text = "Un terorist avea o bomba";
        String cuvinte[] = new String[2];
        cuvinte[0] = "terorist";
        cuvinte[1] = "bomba";
        Problema_05 prb5 = new Problema_05();
        String rezultat;
        rezultat = prb5.cenzurare(text, cuvinte);
        System.out.println(rezultat);
    }

}
