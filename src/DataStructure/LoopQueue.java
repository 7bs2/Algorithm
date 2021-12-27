package DataStructure;


//  数组实现容量有限的队列
public class LoopQueue {
    private int[] dates;

    private int front;
    private int rear;
    int size;


    public LoopQueue(int length) {
        this.front = 0;
        this.rear = 0;
        this.size = length;
        this.dates = new int[length];
    }

    // 实际上并没有满   牺牲一个位置的元素 去判断是否为满
    // 用于区分 font == rear 的时候      到底是队满还是队空的情况
    public boolean isFull() {
        return (rear + 1) % size == front;
    }


    public boolean isEmpty() {
        return front == rear;
    }

    public void enqueue(int data) {
        if (isFull()) {
            return;
        }
        dates[rear] = data;
        rear = (rear + 1) % size;
    }

    public int deQueue() {
        if(!isEmpty()) {
            int data = dates[front];
            front = (front + 1) % size;
            return data;
        }
        return Integer.MIN_VALUE;
    }

    public void printfQueue() {
        int len = (rear - front + size) % size;
        int index = front;
        for (int i = 0; i < len; i++) {
            System.out.print(dates[index]);
            index =( index + 1) / size;
        }
    }

}
