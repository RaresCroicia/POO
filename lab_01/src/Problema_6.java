public class Problema_6 {
    public boolean is_prime(int nr){
        if(nr == 1) return true; // pentru problema 7
        if(nr < 2 || (nr != 2 && nr%2 == 0)) return false;
        for(int i = 3; i * i <= nr; i += 2)
            if(nr % i == 0)
                return false;
        return true;
    }
    public static void main(String args[]){
        Problema_6 obiect = new Problema_6();
        for(int i = 0; i < 20; i++) {
            String mesaj = obiect.is_prime(i) == true ? " este prim!" : " nu este prim!";
            System.out.println("Numarul " + i + mesaj);
        }
    }
}
