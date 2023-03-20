
//Завдання 4
//
//Створіть три перевантажені методи для пошуку середнього арифметичного числа з 3, 4, 5 змінних,
// створіть метод для пошуку мінімального, максимального та середнього значень серед цих трьох методів.

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rndNumbers = new Random();

        MinAverageMaxNumbers(rndNumbers);
    }

    static void MinAverageMaxNumbers(Random rndNumbers){

        double min = ArithmeticMean (rndNumbers.nextInt(100), rndNumbers.nextInt(100), rndNumbers.nextInt(100));

        double average = ArithmeticMean (rndNumbers.nextInt(100), rndNumbers.nextInt(100), rndNumbers.nextInt(100),
                rndNumbers.nextInt(100));

        double max = ArithmeticMean (rndNumbers.nextInt(100), rndNumbers.nextInt(100), rndNumbers.nextInt(100),
                rndNumbers.nextInt(100), rndNumbers.nextInt(100));

        while(!(min<average && average<max)) {
            if (max < average) {
                double temp = max;
                max = average;
                average = temp;
            }

            if (average < min) {
                double temp = average;
                average = min;
                min = temp;
            }
        }

        System.out.println("Мінальне середнє арифметичне: " + min);
        System.out.println("Середнє середнє арифметичне: " + average); //Прикольна товтологія )))
        System.out.println("Максимальне середнє арифметичне: " + max);
    }
    static double ArithmeticMean (int num1, int num2, int num3){
        double arithmeticMeanNums = ((double)num1+num2+num3)/3;

        System.out.printf("Середнє арифметичне чисел %1$s | %2$s | %3$s дорівнює %4$.2f %n",
                num1, num2, num3, arithmeticMeanNums);

        return arithmeticMeanNums;
    }

    static double ArithmeticMean (int num1, int num2, int num3, int num4){
        double arithmeticMeanNums = ((double)num1+num2+num3+num4)/4;

        System.out.printf("Середнє арифметичне чисел %1$s | %2$s | %3$s | %4$s дорівнює %5$.2f %n",
                num1, num2, num3, num4, arithmeticMeanNums);

        return arithmeticMeanNums;
    }

    static double ArithmeticMean (int num1, int num2, int num3, int num4, int num5){
        double arithmeticMeanNums = ((double)num1+num2+num3+num4+num5)/5;

        System.out.printf("Середнє арифметичне чисел %1$s | %2$s | %3$s | %4$s | %5$s дорівнює %6$.2f %n",
                num1, num2, num3, num4, num5, arithmeticMeanNums);

        return arithmeticMeanNums;
    }
}