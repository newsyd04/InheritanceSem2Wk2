public class MethodOverloading {
    // Method with 2 integer parameters
    public static int Multiply(int a, int b)
    {
 
        // Returns product of integer numbers
        return a * b;
    }
 
    // Method 2
    // With same name but with 2 double parameters
    public static double Multiply(double a, double b)
    {
 
        // Returns product of double numbers
        return a * b;
    }

    public static int Multiply(int a, int b, int c){
        return a*b*c;
    }
    // We need an overloaded implementation to multiple 3 doubles
    // public static double Mutliply(double a, double b, double c);

    // method without parameter
    public static void display() {
        for (int i = 0; i < 10; i++) {
        System.out.print("*");
        }
        System.out.println();
    }

    // method with single parameter
    public static void display(char symbol) {
        for (int i = 0; i < 10; i++) {
        System.out.print(symbol);
        }
    }
    
    public static void main(String[] args) {
        display();
        System.out.println(Multiply(2, 2));    
        System.out.println(Multiply(2.0, 2.0));
        System.out.println(Multiply(2, 2, 3));
        // The line below causes an error, why is that?
        // System.out.println(Multiply(2.0, 2.0, 2.0));
        display('=');
    }
}
