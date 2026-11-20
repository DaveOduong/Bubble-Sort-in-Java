import java.util.Scanner;

public class BubbleSortExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for array size
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        // Ask user to enter array values
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
