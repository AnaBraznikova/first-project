import java.util.Scanner;

public class SixthClassConditionSecond {
    public static void main(String[] args) {
        // вложенные условия
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();

        if (money <= 0) {
            System.out.println("Бил, всё пропало! Ты банкрот");
        } else {
            System.out.println("Бил, да ты богат!");
        }


        if (money > 1000) {
            System.out.println("Бил тебе ещё и на аренду может хватить");
        }




    }
}

