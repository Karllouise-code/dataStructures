import java.util.Scanner;

public class iQueue {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] queue = new int[n];
    int size;
    int front;
    int rear;
    int data;
    int k;
    int option;
    char transaction;

    public void yourChoice() {
        option = scanner.nextInt();
    }

    public void yourTransact() {
        System.out.println("\nDo you want to try again? (y/n)");
        transaction = scanner.next().charAt(0);

    }

    public void addQueue() {

        data = scanner.nextInt();
        queue[rear] = data;
        rear = (rear + 1) % n;
        size = size + 1;

    }

    public int removeQueue() {

        int data = queue[front];
        front = (front + 1) % n;
        size = size - 1;

        return data;
    }

    public void showElements() {
        System.out.print("Queue Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % n] + " ");
        }
    }

    public void queueShower() {
        for (int queueElements : queue) {
            System.out.print(queueElements + " ");
        }
        System.out.println();
    }

    public int scanData() {
        return data;
    }

    public int frontNum() {
        return queue[front];
    }

    public int gotSize() {
        return size;
    }

    public boolean isEmpty() {
        return gotSize() == 0;
    }

    public boolean isFull() {
        return gotSize() == n;
    }
}
