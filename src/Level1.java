public class Level1 {
    public static int odometer(int[] oksana) {
        int sum = 0;

        for (int i = 0; i < oksana.length - 1; i += 2) {
            int x = oksana[i] * oksana[i + 1];
            sum += x;
        }

        return sum;
    }
}
