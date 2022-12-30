package SEMINARI.DZ3;

import java.util.Arrays;
import java.util.Iterator;

public class MyLinkedList implements Iterable<Integer>{
    private Node head;
    private int size;

    public void add(int value){
        if (head == null){
            this.head = new Node(value);

        }
        else{
            Node temp = head;

            while(temp.getNext() != null){
                temp = temp.getNext();
            }

            temp.setNext(new Node(value));
        }
        size++;
    }

    public void remove(int index){
        if(index == 0){
            head = head.getNext();
            size--;
            return;
        }


        int currentIndex = 0;
        Node temp = head;

        while (temp != null) {
            if(currentIndex == index - 1){
                temp.setNext(temp.getNext().getNext());
                size--;
                return;

            }
            else {
                temp = temp.getNext();
                currentIndex++;
            }
            
            
        }
    }

    public String toString() {
        int[] result = new int[size];

        int idx = 0;
        Node temp = head;
        while(temp != null){
            result[idx++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
      
    }
    @Override    
    public Iterator<Integer> iterator() {
        return new LinkedIterator();
    }
    private class LinkedIterator implements Iterator<Integer> {

        private int index = 0; 
        private Node node = head;
        
        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Integer next() {
            if (index==0 || node.getNext() == null) {
                index++;
                return node.getValue();
            }
            node = node.getNext();
            index++;
            return node.getValue();
        }
    }

    

    private static class Node {
        
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        
        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
        
        
        

    }

    // public Iterator<Integer> iterator() {
    //     return next();
    // }

    //public void add(int i) {
}
    
 
