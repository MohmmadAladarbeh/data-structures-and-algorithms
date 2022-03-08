/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge6;

import challenge6.com.example.LinkedList.LinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void addEnd() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(7);
        assertEquals(1, linkedList.length());

    }
    @Test void addMultiple() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(7);
        linkedList.append(5);
        linkedList.append(6);
        assertEquals(3, linkedList.length());
    }
    @Test void insertBeforeFirst(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(7);
        linkedList.append(5);
        linkedList.append(6);
        assertEquals("The newNode insert before the first Node", linkedList.insertBefore(8, 7));
    }

    @Test void insertBeforeMiddle () {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(7);
        linkedList.append(5);
        linkedList.append(6);
        assertEquals("the newNode insert in The middle", linkedList.insertBefore(9, 5));
    }

    @Test void insertAfterLast() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(7);
        linkedList.append(5);
        linkedList.append(6);
        assertEquals("the newNode insert after the last node", linkedList.insertAfter(10, 6));
    }
    @Test void insertAfterMiddle() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(7);
        linkedList.append(5);
        linkedList.append(6);
        assertEquals("the newNode insert after the middle node", linkedList.insertAfter(10, 5));
    }
}