public class Problema_5 {
    public int pow(int baza, int exp){
        if(exp == 0)
            return 1;
        return baza * pow(baza, exp-1);
    }

    public void print(int baza, int exp){
        System.out.println(pow(baza, exp));
    }

    public static void main(String args[]){
        int baza = 3, exp = 7;
        Problema_5 obiect = new Problema_5();
        obiect.print(baza, exp);
        System.out.println(Math.pow(baza, exp));
    }
}
