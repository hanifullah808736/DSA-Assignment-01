# DSA Array Assignment 01

## Student Information

- **Student Name:** Hanif ullah
- **Class:** BSCS 3 B
- **Subject:** Data Structures and Algorithms
- **Programming Language:** Java
- **Assignment Title:** Arrays and Array Operations
- **Repository Name:** `DSA-Array-Assignment-01`

## Assignment Overview

This repository contains Java programs demonstrating basic array operations and algorithms. The tasks cover array traversal, reversing, finding minimum and maximum values, calculating statistics, searching, insertion, deletion, sorting, identifying duplicates, and merging arrays.

Each task is implemented in a separate Java file.

## Tasks and Descriptions

### Task 01 — Display Array in Reverse

**File:** `Task01.java`

Declare an array of 10 integers, display all its elements, and then display the elements in reverse order.

- **Time Complexity:** O(n) — Each element is accessed once for normal display and once for reverse display.
- **Space Complexity:** O(n) — The array stores n integers.

### Task 02 — Find Largest, Smallest, and Second Minimum

**File:** `Task02.java`

Find the largest and smallest values in an array, along with their indices. Also find the second-smallest distinct value and display its index.

- **Time Complexity:** O(n) — Possible with a single traversal that tracks the required values and indices.
- **Space Complexity:** O(1) extra space — Only a fixed number of variables are needed, excluding the input array.

### Task 03 — Sum, Average, and Count Above Average

**File:** `Task03.java`

Calculate the sum and average of the array elements, then count how many elements are greater than the average.

- **Time Complexity:** O(n) — One traversal calculates the sum, and another counts elements above the average.
- **Space Complexity:** O(n) — The input array stores n integers; the calculations use O(1) extra space.

### Task 04 — Linear Search

**File:** `Task04.java`

Search for a user-entered number using linear search. Display every index where the number occurs, or a message if the number is not found.

- **Time Complexity:** O(n) — In the worst case, every element must be checked.
- **Space Complexity:** O(1) extra space — The search uses a fixed number of additional variables.

### Task 05 — Insert an Element into an Array

**File:** `Task05.java`

Ask the user for an insertion index and a value. Shift the necessary elements one position to the right, insert the value, and display the updated array.

- **Time Complexity:** O(n) — In the worst case, elements must be shifted to make room.
- **Space Complexity:** O(n) — The array must have capacity for the additional element.

### Task 06 — Delete an Element from an Array

**File:** `Task06.java`

Ask the user for an index to delete. Shift the following elements one position to the left and display the updated array without the deleted element.

- **Time Complexity:** O(n) — In the worst case, most of the remaining elements must be shifted.
- **Space Complexity:** O(1) extra space — Deletion can be performed in place using a fixed number of variables.

### Task 08 — Bubble Sort

**File:** `Task08.java`

Sort an array of 10 integers in ascending order using Bubble Sort. Display the sorted array in ascending order and then in descending order.

- **Best-Case Time Complexity:** O(n) when the implementation stops early if no swaps occur.
- **Average-Case Time Complexity:** O(n²) — Multiple passes compare adjacent elements.
- **Worst-Case Time Complexity:** O(n²) — Many comparisons and swaps may be required.
- **Space Complexity:** O(1) extra space — The array is sorted in place.

### Task 09 — Find Duplicate Elements

**File:** `Task09.java`

Identify duplicate values in an array of 10 integers. Display each duplicate value only once, together with its total occurrence count.

- **Time Complexity:** O(n²) — Nested loops can be used to check earlier elements and count occurrences.
- **Space Complexity:** O(1) extra space — The operation can be performed using the existing array and a fixed number of variables.

### Task 10 — Merge Two Arrays and Find the Largest Element

**File:** `Task10.java`

Take input for two arrays in ascending order, copy their elements into a third array, display the merged array, and find its largest element.

- **Time Complexity:** O(n + m) — Copying both arrays and finding the largest element takes linear time.
- **Space Complexity:** O(n + m) — The third array stores all elements from both input arrays.

**Note:** This task copies one array after the other; it does not necessarily produce a sorted merged array.

### Task 11 — Merge Two Sorted Arrays

**File:** `Task11.java`

Merge two arrays that are already sorted in ascending order into a third array. Compare the current elements and copy the smaller one into the merged array, without applying a sorting algorithm.

- **Time Complexity:** O(n + m) — Each element is processed once.
- **Space Complexity:** O(n + m) — The merged array stores all elements from both input arrays.

## Summary of Complexities

| Task | Operation                           | Time Complexity     |
| ---- | ----------------------------------- | ------------------- |
| 01   | Display and reverse                 | O(n)                |
| 02   | Largest, smallest, second minimum   | O(n)                |
| 03   | Sum, average, count                 | O(n)                |
| 04   | Linear search                       | O(n)                |
| 05   | Insert element                      | O(n)                |
| 06   | Delete element                      | O(n)                |
| 08   | Bubble Sort                         | O(n²) average/worst |
| 09   | Find duplicates                     | O(n²)               |
| 10   | Copy and merge arrays, find maximum | O(n + m)            |
| 11   | Merge sorted arrays                 | O(n + m)            |

Here, **n** and **m** represent the sizes of the input arrays.

## General Instructions Followed

- Each task is stored in a separate Java source file.
- Java arrays are used for the required operations.
- Array operations are implemented using loops and basic logic rather than built-in methods for sorting, searching, copying, reversing, or merging.
- Meaningful comments are included in the code.
- Time and space complexities are explained for each task.

## Repository Structure

```text
DSA-Array-Assignment-01/
├── README.md
├── .gitignore
├── Task01.java
├── Task02.java
├── Task03.java
├── Task04.java
├── Task05.java
├── Task06.java
├── Task08.java
├── Task09.java
├── Task10.java
└── Task11.java
```

**Note:** Task 07 is not included because it was not listed in the provided assignment PDF.

## How to Compile and Run

Make sure Java is installed on your computer.

To compile a task, open a terminal in the repository folder and run:

```bash
javac Task01.java
```

To run the compiled program, use:

```bash
java Task01
```

Replace `Task01` with the name of the task you want to run.

## GitHub Repository

**Repository Name:** `DSA-Array-Assignment-01`

After completing and testing the programs, upload the files to your GitHub repository.

Example Git commands:

```bash
git add .
git commit -m "Complete array assignment tasks"
git push
```

## Conclusion

This assignment provides practical experience with Java arrays and fundamental data structure operations. It develops an understanding of array traversal, insertion, deletion, searching, sorting, duplicate detection, merging techniques, and algorithm complexity.
