public class PlanetWeightManager {
    public static void main(String[] args) {
        double weightOnEarth=60;
        double mass = weightOnEarth / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("Your weight on %s is %f%n",
                    p, p.surfaceWeight(mass));
    }
}
