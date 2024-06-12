//Sure! An Armstrong number (also known as a narcissistic number) is a number that is equal to the sum of its own digits each //raised to the power of the number of digits. For example, 153 is an Armstrong number because 



import java.util.Scanner;

public class ArmstrongNumber {

    // Function to count the number of digits in a number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int digits = countDigits(number);
        int sum = 0;
        
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number = number / 10;
        }
        
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it is an Armstrong number:");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
