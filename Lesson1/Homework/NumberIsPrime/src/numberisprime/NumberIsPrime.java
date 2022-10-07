package numberisprime;

public class NumberIsPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 1;
        int reminder = number % 2;
        boolean isPrime = true;
        if (number == 1) {
            System.out.println("Number not prime!");
        }
        if (number < 1) {
            System.out.println("Incorrect number!");
        }
    }

}
