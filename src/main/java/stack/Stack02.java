package stack;

import java.util.EmptyStackException;

public class Stack02 {
    private Integer[] arr;
    private int pointer = 0;

    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[10000];
    }

    public Integer[] getArr() {
        return arr;
    }

    public void push(int value) {
        // 10을 넣으면 arr[0] = 10
        this.arr[pointer] = value;
        this.pointer++;
    }

    public int pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.arr[--this.pointer];
    }

    public boolean isEmpty() {
        boolean isEmpty = this.pointer == 0;
        return isEmpty;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return this.arr[this.pointer - 1];
    }
}
