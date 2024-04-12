import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;


public class TestHeapBinaryTree {
    @Test
    public void testInsert() {
        ComparatorNiceValue a = new ComparatorNiceValue();
        Process processTest = new Process("Osu","Gadiel",10);
        HeapUsingIterativeBinaryTree<Integer,Process> heapTree = new HeapUsingIterativeBinaryTree<>(a);
        heapTree.Insert(processTest.getNiceValue(), processTest);
        Assertions.assertEquals(processTest,heapTree.get());
    }
    @Test
    public void testRemove(){
        ComparatorNiceValue a = new ComparatorNiceValue();
        Process processTest = new Process("Osu","Gadiel",10);
        HeapUsingIterativeBinaryTree<Integer,Process> heapTree = new HeapUsingIterativeBinaryTree<>(a);
        heapTree.Insert(processTest.getNiceValue(), processTest);
        heapTree.remove();
        Assertions.assertEquals(null,heapTree.get());
    }
}