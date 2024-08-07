public class AverageCalculator {

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 30};
        double average = calculateAverage(numbers);
        System.out.println("The average is: " + average);
    }

    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            System.out.println("The array is empty.");
            return 0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }
}
