import java.util.Scanner;

public class SixthClassConditionFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //Если номер равен 16 ИЛИ 13, то мы едем на нем
        // Иначе ждем

        // или -  || (pipes)
        // и - &&

         /*  if (number == 13 || number == 16) {
            System.out.println("Едем");
        }
        else {
            System.out.println("Ждём");
      */
        // number = 75
        // sunday
        // false и true - false


        // number =13
        // not sunday
        // true && false = false




   /*     // 13 или (сегодня воскресенье и 16) сначала посчитает то, что в скобках = то что с амперсандом ИЛИ
        if (number == 13 || (number == 16 && todayIsSunday)) {
            System.out.println("Едем");
        } else {
            System.out.println("Ждём");

*/

        // Ввод число, если оно больше-равно чем 5000, то написать "это уже город"
        // Если число меньше 5000, но больше-равно 500 жителей, то написать "Это поселок"
        // Если меньше 500 жителей, то это "Село-деревня"

        // Усложнение - если введено неверное значение, то написать "ERROR" (например < 0)

        if (number >= 500 && number < 5000) {
            System.out.println("Это поселок");
        } else if (number < 500) { // когда есть противоречивые условия, нужно использовать else if
            System.out.println("Это село");
        } else {
            System.out.println("Это город");
        }


    }
}
