
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double suma(double a ,double b){
        return a + b;
    }

    public int divide(int a, int b) {
        if ((a == 0) || (b == 0)) {
            System.out.println("Error");
            return 0;
        } else {
            return a / b;
        }
    }
    public int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(10, 5));
        System.out.println("Subtraction: " + calculator.subtract(10, 5));
        System.out.println("Multiplication: " + calculator.multiply(10, 5));
        System.out.println("Division: " + calculator.divide(10, 5));
        System.out.println("Modulus: " + calculator.modulus(10, 5));
    }
}