package cie_1_lab_cycle_practice_programs;

abstract class Buffer {
    protected int[] buffer;
    protected int size;

    public Buffer(int bufferSize) {
        this.buffer = new int[bufferSize];
        this.size = 0;
    }

    public abstract void push(int k);

    public abstract int pop();
}

class Stack extends Buffer {
    public Stack(int stackSize) {
        super(stackSize);
    }

    @Override
    public void push(int k) {
        if (size == buffer.length) {
            System.out.println("Stack Overflow");
            return;
        }
        buffer[size++] = k;
    }

    @Override
    public int pop() {
        if (size == 0) {
            System.out.println("Empty Stack");
            return -1;
        }
        return buffer[--size];
    }

    public void displayStack() {
        System.out.print("Stack: ");
        for (int i = size - 1; i >= 0; i--)
            System.out.print(buffer[i] + " ");
        System.out.println();
    }
}

class Queue extends Buffer {
    int front;
    int rear;

    public Queue(int queueSize) {
        super(queueSize);
        this.front = 0;
        this.rear = -1;
    }

    @Override
    public void push(int k) {
        if (size == buffer.length) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % buffer.length;
        buffer[rear] = k;
        size++;
    }

    @Override
    public int pop() {
        if (size == 0) {
            System.out.println("Empty Queue");
            return -1;
        }
        int popped = buffer[front];
        front = (front + 1) % buffer.length;
        size--;
        return popped;
    }

    public void displayQueue() {
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++)
            System.out.print(buffer[i] + " ");
        System.out.println();
    }
}

public class _9_stacks_and_queues {
    public static void main(String[] args) {

        System.out.println("-----STACK-----");
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.displayStack();
        System.out.println("Popped element from stack: " + stack.pop());
        stack.displayStack();
        System.out.println("Popped element from stack: " + stack.pop());
        stack.displayStack();

        System.out.println("\n-----QUEUE-----");
        Queue qu = new Queue(5);
        qu.push(60);
        qu.push(70);
        qu.push(80);
        qu.push(90);
        qu.push(100);
        qu.displayQueue();
        System.out.println("Popped element from queue: " + qu.pop());
        qu.displayQueue();
        System.out.println("Popped element from queue: " + qu.pop());
        qu.displayQueue();
    }
}
