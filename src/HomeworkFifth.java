public class HomeworkFifth {
    public static void main(String[] args) {


        // Level 1: Астерикс и Обеликс варили зелье.
        // Зелье будет сварено правильно, если его будут варить больше 5 часов. Астерикс варил
        // его 3 часа, Обеликс в два раза меньше.
        // Получится ли зелье?


        double asterix = 3.0;
        double obelix = asterix / 2;
        double GoodPoison = 5.0;


        boolean AsterixPoison = (asterix > GoodPoison);//false
        boolean ObelixPoison = (obelix > GoodPoison); //false

        System.out.println(AsterixPoison);
        System.out.println(ObelixPoison);

    }
}
