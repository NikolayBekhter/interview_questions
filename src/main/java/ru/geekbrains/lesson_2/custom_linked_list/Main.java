package ru.geekbrains.lesson_2.custom_linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedList test_list = new SinglyLinkedList(1);
        test_list.insert(2);
        test_list.insert(3);
        test_list.insert(4);
        test_list.printList();
        System.out.println("Размер списка Test_list: " + test_list.getLength());
        System.out.println("Элемент с индексом 4: " + test_list.getItemAt(4));
        System.out.println("Начало: " + test_list.getHead());
        System.out.println("Конец: " + test_list.getTail());
        System.out.println("Удаление: " + test_list.remove(5));
        System.out.println("------------------------------");
        LinkedList test_list2 = new SinglyLinkedList(3);
        test_list2.insert(4);
        test_list2.insert(5);
        test_list2.insert(6);
        test_list2.insert(6);
        test_list2.printList();
        System.out.println("Размер списка Test_list2: " + test_list2.getLength());
        System.out.println("Элемент с индексом 2: " + test_list2.getItemAt(2));
        System.out.println("Начало: " + test_list2.getHead());
        System.out.println("Конец: " + test_list2.getTail());
        System.out.println("Удаление: " + test_list2.remove(1));
        test_list2.printList();
        System.out.println("------------------------------");
        LinkedList test_list3 = new SinglyLinkedList(11);
        test_list3.insert(12);
        test_list3.insert(13);
        test_list3.insert(14);
        test_list3.printList();
        System.out.println("Размер списка Test_list3: " + test_list3.getLength());
        System.out.println("Элемент с индексом 3: " + test_list3.getItemAt(3));
        System.out.println("Начало: " + test_list3.getHead());
        System.out.println("Конец: " + test_list3.getTail());
        System.out.println("Удаление: " + test_list3.remove(2));
        test_list3.printList();
    }
}
