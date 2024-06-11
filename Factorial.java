


import java.util.Scanner;

class Use {
    int factorial(int n) {
        if (n < 0) {
            System.out.println("Invalid number");
            return -1; // Sentinel value to indicate an error
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        Use U = new Use();
        int result = U.factorial(a);
        if (result == -1) {
            System.out.println("The number is invalid, please enter a non-negative integer.");
        } else {
            System.out.println("The factorial of the number is: " + result);
        }
    }
}
