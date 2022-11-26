import java.util.Scanner;

public class SixthClassConditionFourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 16 && age < 65) {
            System.out.println("Не время отдыхать");
        } else if (age < 16) { // когда есть противоречивые условия, нужно использовать else if
            System.out.println("Пока рано работать");
        } else {
            System.out.println("Вам работать поздно");
        }


    }
}


//else {
//            System.out.println("Пока слишком рано или уже поздно для работы");
//        }         запись не слишком точное