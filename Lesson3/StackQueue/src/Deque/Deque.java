package Deque;

public class Deque {
    private int maxSize;
    private int[] deque;
    private int front;
    private int rear;
    private int items;

    public Deque(int s) {
        this.maxSize = s;
        this.deque = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.items = 0;
    }

    public boolean isEmpty() {
        return (items == 0);
    }

    public boolean isFull() {
        return (items == maxSize);
    }

    public int size() {
        return items;
    }
    public int peek() {
        return deque[front];
    }

    public void insertRight(int i){
        if (!isFull()) {
            if(rear == maxSize -1)
                rear = -1;
            deque [++rear] = i;
            items++;
        }
    }

    public void removeLeft() {
        if (items > 0) {
            if (front == maxSize)
                front = 0;
            front++;
            items--;
        }
    }

    public void getDeque(){
        int i, cnt;
        for ( i = front,  cnt = 0; cnt < items;  cnt++) {
            int temp = deque[i++];
            if (i == maxSize)
                i = 0;
            System.out.print(temp + " ");
        }
        System.out.println("");
    }

    public void insertLeft(int i){
        if (!isFull()){
            if(front == 0)
                front = maxSize;
            deque [--front] = i;
            items++;
        }
    }

    public void removeRight() {
        if(items > 0) {
            if (rear == 0)
                rear = maxSize -1;
            rear--;
            items--;
        }
    }
}
