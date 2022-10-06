package recapdemo2;

/**
 *
 * @author erdem
 */
public class RecapDemo2 {

    public static void main(String[] args) {
        double numbers[] = {1.4, 23.3, 12.1, 0.4, 25, 58, 68, 414, 12, 3, 0, 89.87};
        double maxnumber = numbers[0];
        double total = 0;
        for (double number : numbers) {
            if (number > maxnumber) {
                maxnumber = number;
            }
            total += number;
        }
        System.out.println("Total :" + total);
        System.out.println("Max number: " + maxnumber);
    }

}
