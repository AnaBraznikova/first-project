import java.util.Scanner;

public class SixthClassCondition {

    public static void main(String[] args) {


        //тело условного оператора {} та программа которая выполнится, при условии,
        // что наше условие верно. А если нет, то оно про игнорируется

        // if (идёт дождь) {
        // бери зонт;
        // }


        //  Бил хочет программу, которая проверяет банкрот ли он
        // Если у Била 0 денег на счету - напишите "всё пропало"

        // если (что-то), то делай это
        // а может быть
        //если (что-то), то делай это, иначе делай другое

        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();

        if (money <= 0) {
            System.out.println("Бил, всё пропало! Ты банкрот");
        } else {
            System.out.println("Бил, да ты богат!");
        }

        //если деньги равны 666, то делай ничего
        if (money == 666) {       //НЕ нужно ставить точку с запятой
            System.out.println("Ого, какой ужас");
        }

        // вложенное условие
    }
}