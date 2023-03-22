package ru.geekbrains.lesson_2.custom_array_list;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");
        strings.add("Five");
        strings.add("Six");

        printCustomArray(strings);
        System.out.println("---------------");
        System.out.println(strings.get(0));
        System.out.println(strings.size());
        System.out.println(strings.capacity());
        System.out.println("---------------");

        strings.remove(0);
        strings.remove(1);
        strings.remove(2);
        printCustomArray(strings);
        System.out.println("----------------");

        System.out.println(strings.get(2));
        System.out.println("----------------");
        System.out.println(strings.size());
        System.out.println(strings.capacity());

        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");
        strings.add("Five");
        strings.add("Six");
        System.out.println("----------------");
        System.out.println(strings.size());
        System.out.println(strings.capacity());
        System.out.println("----------------");
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");
        strings.add("Five");
        strings.add("Six");

        System.out.println("----------------");
        printCustomArray(strings);
        System.out.println("----------------");
        System.out.println(strings.size());
        System.out.println(strings.capacity());

        System.out.println("----------------");
        strings.remove(0);
        strings.remove(1);
        strings.remove(2);
        strings.remove(0);
        strings.remove(1);
        strings.remove(2);
        System.out.println("----------------");
        printCustomArray(strings);
        System.out.println("----------------");
    }

    public static void printCustomArray(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

}
