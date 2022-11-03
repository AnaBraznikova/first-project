public class SecondClassInProgramm {
    public static void main(String[] args) {






        //у каждой переменной есть свой тип данных
        //целое число
        //дробное число
        //символ
        //у каждой переменной есть название

        //у переменной МОЖЕТ БЫТЬ какое-то значение


        //целое число
        // int - тип переменной
        // a b c - название переменной
        int a;
        int b = 7;
        int d = 8;
        int g = 15;
        //int c = 7.1; так делать нельзя

        System.out.println(b + b + b);
        a = 5; //первый раз создав переменную не нужно писать int каждый раз
        b = 4;
        System.out.println(b + b + b);

        b = a; // = - знак присвоения

        System.out.println(b); // 7 - переменная
        System.out.println("b");// b - прямая цитата
        System.out.println(b + b + b);// 21
        System.out.println(b + d + g);// 30
        System.out.println(a + b);//12


        System.out.println(b); //5
        b = b + 1;
        System.out.println(b); //6
        b = b / 2;
        System.out.println(b); //3
        b = b * 2;
        System.out.println(b); //6
        b = b + a; // сначала операции, а потом присвоение (короткая запись b += a;


        System.out.println(b);
        b += 1; // равна b = b +1;
        System.out.println(b);
        b /= 2; // b = b / 2;
        System.out.println(b);

        b -= 1; //b = b - 1
        b *= 2; //b = b * 2
        b %= 5; //b = b % 5

        b = a + a; // короткой записи не существует, потому, что значение a взято из других "коробочек"
        //b += a; (b = b + a);

        b = b + b / 2;
        b += b / 2;

        b = b + 1; //b += 1;

        System.out.println("______________");
        System.out.println(b); // (23)
        b++; // короткая запись что бы прибавить единицу (24) - инкремент
        System.out.println(b);
        b--; // короткая запись что бы отнять единицу (23) - декремент
        System.out.println(b);
        System.out.println("_______________");










    }
}
