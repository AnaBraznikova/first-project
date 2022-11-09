import javax.swing.plaf.basic.BasicArrowButton;

public class FourthClass {
    public static void main(String[] args) {
        byte a; // 1 байт - -128 до 127
        short b; // 2 байта - -32000 до 32000
        int rabbits = 5; // 4 байта -> -2 млрд. до 2 млрд.
        long time = 456_456_456_456L; // 8 байт -> очень много


        // дробные числа
        float firstNumber; // 4 байта, менее точный //5.2 * 2 = 10.4
        double secondNumber; // 8 байт, более точный // 5.2 * 2 = 10.399998


        //double number = 5 = 5.0
        double number = 5.5;
        int n = 5;
        //number = number +2; //7.5

        System.out.println(number);

        System.out.println(n / 2);//целочисленное деление 2 = int
        System.out.println( number / 2);// не-целочисленное (честное) 2.75 = double

        number++;//6.5
        System.out.println(number);

        number += 4.1;//10.6
        System.out.println(number);

        int m = 1;
        System.out.println(m / 2);//0, т.к. int делит на большее число плохо, он будет писать просто 0,
        //лучше использовать double
        System.out.println(0.1 * 3);// 0.30000000004

        // double = 1 - 0.9 = 0.1 (0.09999999998)

        float f = 1.0F; //( маленькую или большую F )

        System.out.println(f - 0.9F);// 1.0-0.9=0.1 (0.100000024)

        System.out.println(0.1 * 3.0F); // 0.300000000004






        // Вася получает зарплату в 5,6 евро в час. Он работает 12 часов в день,
        // у него нет выходныхЮ кроме 31 декабря. Он работает 364 дня в году.
        // Сколько часов отработает Вася за год и сколько заработает денег

        double vasiaSalaryOfYear = 364 * 12 * 5.6;// double потому что есть дробное число
            int days = 364;
            int hoursPerDays = 12;


        System.out.println(vasiaSalaryOfYear);// 24.460,8 EUR
        System.out.println(days * hoursPerDays);//4368
        //Ему дали отпуск в течение двух недель, он оплачивается 50% от ЗП, пересчитайте ЗП за год

        double vasiaSalaryWithoutVacation = ((364 - 14) * 12 * 5.6); //23520.0
        System.out.println(vasiaSalaryWithoutVacation);

        double vasiaOtpusk = (14 * 12 * 5.6) / 2; //470.4
        System.out.println(vasiaOtpusk);


        double VasiaZarplataGod = vasiaSalaryWithoutVacation + vasiaOtpusk;

        System.out.println(vasiaSalaryWithoutVacation + vasiaOtpusk); //23990.4



        //right version
        //double salaryForHour = 5.6;
        //double salaryForDay = salaryForHour * 12;
        //double salaryForYear = salaryForDay * 364;
        //System.out.println(salaryForYear); // 24460.799999996
        // double cashfromWork = salaryForHour * hoursPerDay * (days -14); // s * h * 350


        System.out.println("______++++_____");

        //символьный тип данных // ASCII Code Chart

        char s; //2 байта, допустим вводится пароль, как его проверить, какой символ
        char symbol = '3'; //только один символ или цифра, никаких слов или сочетаний

        System.out.println(symbol);//3

        char symbol2 = '2';
        System.out.println(symbol2 + 0); //50 выводит значение символа

        char symbol35 = 'a' + 1; // прибавляет к символу 1 ,т.е. будет b.
        System.out.println(symbol35); //b

        char symbol69 = 'b' - 2;
        System.out.println(symbol69); // = `






        //логический тип данных




    }
}
