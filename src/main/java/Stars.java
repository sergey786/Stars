public class Stars {
    public static void main(String[] args) {
        int STARS;
        int i = 0;
        while (i <= 5) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");

            }
            System.out.println();
            i++;
        }
    }
}
