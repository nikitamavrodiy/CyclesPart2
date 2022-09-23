public class Main {
    public static void main(String[] args) {
//        Домашнее задание - 1.
//        Задание 1.
        int bank = 0;
        int monthly = 15000;
        int goal = 2_459_000;
        int monthNumber = 0;
        while (bank < goal) {
            monthNumber++;
            bank = bank + bank / 100;
            bank += monthly;
            System.out.println("Месяц "+ monthNumber +", сумма накоплений равна "+ bank +" рублей");
        }

//        Задание 2.
        int x = 0;
        while (x < 10) {
            x++;
            System.out.print(x +" ");
        }
        System.out.println();
        for (; x > 0; x--) {
            System.out.print(x +" ");
        }
        System.out.println();

//        Задание 3.
        int fertility = 17;
        int mortality = 8;
        int totalPopulation = 12_000_000;

        for (int i = 1; i <= 10; i++) {
            totalPopulation += totalPopulation / 1000 * (fertility - mortality);
            System.out.println("Год "+i+", численность населения составляет "+totalPopulation);
        }

//        Домашнее задание - 2.
//        Задание 1.
        int bankVasiliy = 15000;
        for (int i = 1; bankVasiliy < 12_000_000; i++) {
            bankVasiliy += bankVasiliy / 100 * 7;
            System.out.println("Месяц "+ i +", сумма накоплений равна "+ bankVasiliy +" рублей");
        }

//        Задание 2.
        bankVasiliy = 15000;
        for (int i = 1; bankVasiliy < 12_000_000; i++) {
            bankVasiliy += bankVasiliy / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + bankVasiliy + " рублей");
            }
        }

//        Задание 3.
        bankVasiliy = 15000;
        for (int i = 1; i <= 9*12; i++) {
            bankVasiliy += bankVasiliy / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + bankVasiliy + " рублей");
            }
        }

//        Задание 4.
        int firstFriday = 3;
        for (int date = 1; date <= 31; date++) {
            if (date % 7 == firstFriday) {
                System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет.");
            }
        }

//        Домашнее задание - 3.
//        Задание 1.
        System.out.println("За последнии 200 лет комета появлялась в:");
        int year = 0;
        do {
            year += 79;
            if (year >= 2022 - 200 && year <= 2022) {
                System.out.println(year);
            } else if (year > 2022) {
                System.out.println("Следующая комета появится в "+year+" году");
            }
        } while (year <= 2022);

//        Задание 2.
        for (int i = 1; i<=10; i++) {
            System.out.println("2*"+i+"="+i*2);
        }
    }
}