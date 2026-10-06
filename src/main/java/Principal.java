/**
 *
 * @author 10725213830
 */
public class Principal {

    public static void main(String[] args) {
        double i = 1, num = 0, numf;
        do{
            num += i;
            
            i++;
            
        } while (i >= 1 && i <= 1000);
        numf = num/1000;
        System.out.printf("A media aritmedica e: %.1f", numf);
    }
}
