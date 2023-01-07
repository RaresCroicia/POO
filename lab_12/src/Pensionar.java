public class Pensionar {
    public int aniVechime;
    public float salariu;
    public Strategy strategy;

    public Pensionar(int aniVechime, float salariu) {
        this.aniVechime = aniVechime;
        this.salariu = salariu;
    }

    public float getPensie() {
        if(aniVechime >= 20 && aniVechime < 30)
            strategy = new TwentyStrategy();
        else if(aniVechime >= 30 && aniVechime < 40)
            strategy = new ThirtyStrategy();
        else
            strategy = new FortyStrategy();
        return strategy.calcul(aniVechime, salariu);
    }
}
