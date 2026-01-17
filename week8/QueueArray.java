

public class QueueArray {
    private int[] arr;
    private int size;
    private int rear;
    private int front;

    public QueueArray(int capacity) {
        arr = new int[capacity];
        size = 0;
        front = 0;     
        rear = -1;     // nothing inside yet
    }

    // enqueue
    public void enqueue(int value) {
        if (size == arr.length) {
            resize();
        }
        rear++;
        arr[rear] = value;
        size++;

        System.out.println(value + " enqueued");
    }

    // dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int removed = arr[front];   // arr[0]

        // shifting
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }

        rear--;
        size--;

        return removed;
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    // check empty
    public boolean isEmpty() {
        return size == 0;
    }

    // resize
    private void resize() {
        int newSize = arr.length * 2;
        int[] newArr = new int[newSize];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
        System.out.println("Queue resized to " + newSize);
    }

    // print
    public void printQueue() {
        System.out.print("Queue: ");
        for (int i = 0; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int findMax() {
        int max = Integer.MIN_VALUE;
        while (!isEmpty()) {
            int val = dequeue();
            if (val > max) max = val;
        }
        return max;
    }

    public static void main(String[] args) {
        QueueArray queue = new QueueArray(4);
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.printQueue();

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.printQueue();
    }
}
