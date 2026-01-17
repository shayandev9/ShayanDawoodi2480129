import java.util.Scanner;

class Car {
    String brand;
    String model;
    double price;

    Car(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price);
    }
}
public class Basic {
    public static void main(String[] args) {

         
        // String name = "Hammad Ahmed";
        // int rollNo = 123;
        // String department = "Computer Science";
 
        // System.out.println(name + " | Roll No: " + rollNo + " | Department: " + department);


        // Temperature conversion
        // double celsius = 38.0;
        // double fahrenheit = (celsius * 9 / 5) + 32;

        // System.out.println("Temperature in Fahrenheit: " + fahrenheit);



        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter first number: ");
        // int a = sc.nextInt();

        // System.out.print("Enter second number: ");
        // int b = sc.nextInt();

        // System.out.println("Sum = " + (a + b));



        // System.out.print("Enter name: ");
        // String name = sc.nextLine();  

        // System.out.print("Enter marks: ");
        // int marks = sc.nextInt();

        // System.out.println("Hello " + name + ", your marks are " + marks);




        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();

        // if (n % 2 == 0)
        //     System.out.println("Even");
        // else
        //     System.out.println("Odd");



        // System.out.print("Enter first number: ");
        // int a = sc.nextInt();

        // System.out.print("Enter second number: ");
        // int b = sc.nextInt();

        // System.out.print("Enter third number: ");
        // int c = sc.nextInt();

        // int largest;

        // if (a >= b && a >= c) {
        //     largest = a;
        // } else if (b >= a && b >= c) {
        //     largest = b;
        // } else {
        //     largest = c;
        // }

        // System.out.println("Largest number is: " + largest);





        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(i);
        // }



        // System.out.print("Enter number: ");
        // int num = sc.nextInt();

        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(num + " x " + i + " = " + (num * i));
        // }
    


        // int[] arr = {10, 22, 5, 40, 18};
        // int max = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        //     if (arr[i] > max)
        //         max = arr[i];
        // }
        // System.out.println("Maximum = " + max);

        

        // int[] arr = {10, 20, 30, 40, 50};

        // for (int i = arr.length - 1; i >= 0; i--) {
        //     System.out.println(arr[i]);
        // }



        // System.out.println("Factorial = " + factorial(7));



        // System.out.println(isPrime(7));          
        // System.out.println(isPrime( 9)); 



        Car c1 = new Car("Toyota", "Corolla", 28000);
        Car c2 = new Car("Honda", "Civic", 31000);
        c1.displayDetails();
        c2.displayDetails();



        sc.close();
        
    }
    
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }
    
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
    
        return true;
    }
}
