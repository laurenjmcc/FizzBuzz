public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        int limit = 1000;

        for (int i = 1; i <= limit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
