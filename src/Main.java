public class Main {
    public static void main(String[] args) {

        int ticketPrice = 4_000; //цена билета
        int bonusPrice = 20; // за каждые 20 рублей начисляется одна миля

        int bonus = ticketPrice / bonusPrice; // расчитывается сколько бонусных миль будет начисленно

        System.out.println(bonus);
        System.out.println();
        System.out.println("При цене билета " + ticketPrice + " рублей, начисляется " + bonus + " бонусных миль");
    }
}