public class Level1 {
    public static int odometer(int[] oksana) {
        int allMotoDistanceKm = 0;

        for (int i = 0; i < oksana.length - 1; i += 2) {
            if (i == 0) {
                allMotoDistanceKm += oksana[i] * oksana[i + 1];
            } else
                allMotoDistanceKm += oksana[i] * (oksana[i + 1] - oksana[i - 1]);

        }

        return allMotoDistanceKm;
    }
}
