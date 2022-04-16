/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge17;

import challenge17.data.BTNode;
import challenge17.structure.BinaryTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class AppTest {
    @Test void HappyPath() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new BTNode(1));
        binaryTree.getRoot().setLeft(new BTNode<Integer>(3));
        binaryTree.getRoot().setRight(new BTNode<Integer>(12));
        binaryTree.getRoot().getLeft().setLeft(new BTNode<Integer>(6));
        binaryTree.getRoot().getLeft().setRight(new BTNode<Integer>(7));
        binaryTree.getRoot().getLeft().getLeft().setLeft(new BTNode<Integer>(9));
        assertEquals(6, App.breadthFirst(binaryTree).size());
    }

    @Test void treeIsEmpty() {
        BinaryTree binaryTree = new BinaryTree();
        assertEquals(null, App.breadthFirst(binaryTree));
    }


}