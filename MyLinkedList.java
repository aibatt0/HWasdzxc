package com.company;

public class MyLinkedList<T> {
    private MyX<T> head;
    private MyX<T> tail;
    private int size = 0;

    public MyLinkedList() {

    }

    public void add(T newItem, int index) {
        if (index == 0) {
            if (head == null) {
                MyX<T> newNode = new MyX<>(newItem);
                head = newNode;
                head.next = null;
                System.out.println(head.data);
                size++;
            } else {
                MyX<T> newNode = new MyX<>(newItem);
                newX.next = head;
                head = newX;
                size++;
//                System.out.println(head.data);
            }
        } else if (index >= size) {
            MyX<T> newX = new MyX<>(newItem);
            if (tail == null) {
                head = tail = newX;
                System.out.println(tail.data);
            } else {
                tail.next = newX;
                tail = tail.next;
                System.out.println(tail.data);
            }
            size++;
        } else {
            MyX<T> current = head;
            for (int i = 1; i < index; i++) current = current.next;
            MyX<T> temp = current.next;
            current.next = new MyX<>(newItem);
            (current.next).next = temp;
            System.out.println(current.data);
            size++;
        }
    }

    public int find(T keyItem) {
        MyX<T> current = head;
        for (int i = 0; i < size; i++) {
            if (current.data == keyItem) return i;
            current = current.next;
        }
        return -1;
    }

    public T remove(int index) {
        MyX<T> temp = head;
        if (index > size || index < 0) throw new IndexOutOfBoundsException();
        if (index == 0) {
            head = head.next;
            size--;
            return temp.data;
        } else {
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            MyX<T> removedElement = temp.next;
            temp.next = temp.next.next;
            if (index == size - 1) tail = temp;
            size--;
            return removedElement.data;
        }
    }

    public void reverse() {
        MyX<T> temp1 = head;
        MyX<T> temp2 = temp1.next;
        MyX<T> temp3 = temp2.next;

        while (temp3 != tail) {
            temp2.next = temp1;
            temp1 = temp2;
            temp2 = temp3;
            temp3 = temp2.next;
        }
        temp2.next = temp1;
        temp3.next = temp2;

        MyX<T> temp = tail;
        tail = head;
        tail.next = null;
        head = temp;
        head.next = temp2;
    }

    public static class MyX<T> {
        T data;
        MyX<T> next;

        MyX(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
