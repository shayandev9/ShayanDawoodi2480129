

public class Recursion {

    public static int factorial(int n) {

        if(n == 1) return 1;  // base case
    
        return n * factorial(n - 1);  // recursive case
    }

    public static int fib(int n) {
        if(n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }

    public static int sumArray(int[] arr, int index) {
        if(index == arr.length) return 0;
        return arr[index] + sumArray(arr, index + 1);
    }

    public static void main(String[] args) {
        
        // Factorial
        int num = 5;
        System.out.println("Factorial of " + num + " = " + factorial(num));

        // Fibonacci
        int fibTerm = 6;
        System.out.println("Fibonacci of " + fibTerm + " = " + fib(fibTerm));

        // Sum of array using recursion
        int[] arr = {2, 4, 6, 8};
        System.out.println("Sum of array = " + sumArray(arr, 0));

    }
}
