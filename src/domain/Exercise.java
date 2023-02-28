package domain;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Class that represents selected task
 *
 * @author Yevhenii_D
 */
public class Exercise {

    /**
     * Method that fills the array with prime numbers, using specified range and
     * outputs it as a string
     *
     * @param startRange start of the range
     * @param endRange end of the range
     * @return string
     */
    public static String PrimeTheArray(int startRange, int endRange) {
        if (startRange <= 0 || endRange <= 0 || startRange > endRange) {
            return "Inputed range is incorrect!";
        }

        // Begin the iteration from startRange and up to the endRange, filtering by prime 
        // number, casting everything to an array
        int primedArray[] = IntStream.range(startRange, endRange)
                .filter(value -> isSimple(value))
                .toArray();

        return Arrays.toString(primedArray);
    }

    /**
     * Method that checks if the transferred number is the prime number
     *
     * @param number value to check
     * @return boolean
     */
    public static boolean isSimple(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
