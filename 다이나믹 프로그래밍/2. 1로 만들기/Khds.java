package org.example;

import java.util.Scanner;

public class Khds {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n + 1];

    for (int i = 0; i < n + 1; i++) {
      array[i] = -1;
    }
    array[1] = 0;

    for (int i = 1; i < n + 1; i++) {
      if (i * 3 <= n) {
        array[i * 3] = array[i * 3] >= 0 ? Math.min(array[i * 3], array[i] + 1) : array[i] + 1;
      }
      if (i * 2 <= n) {
        array[i * 2] = array[i * 2] >= 0 ? Math.min(array[i * 2], array[i] + 1) : array[i] + 1;
      }
      if (i + 1 <= n) {
        array[i + 1] = array[i + 1] >= 0 ? Math.min(array[i + 1], array[i] + 1) : array[i] + 1;
      }
    }

    System.out.println(array[n]);
  }
}