import java.util.Scanner;

public class SixthClassConditionThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bob = scanner.nextInt();
        int martin = scanner.nextInt();

      //  if (bob >= 21) {
      //      if (martin >= 21) {
      //          System.out.println("Оба друга могут идти в клуб");//если и бобу и Мартину будет
      //          // 21 год и больше
      //      }
      //      else {
      //          System.out.println("Они пройти не смогут, идут домой");
      //      }
      //      }
      //      else {
      //          System.out.println("Они пройти не смогут, идут домой");
      //      }
      //  }

        // if без else может сущ. а else без if - нет. сверху в задаче, не смогут пройти оба,
        // кто-то из них младше 21


        // более правильный способ записи

        if (bob >= 21 && martin >= 21) {
            //условие выполнится, токо если оба больше 21 года
            System.out.println("Идут в клуб");
        }
        else {
            System.out.println("Не идут в клуб");
        }
        }



// оператор && двойном амперсанд


        //1:17 Dania 6 lesson

        //Два друга хотят пойти в клуб. Они вводят свой возраст в программу, если их возраст больше 21
        //то их пустят. Если только один из них старше 21, то они оба не пойдут в клуб.

        // if (bob >= 21) {
        //     System.out.println("Боб подходит");
        // }
        // else {
        //     System.out.println("Боб, сиди дома");
        // }
        // if (martin > 21) {
        //     System.out.println("Мартин подходит");
        // }
        // else {
        //     System.out.println("Мартин, сиди дома");
        // }

    }


