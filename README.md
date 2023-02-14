# Практична робота "Масиви, вирази, керування виконанням програми"
## Завдання №1. Заповніть масив простими числами з вказаного діапазону і виведіть його у вигляді рядка
### Exercise.java
```java
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
     * @param limit end of the range of prime numbers
     * @return string
     */
    public static String PrimeTheArray(int limit) {
        if (limit <= 0) {
            return "Wrong limit!";
        }

        // Begin the iteration from 2 and up to the limit, filtering by prime 
        // number, casting everything to an array
        int primedArray[] = IntStream.iterate(2, i -> i + 1)
                .filter(j -> IntStream.range(2, j).noneMatch(e -> j % e == 0))
                .limit(limit)
                .toArray();

        return Arrays.toString(primedArray);
    }
}
```
### TestResult.java
```java
package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int limit = 5;
        System.out.println(Exercise.PrimeTheArray(limit));
    }
}
```
### Результат роботи програми
![Image alt](https://github.com/ppc-ntu-khpi/java-arrays-un-know-n/blob/master/Solution/done.png)