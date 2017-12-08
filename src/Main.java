import algorithms.Recursion;
import algorithms.Searching;
import algorithms.Sorting;
import data_structure.Heap;
import data_structure.MyLinkedList;
import data_structure.MyQueue;
import data_structure.MyStack;

import java.util.Arrays;

public class Main {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
//        showRecursion();

//        showSorting();

//        showSearching();

//        showGraph();

//        showMyLinkedList();

//        showStack();

//        showQueue();

//        showHeap();

    }

    public static void showHeap() {
        Heap heap = new Heap(1);
        int[] array = {3,5,2,4,8,1,0,6,9,7};
        for (int num : array) {
            heap.add(num);
            System.out.println(heap.toString());
        }
        heap.poll();
        System.out.println(heap.toString());
        heap.poll();
        System.out.println(heap.toString());
    }

    public static void showQueue() {
        MyQueue queue = new MyQueue();
        queue.push(1);
        int num = queue.pop();
        System.out.println(num + " ");
        System.out.println(queue.isEmpty() + " ");
        queue.push(3);
        num = queue.peek();
        System.out.println(num + " ");
        queue.push(4);
        num = queue.pop();
        System.out.println(num + " ");
        num = queue.pop();
        System.out.println(num + " ");
        num = queue.peek();
        System.out.println(num + " ");
    }

    public static void showStack() {
        MyStack stack = new MyStack();
        stack.push(1);
        int num = stack.pop();
        System.out.println(num + " ");
        System.out.println(stack.isEmpty() + " ");
        stack.push(3);
        num = stack.peek();
        System.out.println(num + " ");
        stack.push(4);
        num = stack.pop();
        System.out.println(num + " ");
        num = stack.pop();
        System.out.println(num + " ");
        num = stack.peek();
        System.out.println(num + " ");
    }

    public static void showGraph() {
        data_structure.Graph graph = new data_structure.Graph("graph.txt");
        graph.traverseDFS();
        graph.traverseBFS();
    }

    public static void showMyLinkedList() {
        MyLinkedList MyLinkedList = new MyLinkedList(new int[]{5,4,3,2,1});
        MyLinkedList.search(1);
        MyLinkedList.prepend(0);
        MyLinkedList.search(-1);
        MyLinkedList.appendNode(6);
        MyLinkedList.search(-1);
        MyLinkedList.deleteNode(4);
        MyLinkedList.search(-1);
    }

    public static void showSearching() {
        int[] arr = {3,1,4,6,7,8,2,9,0,5,9};
        Sorting.quickSort(arr);
        System.out.println("Recursive Search Index : " + Searching.binarySearchR(arr, 9));
        System.out.println("Iterative Search Index : " + Searching.binarySearchI(arr, 7));
    }

    public static void showSorting() {
        int[] arr = {3,1,4,6,7,8,2,9,0,5,0,9};
        Sorting.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        Sorting.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        Sorting.quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void showRecursion() {
        for(int i=0; i<47; i++) {
            System.out.print(Recursion.fibR(i)+" ");
        }
        System.out.println();
        for(int i=0; i<47; i++) {
            System.out.print(Recursion.fibM(i)+" ");
        }
        System.out.println();
        for(int i=0; i<47; i++) {
            System.out.print(Recursion.fibMDp(i)+" ");
        }
        System.out.println();
        for(int i=0; i<47; i++) {
            System.out.print(Recursion.fibMI(i)+" ");
        }
    }
}
