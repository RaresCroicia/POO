public class Numar {
    int nr;
    Numar(int nr){
        this.nr = nr;
    }
    public int suma(int a){
        return this.nr + a;
    }
    public int suma(int a, int b){
        return this.nr + a + b;
    }
    public int suma(int a, int b, int c){
        return this.nr + a + b + c;
    }
    public int suma(int a, int b, int c, int d){
        return this.nr + a + b + c + d;
    }

    public static void main(String[] args){
        Numar obj = new Numar(10);
        System.out.println(obj.suma(5));
        System.out.println(obj.suma(5, 2));
        System.out.println(obj.suma(5, 2, 1));
    }
}
