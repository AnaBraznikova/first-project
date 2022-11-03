public class TypesOfData {
    public static void main(String[] args) {

        int a = 5;
        byte b = 5;
        b++;
        System.out.println(b);
        System.out.println(b * b);

        //типы данных - занимает места - диапазон целых чисел
        //BYTE          8 бит           -128..127       больше не используются, т.к. больше нет смысла думать о размере занимаемогого файла
        //SHORT         16 бит          -32768..32767   больше не используются
        //INT           32 бит          -2147483748..2147483647 с ним будем работать, исп. часто
        //LONG          64 бит          -9223372036854775808..9223372036854775807
        byte h = 127;
        h++; //-128
        System.out.println(h);
        short m = 5000;
        System.out.println(m);




        //int CountOfPeopleOfInChina - название должно быть осознано
        int china = 1_452_159_617;

      //  china++;
      //  china = china + 10;
       // System.out.println(china);
      //  china = china / 2;
       // System.out.println(china);


        //UpperCaseCamel - для классов
        //lowerCaseCamel - для переменных

        int India = 1_417_173_173;
        System.out.println(china + India); //-14_258_634_506
        //произошло переполнение ячейки

        long answer = china + India; //выдаёт ошибку, сложив два int значения. а его отнесли в long
        System.out.println(answer);
        // можно изменить Int на Long в начале, и это должно исправить ситуацию

        long chinaPlusIndia = 2_869_332_790L; // выделив большую коробку, мы хотим засунуть число поменьше,
        //JAVA выдает ошибку, пишем L в конце;
        System.out.println(chinaPlusIndia);

    }
}
