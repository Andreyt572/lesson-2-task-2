public class Main {
    public static void main(String[] args) {
        int balance = 150;
        int payment = 155112;
        int bonus = 1;

        if (payment > 1000) {
            System.out.println("Количество бонусов " + (balance + payment) / 100 * bonus);
            System.out.println("Общий баланс после пополнения " + (balance + payment));
        } else {
            System.out.println (balance + payment);
        }

    }
}
