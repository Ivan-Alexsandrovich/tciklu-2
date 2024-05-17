public class Main {
    public static void main(String[] args) {
        System.out.println("number1");
        int sum = 0;
        int month = 12;
        while (sum < 2_459_000) {
            sum += 15000;
            month++;
        }

        System.out.println("«Месяц " + month + ", сумма накоплений равна " + sum + " рублей» .");
        System.out.println();
        {
        }
        System.out.println("number2");
        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("number3");

        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        for (int year = 1; year <= 10; year++) {
            population = population + (birthRate - deathRate) * population / 1000;
            {
                System.out.println(" «Год " + year + ", численность населения составляет " + population + "».");
            }
        }
        System.out.println();
        System.out.println("number4");
        {
            int deposit = 15000;
            int monch = 1;
            while (deposit < 12_000_000) {
                deposit = deposit + (int) (deposit * 0.07);
                monch++;
                System.out.println(" Месяц " + +monch + " , сумма : " + deposit);
            }
        }
        {
            System.out.println();
            System.out.println("number5");
            int deposit = 15000;
            int monch = 1;
            while (deposit < 12_000_000) {
                deposit = deposit + (int) (deposit * 0.07);
                if (monch % 6 == 0) {
                    System.out.println(" Месяц " + monch + " , сумма : " + deposit);
                }
                monch++;
                {
                }
            }
        }
        System.out.println();
        System.out.println("number6");
        int deposit = 15000;
        var period = 9 * 12;
        for (int monch = 1; monch < period; monch++) {
            deposit = deposit + (int) (deposit * 0.07);
            if (monch % 6 == 0) {
                System.out.println(" Месяц " + monch + " , сумма : " + deposit);
            }
        }
        System.out.println();
        System.out.println("number7");
        for (int day = 1; day <= 31; day += 7) {
            System.out.println(" «Сегодня пятница," + day + "е число. Необходимо подготовить отчет».");

        }
        System.out.println();
        System.out.println("number8");
        for (int year = 0; year < 2024 + 100; year += 79) {
            if (year >= 2024 - 200) {
                System.out.println(year);

            }


        }
    }
}