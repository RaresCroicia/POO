public class FortyStrategy implements Strategy{
    @Override
    public float calcul(int aniVechime, float salariu) {
        return aniVechime / 40.0f * salariu;
    }
}
