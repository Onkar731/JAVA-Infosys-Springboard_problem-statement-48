import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inputValues = sc.nextLine();

        // extracting values
        List<Integer> values = Arrays.stream(inputValues.split(",")).map(Integer::parseInt).collect(Collectors.toList());

        // checking whether the given numbers are amicable or not
        // using isAmicable() method of AmicableNumber class
        System.out.println(AmicableNumber.isAmicable(values.get(0), values.get(1)));

        // closing resource
        sc.close();
    }
}
