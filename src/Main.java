public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Test Multiply 5*5" + multiply(5,5) );

        int i = 10;
        int y = 5;

        int subtract = subtract(i, y);
        System.out.println("Subtract result: " +subtract);
    }

    public static int multiply(int i, int x){

        return i * x;
    }

    public static int subtract(int i, int y) {
        return i-y;
    }
}
