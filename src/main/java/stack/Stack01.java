package stack;

public class Stack01 {
    private int[] arr = new int[10000];
    private int pointer = 0;

    public int[] getArr() {
        return arr;
    }

    public Stack01() {
    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {  // arr[0] 에 value 를 넣는 기능
        this.arr[this.pointer] = value;
        this.pointer ++;
    }

    public int pop() {
        // pointer 를 return 후 담아두지 못한다. 다른곳에 저장해뒀다가 --해줘야댐

        // push 10 push 20 pointer 2
        // push 할 때 pointer 는 증가하므로 pop 시 pointer 를 하나 줄려줘야함
        int value = this.arr[this.pointer - 1];
        this.pointer--;
        return value;

    }

}
