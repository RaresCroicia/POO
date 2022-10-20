public class Magazin {
    String nume;
    Produs prod1;
    Produs prod2;
    Produs prod3;

    public Magazin(String nume, Produs prod1, Produs prod2, Produs prod3){
        this.nume = nume;
        this.prod1 = prod1;
        this.prod2 = prod2;
        this.prod3 = prod3;
    }

    public String toString(){
        return "Magazinul " + nume + "\n" + prod1 + "\n" + prod2 + "\n" + prod3;
    }

    public double getTotalMagazin(){
        return prod1.getTotalProdus() + prod2.getTotalProdus() + prod3.getTotalProdus();
    }

    public static void main(String[] args){
        Magazin mag = new Magazin("Everything4Fantastic",
                                    new Produs("marinele", 5.77, 6),
                                    new Produs("Foietaj", 2.99, 10),
                                    new Produs("Energy Spirt", 6.9, 3));
        System.out.println(mag);
        System.out.println(mag.getTotalMagazin());
    }
}
