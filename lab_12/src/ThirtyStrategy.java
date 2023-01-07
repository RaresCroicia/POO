public class ThirtyStrategy implements Strategy{
    @Override
    public float calcul(int aniVechime, float salariu) {
        return aniVechime / 30.0f * salariu;
    }
}
