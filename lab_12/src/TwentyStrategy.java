public class TwentyStrategy implements Strategy{
    @Override
    public float calcul(int aniVechime, float salariu) {
        return aniVechime / 20.0f * salariu;
    }
}
