package ru.geekbrains.lesson_2.custom_array_list;

public class ArrayList<T> {
    private final int INIT_SIZE = 10;
    private Object[] array = new Object[INIT_SIZE];
    private final int DEC_SIZE = 4;
    private int pointer = 0;

    public int size() {
        return pointer;
    }

    public int capacity() {
        return array.length;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void add(T element) {
        if (pointer == capacity()) {
            int inc_size = pointer + (pointer / 2);
            if (pointer < INIT_SIZE) {
                inc_size = INIT_SIZE;
            }
            Object[] array1 = new Object[inc_size];
            System.out.println("Создался новый массив с увеличенным размером.");
            for (int i = 0; i < array.length; i++) {
                array1[i] = array[i];
            }
            array = array1;
        }
        array[pointer++] = element;
    }

    public void remove(int index) {
        if (index >= 0) {
            if (index < size() && array[index] != null) {
                array[index] = null;
                for (int i = index; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                    array[i + 1] = null;
                }
                pointer--;
            } else {
                System.out.println("Элемент с таким индексом не существует или null");
            }
        } else {
            System.out.println("Индексы в этом списке >= 0");
        }
        if (pointer <= (capacity() - DEC_SIZE) && pointer > INIT_SIZE) {
            Object[] array1 = new Object[pointer];
            System.out.println("Создался новый массив с уменьшенным размером.");
            for (int i = 0; i < array1.length; i++) {
                array1[i] = array[i];
            }
            array = array1;
        }
    }
}
