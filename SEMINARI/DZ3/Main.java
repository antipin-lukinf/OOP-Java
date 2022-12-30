package SEMINARI.DZ3;

import java.util.Iterator;

//Создать список по аналогии LinkedList (список связанных элементов), реализовать в нем iterable интерфейс

public class Main {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(10);
        Iterator iterator= myLinkedList.iterator();

        System.out.println(myLinkedList);

        myLinkedList.remove(1);
        System.out.println(myLinkedList);

        System.out.println("_______________");

        myLinkedList = new MyLinkedList();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        
        }
    }

}