public class Main {
    public static void main(String[] args) {

        // задание 1

        System.out.println("Задание 1");

        int one = 1;
        System.out.println("Значение переменной one с типом int равно 1");
        byte two = 2;
        System.out.println("Значение переменной two с типом byte равно 2");
        short three = 3;
        System.out.println("Значение переменной three с типом short равно 3");
        long four = 4;
        System.out.println("Значение переменной four с типом long равно 4");
        float five = 5;
        System.out.println("Значение переменной five с типом float равно 5");
        double six = 6;
        System.out.println("Значение переменной six с типом double равно 6");


        // задание 2

        System.out.println("Задание 2");

        int fiveHundredSixtyNine = 569;
        System.out.println("Значение переменной fiveHundredSixtyNine с типом int равно 569");
        byte sixtySeven = 67;
        System.out.println("Значение переменной sixtySeven с типом byte равно 67");
        short twoSeven = 27897;
        System.out.println("Значение переменной twoSeven с типом short равно 27897");
        long twelveDigits = 987678965549L;
        System.out.println("Значение переменной twelveDigits с типом long равно  987678965549L");
        float twoPoint = 2.786f;
        System.out.println("Значение переменной twoPoint с типом float равно 2.786f");
        double twentySeven = 27.12;
        System.out.println("Значение переменной twentySeven с типом double равно 27.12");



        // задание 3

        System.out.println("Задание 3");

        short sheetsPaper = 480;
        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte catherineAndreyevna = 30;
        byte totalNumberStudents = 80;
        int paperStudent = sheetsPaper / totalNumberStudents;
        System.out.println("На каждого ученика рассчитано" + " " + paperStudent + " " +  "листов бумаги");


        // задание 4

        System.out.println("Задание 4");

        byte bottles = 16;
        byte efficiency = 2;
        System.out.println("За 2 минуты машина делает 16 бутылок");
        byte minutes = 20;
        byte ttwo = 2;
        int division = minutes / ttwo;
        System.out.println("20 делим на 2, получаем " + " " + division);
        int multiply = bottles * division;
        System.out.println("За 20 минут, машина делает" + " " + multiply + " " + " бутылок");

        System.out.println("За 20 минут машина делает 160 бутылок, 20 умножаем на 3");
        byte minutes2 = 20;
        byte tri = 3;
        int multiplication =  minutes2 * tri;
        System.out.println("Получится" + " " + multiplication);
        System.out.println("За 60 минут машина делает 480 бутылок");
        System.out.println("Нам нужно узнать сколько бутылок за сутки делает машина");
        System.out.println("480 умножаем на 24");
        byte day = 24;
        short bottlesPerHour = 480;
        int multiplication2 = day * bottlesPerHour;
        System.out.println("За сутки машина делает" + " " + multiplication2 + " " + "бутылок");


        System.out.println("Нужно узнать сколько бутылок делает машина за 3 дня");
        System.out.println("В 3 сутках 72 часа, за сутки машина делает 11 520, нужно 11520 * на 72");
        byte threeDays = 72;
        int numberBottles = 11520;
        int multiplication3 = numberBottles * threeDays;
        System.out.println ("За 3 суток машины  делает" + " " + multiplication3 + " " +  "бутылок" );

        System.out.println("Нужно узнать сколько бутылок делает машина за 30 дней");
        System.out.println("В 30 сутках 720 часов, за сутки машина делает 11520 бутылок");
        int sevenHundredTwenty = 720;
        int bottles4 = 11520;
        long multiplication4 = sevenHundredTwenty * bottles4;
        System.out.println("За 30 дней  машины  делает" + " " + multiplication4 + " " +  "бутылок");


        // Задание 5

        System.out.println("Задание 5");


        byte totalNumberCans = 120;
        byte forOneClass = 6;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int  division2 = totalNumberCans / forOneClass;
        int addition =  division2 * whitePaint;
        int addition2 = division2 * brownPaint;
        System.out.println("В школе, где" + " " + division2 + " " +  "классов, нужно" + " " +  addition + " " +  "банок белой краски и" + " " + addition2 + " " +  "банок коричневой краски");


        // Задание 6

        System.out.println("Задание 6 ");

        byte bananas = 5;
        byte oneBanana = 80;
        int multiplication6 = bananas * oneBanana;
        System.out.println(multiplication6);

        int milk = 200;
        byte milkML = 100;
        int gramm = 105;
        int division1 = milk /  milkML;
        int  multiplication7 =  gramm * division1;
        System.out.println(multiplication7);

        byte iceCream = 2;
        byte gramm2 = 100;
        int iceCreamGramm2 = iceCream * gramm2;
        System.out.println (iceCreamGramm2);

        byte eggs = 4;
        byte gramm3 = 70;
        int eggsGramm3 = eggs * gramm3;
        System.out.println(eggsGramm3);
        int kilogram = multiplication6 + multiplication7 + iceCreamGramm2 + eggsGramm3;
        System.out.println("Вес спорт завтрока в кг" + " " + kilogram);

        // Задание 7

        System.out.println("Задание 7");

        int KG = 7000;
        int gramm4 = 250;
        int KGgramm4 = KG / gramm4;
        System.out.println("7 кг перевели в граммы и разделили на 250 грамм");
        System.out.println("На данном рационе спортсмен сбросит 7 кг за" + " " + KGgramm4);
        int KG1 = 7000;
        int gramm5 = 500;
        int KG1gramm5 = KG1 /  gramm5;
        System.out.println("На данном рационе спортсмен сбросит 7 кг за" + " " + KG1gramm5);
        System.out.println("В среднем спортсмен придет в форму на 20 дней");

        // Задание 8

        System.out.println("Задание 8");

        int Masha = 67760;
        int PR = 6776;
        byte month = 12;
        int MashaPR = Masha + PR;
        int Mashamonth = Masha * month;
        int newSalary = MashaPR * month;
        System.out.println("При нынешней ЗП,Masha в год,  зарабвтывает" + " "  +Mashamonth + ". " +  "при новой ЗП" + " " + MashaPR + " в год , Masha будет зарабатывать" + " " + newSalary );

        int Denis = 83690;
        int PR1 = 8369;
        byte month1 = 12;
        int DenisPR1 = Denis + PR1;
        int DenisMonth1 = Denis *  month1;
        int new1 = DenisPR1 * month1;
        System.out.println("При нынешней ЗП, Denis в год зарабатывает " + " " + DenisMonth1 + ", при новой зарплате" + " " +  DenisPR1 + " " + " Denis будет зарабатывать" + " " + new1 );

        int Kristina  = 76230;
        int PR2 = 7623;
        byte month2 = 12;
        int KristinaPR2 = Kristina + PR2;
        int Kristinamonth2 = Kristina * month2;
        int new2 = KristinaPR2 * month2;
        System.out.println("При нынешней ЗП, Kristina в год зарабатывает " + " " + Kristinamonth2 + ", при новой зарплате" + " " + KristinaPR2 + " " + "  Kristina будет зарабатывать" + " " + new2 );


    }


}

