public class Main {
    public static void main(String[] args) {

        String name = "Илья";
        int balance = 500;
        int receipts = 1100;

        int bonus = receipts > 1000 ? receipts / 100 * 1 : 0;

        System.out.println(name + "!" + " Ваш баланс составяет: " + (balance + receipts) + " рублей.");
        System.out.println("Ваш бонус составил: " + bonus + " рублей.");

    }
}
