import java.util.Scanner;

public class iStack {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] stack = new int[n];
    int size;
    int top = -1;
    int data;
    int option;
    int checker;
    char transaction = 'y';

    public void yourChoice() {
        option = scanner.nextInt();
    }

    public void yourTransact() {
        transaction = scanner.next().charAt(0);
    }

    public void push() {
        data = scanner.nextInt();
        top++;
        size++;
        stack[top] = data;

    }

    public int pop() {
        top--;
        size--;
        return data;
    }

    public int peek() {
        return (stack[top]);
    }

    public boolean isFull() {
        return size == n;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void show() {
        System.out.println();
        System.out.println("Stacks:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
