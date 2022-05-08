/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge28;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void happyPath() {
        int arr[] = {5, 7, 9, 2, 3};
        int resultArr[] = App.quickSort(arr, 0, arr.length-1);

        assertEquals(9, resultArr[resultArr.length-1]);
    }
    @Test void edgeCase1() {
        int arr[] = {};
        int resultArr[] = App.quickSort(arr, 0, arr.length-1);

        assertEquals(0, resultArr.length);
    }

    @Test void edgeCase2() {
        int arr[] = {5};
        int resultArr[] = App.quickSort(arr, 0, arr.length-1);

        assertEquals(5, resultArr[0]);
    }
}
