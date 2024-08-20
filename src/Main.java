public class Main {
    public static void main(String[] args) {

        //task1
        System.out.println("task1");
        byte varB =10;
        short varS =200;
        int varI = 1000;
        long varL= 2000_000_000L;
        float varF =2.5f;
        double varD=12.12939201;
        System.out.println("Значение переменной varB с типом byte равно "+varB);
        System.out.println("Значение переменной varS с типом short равно "+varS);
        System.out.println("Значение переменной varI с типом int равно "+varI);
        System.out.println("Значение переменной varL с типом long равно "+varL);
        System.out.println("Значение переменной varF с типом float равно "+varF);
        System.out.println("Значение переменной varD с типом double равно "+varD);


        //task2
        System.out.println("task2");
        byte a =67;
        short b =569;
        short c = -159;
        long d= 987_678_965_549L;
        float i =27.12f;
        float f=2.786f;
        int g = 27897;
        System.out.println(a+","+b+","+c+","+d+","+i+","+f+","+g);

        //task3
        System.out.println("task3");
        byte class1 = 23;
        byte class2 =27;
        byte class3 =30;
        short sheetAll = 480;
        int sheetFor1 = sheetAll/(class2+class1+class3);
        System.out.println("На каждого ученика рассчитано "+sheetFor1+" листов бумаги");

        //task4
        System.out.println("task4");
        byte bottle2 = 16;
        byte time2 = 2;
        byte time20 = 20;
        short timeDay3 = 3*24*60;
        short timeHours24 = 24*60;
        int timeMonth = timeHours24*30;
        int speed=bottle2/time2;
        int bottle20 = speed*time20;
        System.out.println("«За 20 минут машина произвела "+bottle20+" штук бутылок");
        int bottleDay3 = speed*timeDay3;
        System.out.println("«За 3 дня машина произвела "+bottleDay3+" штук бутылок");
        int bottleHours24 = speed*timeHours24;
        System.out.println("«За 24 часа машина произвела "+bottleHours24+" штук бутылок");
        int bottleMonth = speed*timeMonth;
        System.out.println("«За месяц машина произвела "+bottleMonth+" штук бутылок");



        //task5
        System.out.println("task5");
        byte bankAll = 120;
        byte bankWhiteFor1=2;
        byte bankBrownFor1=4;
        int cabinet = bankAll/(bankBrownFor1+bankWhiteFor1);
        int bankWhiteAll = cabinet*bankWhiteFor1;
        int bankBrownAll = cabinet*bankBrownFor1;
        System.out.println("«В школе, где "+cabinet+ " классов, нужно "+bankWhiteAll+ " банок белой краски и "+bankBrownAll+ " банок коричневой краски»");


        //task6
        System.out.println("task6");
        int bananas = 5*80;
        int milk = (200/100)*105;
        int iceCream = 2*100;
        int eggs = 4*70;
        int weight = bananas+milk+eggs+iceCream;
        float weightKg = weight/1000f;
        System.out.println(weight+"г, "+weightKg+"кг.");

        //task7
        System.out.println("task7");
        int reset = 7*1000;
        short speed1=250;
        short speed2=500;
        int day1 = reset/speed1;
        int day2 = reset/speed2;
        int dayMean = (day2+day1)/2;
        System.out.println("При потере 250г в день требуется "+day1+ " дней." );
        System.out.println("При потере 500г в день требуется "+day2+ " дней." );
        System.out.println("В среднем для похудения на 7кг требуется "+dayMean+ " день." );
        System.out.println(day1+","+day2+","+dayMean);

        //task8
        System.out.println("task8");
        float index = 1.1f;
        int m = 67760;
        int D = 83690;
        int k = 76230;
        int m1=(int) (m* index);
        int D1=(int) (D*index);
        int k1=(int) (k*index);
        byte year = 12;
        int diffYaerM = m1*year - m*year;
        int diffYearD = D1*year-D*year;
        int diffYearK = k1*year-k*year;
        System.out.println("Маша теперь получает "+m1+ " рублей. Годовой доход вырос на "+diffYaerM+" рублей" );
        System.out.println("Денис теперь получает "+D1+ " рублей. Годовой доход вырос на "+diffYearD+" рублей" );
        System.out.println("Маша теперь получает "+k1+ " рублей. Годовой доход вырос на "+diffYearK+" рублей" );




    }
}