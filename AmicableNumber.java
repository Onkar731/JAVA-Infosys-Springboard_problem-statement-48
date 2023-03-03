public class AmicableNumber {
    public static boolean isAmicable(int num1, int num2) {
        int firstSum = 0, secondSum = 0;

        for(int i = 1; i <= num1/2; i++) {
            if(num1 % i == 0) {
                firstSum += i;
            }
        }

        for(int i = 1; i <= num2/2; i++) {
            if(num2 % i == 0) {
                secondSum += i;
            }
        } 

        // returning true if firstSum is equal to the secondSum
        if(firstSum == num2 && secondSum == num1) {
            return true;
        }

        return false;
    }
}