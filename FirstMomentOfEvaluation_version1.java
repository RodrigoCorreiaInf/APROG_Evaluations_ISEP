import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year = input.nextInt();
        int inputCounter = 0;
        int leapYearCounter = 0;
        int biggestLeapYear = 0;
        double percentage;

        while (year > 999 && year < 10000) {
            inputCounter++;

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                leapYearCounter++;

                int century = (year / 100) + 1;

                System.out.print("ano bissexto = " + year + " ");
                System.out.println("século = " + century);

                if (year > biggestLeapYear && century == 20) {
                    biggestLeapYear = year;
                }

            }

            year = input.nextInt();
        }

        if (leapYearCounter > 0) {
            percentage = (double) leapYearCounter / inputCounter * 100;
            System.out.printf("%.2f%%\n", percentage);

        } else {
            System.out.println("não foi inserido qualquer ano bissexto");
        }

        System.out.println("maior ano bissexto do século 20 = " + biggestLeapYear);
    }
}



