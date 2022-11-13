public class HomeworkChina {
    public static void main(String[] args) {


        //Level 1 : В китае живет 1 411 778 724 человек, всего в мире 197 стран.
        //Сколько бы человек жило на земле, если бы в каждой стране жило население, равно китайскому?
        //Level 2 : Феликс прожил 3 011 456 567 секунд. Сколько лет прожил Феликс?
        // посчитать используя JAVA, long-переменные и деление.



        long humansInChina = 1_411_778_724; // ставится L только если значение не влазит в int
        int countriesInTheWorld = 197;
        long humanPopulationAsChinaInTheWorld = humansInChina * countriesInTheWorld;


        // int * int = int
        // long * int = long

        System.out.println(humanPopulationAsChinaInTheWorld); // 278_120_408_628


        long FelixLifeInSec = 3_011_456_567L;
        long FelixLifeInHour = FelixLifeInSec / 3600;
        long FelixLifeInDays = FelixLifeInHour / 24;
        long FelixLifeInYears = FelixLifeInDays / 365;

        System.out.println(FelixLifeInYears);//95

    }
}
