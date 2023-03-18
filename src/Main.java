public class Main {
    public static void main(String[] args) {
        int x = 150;
        int payment1 = 1001;
        int payment2 = 500;
        int bonus = 1;

        if (payment1 > 1000) {
            System.out.println((x + payment1) / 100 * bonus);
        }
        if (payment2 < 1000) {
            System.out.println(x + payment2);
        }

    }
}
