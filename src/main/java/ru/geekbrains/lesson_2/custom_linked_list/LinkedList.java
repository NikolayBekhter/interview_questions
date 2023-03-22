package ru.geekbrains.lesson_2.custom_linked_list;

public abstract class LinkedList {

    public Node head;

    LinkedList(int data) {
        head = new Node(data);
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.nextNode;
        }
    }

    public String getItemAt(int index) {
        int listLength = getLength();
        if (index >= listLength) {
            return "Элемент с таким индексом отсутсвует.";
        } else {
            int counter = 0;
            Node currentNode = head;
            while (counter < index) {
                counter++;
                currentNode = currentNode.nextNode;
            }
            return Integer.toString(currentNode.data);
        }
    }

    public int getLength() {
        int counter = 0;
        Node currentNode = head;
        while (currentNode != null) {
            counter++;
            currentNode = currentNode.nextNode;
        }
        return counter;
    }

    public int getTail() {
        Node currentNode = head;
        while (currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
        }
        return currentNode.data;
    }

    public int getHead() {
        return head.data;
    }

    public abstract void insert(int data);

    public abstract String remove(int index);
}
