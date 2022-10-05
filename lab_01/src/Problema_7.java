public class Problema_7 {
    public void goldbach(int nr){
        Problema_6 obiect = new Problema_6();
        for(int i = 1; i <= nr/2; i++){
            if(obiect.is_prime(i) && obiect.is_prime(nr-i))
                System.out.println(nr + "=" + i + "+" + (nr-i));
        }
    }

    public static void main(String args[]) {
        int magicNumber = 24;
        Problema_7 obiect = new Problema_7();
        obiect.goldbach(magicNumber);
    }
}
