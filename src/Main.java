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
    }

    public static void task1() {
        System.out.println("Задача 1");
        int a = 33;
        System.out.println("Значение переменной 'a' с типом int равно " + a);
        byte b = 2;
        System.out.println("Значение переменной 'b' с типом byte равно " + b);
        short c = 47;
        System.out.println("Значение переменной 'c' с типом short равно " + c);
        long d = 3446523;
        System.out.println("Значение переменной 'd' с типом long равно " + d);
        float e = 4.6F;
        System.out.println("Значение переменной 'e' с типом float равно " + e);
        double i = 5.8;
        System.out.println("Значение переменной 'i' с типом double равно " + i);
        System.out.println(" ");
    }

    public static void task2() {
        System.out.println("Задача 2");
        double a = 27.12;
        System.out.println("a = " + a);
        long b = 987678965549L;
        System.out.println("b = " + b);
        float c = 2.786f;
        System.out.println("c = " + c);
        short d = 569;
        System.out.println("d = " + d);
        short e = -159;
        System.out.println("e = " + e);
        int i = 27897;
        System.out.println("i = " + i);
        byte l = 67;
        System.out.println("l = " + l);
        System.out.println(" ");
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int allStudents = class1 + class2 + class3;
        short paper = 480;
        int oneStudent = paper / allStudents;
        System.out.println("На каждого ученика рассчитано " + oneStudent + " листов бумаги");
        System.out.println(" ");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte minute2 = 16;
        int minute1 = minute2 / 2;
        int minute20 = minute1 * 20;
        System.out.println("За 20 минут машина произвела " + minute20 + " штук бутылок");
        int day1 = 60 * 24 * minute1;
        System.out.println("За сутки машина произвела " + day1 + " штук бутылок");
        int day3 = day1 * 3;
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок");
        int day30 = day1 * 30;
        System.out.println("За месяц машина произвела примерно " + day30 + " штук бутылок");
        System.out.println(" ");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte totalPaint = 120;
        byte whitePaint = 2, brownPaint = 4;
        int class1 = whitePaint + brownPaint;
        int totalClasses = totalPaint / class1;
        int totalWhite = totalClasses * whitePaint;
        int totalBrown = totalClasses * brownPaint;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");
        System.out.println(" ");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int totalWeight1 = bananas + milk + iceCream + eggs;
        float totalWeight2 = totalWeight1 / 1000F;
        System.out.println("Общий вес завтрака составляет " + totalWeight1 + " грамм, или " + totalWeight2 + " килограмм");
        System.out.println(" ");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int weightKg = 7;
        int weight = weightKg * 1000;
        System.out.println("Нужно сбросить " + weight + " грамм");
        int daysMax = weight / 250;
        System.out.println("Если терять по 250 грамм, то уйдет " + daysMax + " дней");
        int daysMin = weight / 500;
        System.out.println("Если терять по 500 грамм, то уйдет " + daysMin + " дней");
        System.out.println(" ");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int masha1 = 67760;
        int denis1 = 83690;
        int kristina1 = 76230;
        int mashaYear1 = masha1 * 12;
        int denisYear1 = denis1 * 12;
        int kristinaYear1 = kristina1 * 12;
        int masha2 = (int) (masha1 * 1.1);
        int denis2 = (int) (denis1 * 1.1);
        int kristina2 = (int) (kristina1 * 1.1);
        int mashaYear2 = masha2 * 12;
        int denisYear2 = denis2 * 12;
        int kristinaYear2 = kristina2 * 12;
        int mashaYear = mashaYear2 - mashaYear1;
        int denisYear = denisYear2 - denisYear1;
        int kristinaYear = kristinaYear2 - kristinaYear1;
        System.out.println("Маша теперь получает " + masha2 + " рублей. Годовой доход вырос на " + mashaYear + " рублей");
        System.out.println("Денис теперь получает " + denis2 + " рублей. Годовой доход вырос на " + denisYear + " рублей");
        System.out.println("Кристина теперь получает " + kristina2 + " рублей. Годовой доход вырос на " + kristinaYear + " рублей");
    }
}