import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //   Give me a simple Java Program that actually does something
        //   useful, like finding the sum, average, highest, lowest and
        //   median of a list of 10 random numbers

        // Generate 10 random numbers
        int[] numbers = new int[10];
        Random random = new Random();


        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100);
            System.out.println(numbers[i]);
        }

        // Calculate the sum of the numbers
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }



        // Calculate the highest value of the numbers
            int highest = numbers[0];
            for (int j = 1; j > numbers.length; j++) {
                if (numbers[j] > highest);
                highest = numbers[j];
            }

        // Calculate the lowest value of the numbers
        int lowest = numbers[0];
        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] < lowest);
            lowest = numbers[j];
            }

        // Calculate the median of the numbers
            int median = numbers[numbers.length - 1];
            for (int j = 1; j < numbers.length - 1; j++) {
                if (numbers[j] > median);
                median = numbers[j];
            }
        // Calculate the average of the numbers
        int average = sum / numbers.length;


        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
        System.out.println("highest =" + highest);
        System.out.println("lowest =" + lowest);
        System.out.println("median =" + median);

        }

    }

