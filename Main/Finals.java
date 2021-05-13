import java.util.Scanner;

public class Finals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nMain Menu");
        System.out.println("1. Sorting");
        System.out.println("\t -Bubble Sort");
        System.out.println("\t -Selection Sort");
        System.out.println("2. Binary Tree Traversal");
        System.out.println("\t -Pre-Order");
        System.out.println("\t -Post-Order");
        System.out.println("\t -In-Order");
        System.out.println("3. Queueing");
        System.out.println("4. Stacks");
        System.out.println("5. About");
        System.out.println("6. Exit");

        System.out.print("Choice: ");
        int num = scanner.nextInt();

        if (num == 1) {
            System.out.println("\n Choose Type of Sorting");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.print("Choice: ");
            int sort = scanner.nextInt();

            //*BUBBLE SORT
            if (sort == 1) {
                System.out.println("\n\tBubble Sorting: ");
                System.out.print("Enter the length of the array: ");
                iSort bs = new iSort();
                bs.inputLength();
                bs.arrayScanner();
                bs.bubbleSort();
                scanner.close();
                System.out.print("\nBubble Sort Output: ");
                bs.sortPrinter();

            }

            //             //*SELECTION SORT
            if (sort == 2) {
                System.out.println("\n\tSelection Sorting: ");
                System.out.print("Enter the length of the array: ");
                iSort ss = new iSort();
                ss.inputLength();
                ss.arrayScanner();
                ss.selectionSort();
                scanner.close();
                System.out.print("\nSelection Sort Output: ");
                ss.sortPrinter();

            }

        }

        //         //* Binary Tree Traversal
        //         if (num == 2) {
        //             System.out.println("\n\tChoose Type of Tree Traversal");
        //             System.out.println("[1] Pre-order");
        //             System.out.println("[2] Post-order");
        //             System.out.println("[3] In-order");
        //             System.out.print("Choice: ");
        //             int treeChoice = scanner.nextInt();

        //             //  The Example Tree looks like this
        //             //                   1
        //             //                /    \
        //             //               2       3
        //             //              / \     / \
        //             //             4   5   6   7

        //             BinaryTree tree = new BinaryTree();
        //             tree.root = new Node(1);
        //             tree.root.left = new Node(2);
        //             tree.root.right = new Node(3);
        //             tree.root.left.left = new Node(4);
        //             tree.root.left.right = new Node(5);
        //             tree.root.right.left = new Node(6);
        //             tree.root.right.right = new Node(7);

        //             if (treeChoice == 1) {
        //                 System.out.println("\nPreorder traversal output: ");
        //                 tree.preOrder(tree.root);
        //             }

        //             if (treeChoice == 2) {
        //                 System.out.println("\nPostorder traversal output: ");
        //                 tree.postOrder(tree.root);
        //             }
        //             if (treeChoice == 3) {
        //                 System.out.println("\nInorder traversal output: ");
        //                 tree.inOrder(tree.root);
        //             }

        //         }

        //         //* QUEUE
        //         if (num == 3) {
        //             System.out.println("\n\t--WELCOME TO QUEUE--");
        //             System.out.print("\nEnter Size of the Queue: ");
        //             iQueue q = new iQueue();

        //             do {
        //                 System.out.println("\n\t--Queue Operations Menu--");
        //                 System.out.println("You Can Enqueue/Add Elements on Queue up to: " + q.n);
        //                 System.out.println("[1] Enqueue");
        //                 System.out.println("[2] Dequeue");
        //                 System.out.println("[3] Show Elements");
        //                 System.out.println("[0] Exit");
        //                 System.out.print("Enter Choice: ");
        //                 q.yourChoice();

        //                 switch (q.option) {
        //                     case 1:
        //                         if (!q.isFull()) {
        //                             System.out.println("\nYou Can Enqueue/Add Elements on Queue up to: " + q.n);
        //                             System.out.print("Add Queue: ");
        //                             q.addQueue();
        //                             System.out.print("Added: ");
        //                             System.out.print(q.scanData());
        //                             System.out.println();
        //                             q.showElements();
        //                             System.out.println();
        //                         } else {
        //                             System.out.println("\nThe Queue is Full!");
        //                         }
        //                         break;
        //                     case 2:
        //                         if (!q.isEmpty()) {
        //                             System.out.println("\nRemoved Element: " + q.frontNum());
        //                             q.removeQueue();
        //                             q.showElements();
        //                             System.out.println("\nSize: " + q.gotSize());
        //                         } else {
        //                             System.out.println("\nThe Queue is Empty!");
        //                         }
        //                         break;

        //                     case 3:
        //                         if (!q.isEmpty()) {
        //                             System.out.println("\nSize: " + q.gotSize());
        //                             q.showElements();
        //                             System.out.println();
        //                         } else {
        //                             System.out.println("\nThe Queue is Empty!");
        //                         }
        //                         break;

        //                     case 0:
        //                         System.out.println("Good-Bye");
        //                         break;

        //                     default:
        //                         System.out.println("Invalid Choice");
        //                 }

        //                 q.yourTransact();
        //                 if (q.transaction == 'n' || q.transaction == 'N') {
        //                     q.k = 1;
        //                 }

        //             } while (q.k != 1);
        //             System.out.println("THANKS FOR USING OUR QUEUE!");
        //         }

        //         //*STACKS
        //         if (num == 4) {
        //             System.out.println("\n\t--WELCOME TO STACKS--");
        //             System.out.print("\nEnter Size of the Stack: ");
        //             iStack js = new iStack();

        //             do {
        //                 System.out.println("\n\t--STACKS Operations Menu--");
        //                 System.out.println("\nYou can Push/Add integer up to: " + js.n);
        //                 System.out.println("[1] Push data");
        //                 System.out.println("[2] Pop data");
        //                 System.out.println("[3] Show Data");
        //                 System.out.println("[0] Exit");
        //                 System.out.print("Enter Choice: ");
        //                 js.yourChoice();

        //                 switch (js.option) {
        //                     case 1:
        //                         if (!js.isFull()) {
        //                             System.out.print("\nEnter data: ");
        //                             js.push();
        //                             js.show();

        //                         } else {
        //                             System.out.println("\nOverflow/Stack is Full!");
        //                         }
        //                         break;

        //                     case 2:
        //                         if (!js.isEmpty()) {
        //                             System.out.print("\nRemoved Element: " + js.peek());
        //                             System.out.println();
        //                             js.pop();
        //                             js.show();
        //                         } else {
        //                             System.out.println("\nUnderflow/Stack is Empty!");
        //                         }
        //                         break;

        //                     case 3:
        //                         if (!js.isEmpty()) {
        //                             System.out.println();
        //                             System.out.println("Top of the Stack: " + js.peek());
        //                             js.show();
        //                         } else {
        //                             System.out.println("\nUnderflow/Stack is Empty!");
        //                         }
        //                         break;

        //                     case 0:
        //                         System.out.println("\nGood-Bye!");
        //                         break;

        //                     default:
        //                         System.out.println("\nInvalid Choice");
        //                 }

        //                 System.out.println("\nDo you want to try again? (y/n)");
        //                 js.yourTransact();
        //                 if (js.transaction == 'n' || js.transaction == 'N') {
        //                     js.checker = 1;
        //                 }

        //             } while (js.checker != 1);
        //             System.out.println("\nTHANKS FOR USING STACKS");
        //         }

        //         //*ABOUT
        //         if (num == 5) {
        //             System.out.println("\nABOUT:");
        //             System.out.println("    " + "Developers:");
        //             System.out.println("    " + "1.) Karl Louise R. Rito");
        //             System.out.println("    " + "2.) Lester Niel C. Fong");
        //         }

        //         //*EXIT
        //         if (num == 6) {
        //             System.out.println("\nTHANK YOU FOR USING OUR PROGRAM!");
        //         }

    }
}