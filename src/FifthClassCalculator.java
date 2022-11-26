import java.util.Scanner;

public class FifthClassCalculator {
    public static void main(String[] args) {
      //  Scanner s = new Scanner(System.in);
        //int first = s.nextInt();
        //int second = s.nextInt(); // пл порядку вызова, будет первое число и второе число

        //System.out.println(first + second);

        // Бил - акула с уолл-стрит. Он быстро зарабатывает, но и быстро теряет деньги
        // За вчера Бил умножил свой капитал в 5 раз, а сегодня утром потерял 100_000_000 долларов,
        // а вечером снова удвоил свой капитал

        // Бил хочет, чтобы мы записали такую программу: он вводит одно число - количество денег, которое было позавчера
        // вы должны узнать сколько у него сейчас



           Scanner BillMoney = new Scanner(System.in);
        long money = BillMoney.nextLong();
        long moneyYesterday = money * 5;
        long moneyThisMorning = moneyYesterday - 100_000_000;
        long moneyThisEvening = moneyThisMorning * 2;

          //  System.out.println("Бил, сколько денег у тебя было до всего: " + moneyThisEvening + " Euro");




        //доп. задача : вводится число, проверить кончается ли оно на 4

            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();


            int lastNumber = x % 10;
            boolean answer = (lastNumber == 4);
             System.out.println(answer);


            // 4,14,24,34,44,54....68754
            // % - деление с остатком
            // System.out.println(x % 10);// 7968 -> 8 ; 68769 -> 9 ; 342 -> 2;





    }

}
