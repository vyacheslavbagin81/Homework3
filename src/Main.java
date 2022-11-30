public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }public static void task1(){
        int a = 1;
        System.out.println("Значение переменной a с типом int равно "+a);
        byte b = 2;
        System.out.println("Значение переменной b с типом byte равно "+b);
        short c = 3;
        System.out.println("Значение переменной c с типом short равно "+c);
        long d = 4L;
        System.out.println("Значение переменной d с типом long равно "+d);
        float e = 5.5f;
        System.out.println("Значение переменной e с типом float равно "+e);
        double f = 6.6;
        System.out.println("Значение переменной f с типом double равно "+f);
    }public static void task2(){
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte j = 67;
    }public static void task3(){
        byte uchLP = 23;
        byte uchAS = 27;
        byte uchEA = 30;
        short sheetTotal = 480;
        byte uchTotal = (byte) (uchAS + uchEA + uchLP);
        byte sheetOneUch = (byte) (sheetTotal/uchTotal);
        System.out.println("На каждого ученика рассчитано " + sheetOneUch + " листов бумаги");
    }public static void task4(){
        byte bottleOneMinute = 16/2;
        int bottle20Vinute = 20 * bottleOneMinute;
        System.out.println("За 20 минут машина произвела "+bottle20Vinute+"  штук бутылок");
        int bottleOneDay = 60*24*bottleOneMinute;
        System.out.println("За один день минут машина произвела "+bottleOneDay+"  штук бутылок");
        int bottle3Day = 3*bottleOneDay;
        System.out.println("За три дня минут машина произвела "+bottle3Day+"  штук бутылок");
        int bottleOneMonth = 31*bottleOneDay;
        System.out.println("За месяц минут машина произвела "+bottleOneMonth+"  штук бутылок");
    }public static void task5(){
        short klass = 120/6;
        short paintBrown = (short) (4*klass);
        short paintWhite = (short) (2*klass);
        System.out.println("В школе, где "+klass+" классов, нужно "+paintWhite+" банок белой краски и "+paintBrown+" банок коричневой краски");
    }public static void task6(){
        short banan = 5*80;
        short milk = 2*105;
        short ictCream = 2*100;
        short egg = 4*70;
        short sportPit = (short) (banan+milk+ictCream+egg);
        float sportPitKg = (float) sportPit/1000f;
        System.out.println("Спортзавтрак составляет "+sportPit+" грамм, или "+sportPitKg+" килограм");
    }public static void task7(){
        byte dif = 7;
        float min = 250f/1000f;
        float max = 500f/1000f;
        byte dayMin = (byte) (dif/min);
        byte dayMax = (byte) (dif/max);
        byte daySrednee = (byte) ((dayMax+dayMin)/2);
        System.out.println("Спортсмен сбросит 7 кг за "+dayMin+" дней если будет терять по 250 грамм в день");
        System.out.println("Спортсмен сбросит 7 кг за "+dayMax+" дней если будет терять по 500 грамм в день");
        System.out.println("Спортсмен сбросит 7 кг в среденем за "+daySrednee+" день");
    }public static void task8(){
        float zpMari = 67760;
        float gdMari = zpMari*12;
        float zpDen = 83690;
        float gdDen = zpDen*12;
        float zpKris = 76230;
        float gdKris = zpKris*12;
        float k = 1.1f;
        zpMari = zpMari*k;
        zpDen = zpDen*k;
        zpKris = zpKris*k;
        float difGdMari = zpMari*12-gdMari;
        float difGdDen = zpDen*12-gdDen;
        float difGdKris = zpKris*12-gdKris;
        System.out.println("Маша теперь получает "+zpMari+" рублей. Годовой доход вырос на "+difGdMari+" рублей");
        System.out.println("Денис теперь получает "+zpDen+" рублей. Годовой доход вырос на "+difGdDen+" рублей");
        System.out.println("Кристина теперь получает "+zpKris+" рублей. Годовой доход вырос на "+difGdKris+" рублей");
    }
}