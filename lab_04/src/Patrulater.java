public class Patrulater {
    public int latura1, latura2, latura3, latura4;
    public double unghi1, unghi2, unghi3, unghi4;

    public Patrulater() {
        this(0, 0, 0, 0);
    }

    public Patrulater(int latura1, int latura2, int latura3, int latura4) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
        this.latura4 = latura4;
    }

    public Patrulater(double unghi1, double unghi2, double unghi3, double unghi4) {
        this(0, 0, 0, 0, unghi1, unghi2, unghi3, unghi4);
    }

    public Patrulater(int latura1, int latura2, int latura3, int latura4,
                      double unghi1, double unghi2, double unghi3, double unghi4) {
        this(latura1, latura2, latura3, latura4);
        this.unghi1 = unghi1;
        this.unghi2 = unghi2;
        this.unghi3 = unghi3;
        this.unghi4 = unghi4;
    }

    public int perimetru() {
        int result;
        result = latura1 + latura2 + latura3 + latura4;
        return result;
    }
}

class Paralelogram extends Patrulater{
    public Paralelogram(int latura1, int latura2, int latura3, int latura4,
                        double unghi1, double unghi2, double unghi3, double unghi4){
        super(latura1, latura2, latura3, latura4, unghi1, unghi2, unghi3, unghi4);
    }

    public Paralelogram(){
        super();
    }
    public double Area(){
        return latura1 * latura2 * Math.sin(Math.toRadians(unghi1));
    }
}


class Dreptunghi extends Paralelogram{

    public Dreptunghi(int latura1, int latura2, int latura3, int latura4,
                        double unghi1, double unghi2, double unghi3, double unghi4){
        super(latura1, latura2, latura3, latura4, unghi1, unghi2, unghi3, unghi4);
    }

    public Dreptunghi(){
        super();
    }
    public double Area(){
        return latura1 * latura2;
    }
}

class Romb extends Paralelogram{

    int diag1, diag2;

    public Romb(int latura1, int latura2, int latura3, int latura4,
                        double unghi1, double unghi2, double unghi3, double unghi4){
        super(latura1, latura2, latura3, latura4, unghi1, unghi2, unghi3, unghi4);
        diag1 = 5;
        diag2 = 10; //random
    }

    public Romb(){
        super();
        diag1 = 0;
        diag2 = 0;
    }
    public double Area(){
        return diag1*diag2 /2.0;
    }
}

class Patrat extends Dreptunghi{

    public Patrat(int latura1, int latura2, int latura3, int latura4,
                      double unghi1, double unghi2, double unghi3, double unghi4){
        super(latura1, latura2, latura3, latura4, unghi1, unghi2, unghi3, unghi4);
    }

    public Patrat(){
        super();
    }

    public double Area(){
        return latura1*latura1;
    }
}

class Test{
    public static void main(String[] args){
        Paralelogram paral = new Paralelogram(10, 5, 10, 5, 45, 135, 45, 135);
        Romb romb = new Romb(10, 5, 10, 5, 45, 135, 45, 135);
        Dreptunghi drept = new Dreptunghi(10, 5, 10, 5, 90, 90, 90 ,90);
        Patrat pat = new Patrat(10, 10, 10, 10, 90, 90, 90, 90);
        System.out.println(paral.Area());
        System.out.println(romb.Area());
        System.out.println(drept.Area());
        System.out.println(pat.Area());
    }
}