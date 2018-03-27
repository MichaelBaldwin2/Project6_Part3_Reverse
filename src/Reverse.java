import java.text.DecimalFormat;
import java.util.Scanner;

public class Reverse {
// Written by: Mike Baldwin
// Project 6 - Part 3 - Reverse
// This program reads in 8 positive integers.
// Then it prints out the values in reverse order
// as well as the average.

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] inputArr;
    DecimalFormat format;

    format = new DecimalFormat("##.#");
    inputArr = new int[8];
    System.out.print("Please enter 8 positive integers: ");
    for (int i = 0; i < 8; i++) {
        inputArr[i] = scanner.nextInt();
    }

    reverse(inputArr);
    System.out.println("The values in reverse order are:");
    for (int anInputArr : inputArr)
        System.out.print(anInputArr + " ");

    System.out.print("\nThe average is " + getTotal(inputArr) + "/8 = " +
            format.format(getAverage(inputArr)));
}

private static void reverse(int[] arr) {
    int[] tempArr;
    tempArr = new int[arr.length];
    for (int i = 0, j = arr.length - 1; j >= 0; i++, j--)
        tempArr[i] = arr[j];
    System.arraycopy(tempArr, 0, arr, 0, tempArr.length);
}

private static int getTotal(int[] arr) {
    int total;
    total = 0;
    for (int i : arr)
        total += i;
    return total;
}

private static double getAverage(int[] arr) {
    return (double) getTotal(arr) / (float) arr.length;
}
}
