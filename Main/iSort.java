import java.util.Scanner;

public class iSort {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] myArr = new int[n];

    public void inputLength() {
        System.out.print("Enter " + n + " integers: ");
    }

    public void arrayScanner() {
        for (int i = 0; i < n; i++) {
            myArr[i] = scanner.nextInt();
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < n - 1; i++) {
            int flag = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (myArr[j] > myArr[j + 1]) {
                    int temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < n - 1; i++) {
            int iMin = i;
            for (int j = i + 1; j < n; j++) {
                if (myArr[j] < myArr[iMin]) {
                    iMin = j;
                }
            }
            if (iMin != i) {
                int temp = myArr[iMin];
                myArr[iMin] = myArr[i];
                myArr[i] = temp;
            }
        }
    }

    public void sortPrinter() {
        for (int i = 0; i < n; i++)
            System.out.print(myArr[i] + " ");
    }

}