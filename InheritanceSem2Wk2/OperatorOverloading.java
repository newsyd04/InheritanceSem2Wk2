public class OperatorOverloading {
    public static void main(String[] args) {
        String fName = "Joe";
        String lName = "Black";
        int a = 2;
        int b = 3;

        // The '+' operator being used as you'd expected
        System.out.println(a + b);
        
        // The '+' operator being used to concat strings together
        System.out.println(fName + " " + lName);
    }
}
