/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge30;

import challenge30.data.BTNode;
import challenge30.data.HashNode;
import challenge30.structure.BinaryTree;
import challenge30.structure.HashMap;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest <K, V>{
    @Test
    void Test1() {
        HashMap<String, String> hashCode = new HashMap<>();
        hashCode.set("0", "Mohammad");
        hashCode.set("1", "emad");
        hashCode.set("2", "sara");
        hashCode.set("3", "iyad");
        // Test1
        assertEquals(4, hashCode.keys().size());
        //Test2
        assertEquals("Mohammad", hashCode.get("0"));
        //Test3
        assertEquals(null, hashCode.get("5"));


    }

    @Test
    void handleCollision() {
        HashMap<String, String> hashCode = new HashMap<>();
        hashCode.set("0", "Mohammad");
        hashCode.set("1", "emad");
        hashCode.set("2", "sara");
        hashCode.set("3", "iyad");
        hashCode.set("4", "Mohammad");
        hashCode.set("5", "yousef");
        hashCode.set("6", "sara");
        hashCode.set("7", "iyad");
        hashCode.set("8", "Mohammad");
        hashCode.set("9", "yousef");
        hashCode.set("10", "sara");
        hashCode.set("11", "iyad");
        hashCode.set("12", "Mohammad");
        hashCode.set("13", "yousef");

        // Test 4
        assertEquals(14, hashCode.keys().size());

        //Task5
        assertEquals(true, hashCode.hash("10") == hashCode.hash("9"));

        //Task 7
        assertEquals(7, hashCode.hash("9"));
    }

    @Test
    void repeatedWordTest1() {
        Algorithm algorithm = new Algorithm();
        String text = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        assertEquals("it", algorithm.repeatedWord(text));
    }

    @Test
    void repeatedWordTest2() {
        Algorithm algorithm = new Algorithm();
        String text = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        assertEquals("summer", algorithm.repeatedWord(text));
    }

    @Test
    void repeatedWordTest3() {
        Algorithm algorithm = new Algorithm();
        String text = "Once upon a time, there was a brave princess who...";
        assertEquals("a", algorithm.repeatedWord(text));
    }

    @Test
    void leftJoinTest1() {
        HashMap<String, String> hashMap1 = new HashMap<>();
        HashMap<String, String> hashMap2 = new HashMap<>();

        Algorithm algorithm = new Algorithm();

        hashMap1.set("1", "11");
        hashMap1.set("2", "22");
        hashMap1.set("3", "33");
        hashMap1.set("9", "1");
        hashMap1.set("7", "33");

        hashMap2.set("1", "1");
        hashMap2.set("2", "4");
        hashMap2.set("3", "9");
        hashMap2.set("6", "1");
        hashMap2.set("10", "1");

        assertEquals("[ 2, 22, 4 ] \n" +
                "[ 3, 33, 9 ] \n" +
                "[ 7, 33, null ] \n" +
                "[ 9, 1, null ] \n" +
                "[ 1, 11, 1 ] \n", algorithm.leftJoin(hashMap1, hashMap2));
    }

    @Test
    void leftJoinTest2() {
        HashMap<String, String> hashMap1 = new HashMap<>();
        HashMap<String, String> hashMap2 = new HashMap<>();

        Algorithm algorithm = new Algorithm();


        hashMap1.set("9", "1");
        hashMap1.set("7", "33");

        hashMap2.set("1", "1");
        hashMap2.set("2", "4");


        assertEquals("[ 7, 33, null ] \n" +
                "[ 9, 1, null ] \n", algorithm.leftJoin(hashMap1, hashMap2));
    }

    @Test
    void leftJoinTest3() {
        HashMap<String, String> hashMap1 = new HashMap<>();
        HashMap<String, String> hashMap2 = new HashMap<>();

        Algorithm algorithm = new Algorithm();

        hashMap1.set("1", "11");
        hashMap1.set("2", "22");
        hashMap1.set("3", "33");


        hashMap2.set("1", "1");
        hashMap2.set("2", "4");
        hashMap2.set("3", "9");


        assertEquals("[ 2, 22, 4 ] \n" +
                "[ 3, 33, 9 ] \n" +
                "[ 1, 11, 1 ] \n", algorithm.leftJoin(hashMap1, hashMap2));
    }


    @Test
    void treeIntersectionTest1 () {
        Algorithm algorithm = new Algorithm();

        BinaryTree binaryTreeOne = new BinaryTree();
        binaryTreeOne.setRoot(new BTNode(1));
        binaryTreeOne.getRoot().setLeft(new BTNode(2));
        binaryTreeOne.getRoot().setRight(new BTNode(3));
        binaryTreeOne.getRoot().getLeft().setLeft(new BTNode(4));
        binaryTreeOne.getRoot().getLeft().setRight(new BTNode (5));
        binaryTreeOne.getRoot().getRight().setLeft(new BTNode(6));
        binaryTreeOne.getRoot().getRight().setRight(new BTNode(7));

        BinaryTree binaryTreeTwo = new BinaryTree();
        binaryTreeTwo.setRoot(new BTNode(10));
        binaryTreeTwo.getRoot().setLeft(new BTNode(2));
        binaryTreeTwo.getRoot().setRight(new BTNode(5));
        binaryTreeTwo.getRoot().getLeft().setLeft(new BTNode(4));
        binaryTreeTwo.getRoot().getLeft().setRight(new BTNode (3));
        binaryTreeTwo.getRoot().getRight().setLeft(new BTNode(8));
        binaryTreeTwo.getRoot().getRight().setRight(new BTNode(1));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals (list, algorithm.treeIntersection(binaryTreeOne, binaryTreeTwo));
    }

    @Test
    void treeIntersectionTest2() {
        Algorithm algorithm = new Algorithm();

        BinaryTree binaryTreeOne = new BinaryTree();
        binaryTreeOne.setRoot(new BTNode(1));
        binaryTreeOne.getRoot().setLeft(new BTNode(20));
        binaryTreeOne.getRoot().setRight(new BTNode(3));


        BinaryTree binaryTreeTwo = new BinaryTree();
        binaryTreeTwo.setRoot(new BTNode(10));
        binaryTreeTwo.getRoot().setLeft(new BTNode(2));
        binaryTreeTwo.getRoot().setRight(new BTNode(5));



        assertEquals (null, algorithm.treeIntersection(binaryTreeOne, binaryTreeTwo));
    }

    @Test
    void treeIntersectionTest3() {
        Algorithm algorithm = new Algorithm();

        BinaryTree binaryTreeOne = new BinaryTree();
        binaryTreeOne.setRoot(new BTNode(1));
        binaryTreeOne.getRoot().setLeft(new BTNode(20));
        binaryTreeOne.getRoot().setRight(new BTNode(3));

        BinaryTree binaryTreeTwo = new BinaryTree();

        assertEquals (null, algorithm.treeIntersection(binaryTreeOne, binaryTreeTwo));
    }




}
