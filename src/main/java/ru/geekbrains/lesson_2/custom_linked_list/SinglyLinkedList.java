package ru.geekbrains.lesson_2.custom_linked_list;

public class SinglyLinkedList extends LinkedList{

    SinglyLinkedList(int data) {
        super(data);
    }

    @Override
    public void insert(int data) {

        Node new_node = new Node(data);
        if (head.nextNode == null) {
            head.nextNode = new_node;
        } else {
            Node lastNode = head;
            while(lastNode.nextNode != null) {
                lastNode = lastNode.nextNode;
            }
            lastNode.nextNode = new_node;
        }
    }

    @Override
    public String remove(int index) {

        Node previousNode = head;
        Node currentNode = head.nextNode;
        if (index >= getLength())
            return "Элемент с таким индексом отсутсвует.";
        else {
            if (index == 0) {
                head = head.nextNode;
                return "Элемент удален с индексом " + index;
            }
            int counter = 1;
            while (counter < index) {
                counter++;
                previousNode = currentNode;
                currentNode = currentNode.nextNode;
            }
            previousNode.nextNode = currentNode.nextNode;
            return "Элемент удален с индексом " + index;
        }
    }
}
