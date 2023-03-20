public class Main {
    public static void main(String[] args) {
        int balance = 150;
        int payment = 400;
        int bonus = 1;

        if (payment > 1000) {
            System.out.println((balance + payment) / 100 * bonus);
            System.out.println(balance + payment);
        } else {
            System.out.println (balance + payment);
        }

    }
}
