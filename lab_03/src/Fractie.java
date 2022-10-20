public class Fractie {
    int numarator;
    int numitor;
    public Fractie(int numarator, int numitor){
        this.numarator = numarator;
        this.numitor = numitor;
    }
    public Fractie(){
        this(0,1);
    }

    public int CMMDC(int a, int b){
        int r;
        while(b != 0){
            r = a%b;
            a = b;
            b = r;
        }
        return a;
    }

    public Fractie add(Fractie added){
        Fractie ans = new Fractie(0, 0);
        ans.numarator = this.numarator * added.numitor + this.numitor * added.numarator;
        ans.numitor = this.numitor * added.numitor;
        ans.numarator /= ans.CMMDC(ans.numarator, ans.numitor);
        ans.numitor /= ans.CMMDC(ans.numarator, ans.numitor);
        return ans;
    }

    public String toString(){
        return (this.numarator + "/" + this.numitor);
    }

    public boolean equals(Object o){
        if(o == null)
            return false;
        if(!(o instanceof Fractie))
            return false;
        Fractie fr = (Fractie)o;
        if(this.numitor == fr.numitor && this.numarator == fr.numarator)
            return true;
        return false;
    }

    public static void main(String[] args){
        Fractie a = new Fractie(2, 3);
        Fractie b = new Fractie(3, 4);
        Fractie c = a.add(b);
        Fractie d = b.add(a);
        if(c.equals(d))
            System.out.println("DA");
        System.out.println(c);
    }

}
