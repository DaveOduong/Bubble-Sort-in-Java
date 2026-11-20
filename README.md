# Bubble Sort in Java

A Java program that implements the Bubble Sort algorithm to sort user-input integers in ascending order.

## Description

This program asks the user to specify the number of elements in an array, enter the integers, and then sorts them using the Bubble Sort algorithm. The sorted array is displayed at the end.

## Features

- Accepts user input using the `Scanner` class.
- Allows the user to specify the array size.
- Sorts integers in ascending order using Bubble Sort.
- Displays the sorted array.

## How It Works

1. The program asks the user for the number of elements.
2. An integer array is created based on the specified size.
3. The user enters the array values.
4. The Bubble Sort algorithm compares adjacent elements.
5. Elements are swapped if they are in the wrong order.
6. The sorted array is printed.

## Code Logic

Bubble Sort repeatedly compares two adjacent elements. If the first element is greater than the second, their positions are swapped. This process continues through the array until the elements are sorted in ascending order.

## How to Run

1. Install the Java Development Kit (JDK).
2. Save the source code as `BubbleSortExample.java`.
3. Open a terminal in the directory where the file is saved.
4. Compile the program:

   ```bash
   javac BubbleSortExample.java
   ```

5. Run the program:

   ```bash
   java BubbleSortExample
   ```

## Sample Output

```text
Enter number of elements: 5
Enter 5 numbers:
64
34
25
12
22

Sorted array:
12 22 25 34 64
```
<img width="167" height="68" alt="image" src="https://github.com/user-attachments/assets/6f837561-ef54-4c09-aa4d-08b3e0a42dde" />


## Time Complexity

| Case | Complexity |
|---|---|
| Best Case | O(n²) |
| Average Case | O(n²) |
| Worst Case | O(n²) |

## Space Complexity

- **O(1)** – The algorithm sorts the array in-place without using additional arrays.

## Technologies Used

- Java
- Scanner class

## Author

Created as a Java programming exercise demonstrating array manipulation and sorting algorithms.
