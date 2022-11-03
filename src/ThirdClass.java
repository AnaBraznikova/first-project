public class ThirdClass {
    public static void main(String[] args) {

        //flat
        //double

        //char

        //boolean - логический
        // true, false // правда или ложь // 1 или 0 // можем спрашивать правда то или иное утверждение,
        // либо можно сравнить утверждения

        boolean raining = true; // or false
        System.out.println(raining);

        raining = false;
        System.out.println(raining);

        raining = true;
        System.out.println(raining);

        int teaTemperature = 80;

        boolean hot = (teaTemperature) > 100; // 80>100 false
        System.out.println(hot);

        System.out.println("_______");

        double myTemperature = 37.5;
        double normalTemperature = 36.6;

        boolean ill = (myTemperature > normalTemperature);
        System.out.println(ill);

        int bowlingStrike = 10; //(hardcode)
        int myScore = 10;

        boolean canIGetStrike = (bowlingStrike == myScore);

        System.out.println(canIGetStrike);

        //два одинаковых, если рост двух людей не одинаковый, то хотим увидеть true,
        // если одинаковый, то false
        int firstPerson = 181;
        int secondPerson = 181;

        //boolean similar = !(firstPerson == secondPerson); // восклицательный знак исп. как частица НЕ,
        // и true превращается в false

       // System.out.println(similar); //false

        boolean similar = (firstPerson != secondPerson);

        System.out.println(similar); //false
        //> - больше
        //< - меньше
        //<= - меньше или равно
        //>= - больше или равно
        //== - равно
        //!= - не равно
        //!- отрицание

        //мама дала васе 1000 руб, у него осталось 1000 руб после похода в магазин,
        // если купил, выводим true,
        // если не купил - выводим false

        // Петя имеет средний балл 3.49. Он очень хочет пятерку за четверть.
        // Он уверен, что сможет улучшить средний балл на +1 (подсказка: будет 4.49)
        // Получить ли он 5? true - если да, false - если нет.

        System.out.println("______");
        int cash = 1000;
        int store = 1000;


        boolean buy = (cash != store); //false
        System.out.println(buy);


        double Petya = 3.49;
        double SrednijBall = Petya + 1 ;


        boolean PjatjChetvertj = !(4.5 >= SrednijBall);
        System.out.println(PjatjChetvertj);// false







    }
}
