import java.util.Scanner;

public class NumberCheck {

    // Function to check Prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;

      /*   🧩 Why check divisibility only up to √n instead of n?

           A number n is composite (not prime) if it can be written as:

              n = a × b


               Now, if both a and b were greater than √n,
               then their product a × b would be greater than n — which is impossible.

               So for any factor pair (a, b) of n:

                one of them must be ≤ √n

               the other must be ≥ √n
        */
    }

    // Function to check Palindrome
    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }

    // Function to check Armstrong
    /*A number is called an Armstrong number if the sum of its digits raised to the power of the total number of digits equals the number itself. */
    public static boolean isArmstrong(int num) {
        int original = num, sum = 0, digits = 0, temp = num;

        // Count digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("\nPrime numbers between 1 and " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }

        System.out.println("\n\nPalindrome numbers between 1 and " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (isPalindrome(i))
                System.out.print(i + " ");
        }

        System.out.println("\n\nArmstrong numbers between 1 and " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i))
                System.out.print(i + " ");
        }

        sc.close();
    }
}


