public class Level1 {
    public static int odometer(int[] oksana) {
        int sum = 0;
        int x;

        for (int i = 0; i < oksana.length - 1; i += 2) {
            if (i == 0) {
                x = oksana[i] * oksana[i + 1];
            } else
                x = oksana[i] * (oksana[i + 1] - oksana[i - 1]);

            sum += x;
        }

        return sum;
    }
}
