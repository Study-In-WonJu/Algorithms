package org.example;

import java.util.Scanner;

public class Khds {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n + 1];

    array[0] = -1;
    array[1] = -1;
    array[2] = -1;
    array[3] = 1;
    if (n <= 3) {
      System.out.println(array[n]);
      return;
    }
    if (n == 4) {
      System.out.println(-1);
      return;
    }
    if (n == 5) {
      System.out.println(1);
      return;
    }
    array[4] = -1;
    array[5] = 1;
    for (int i = 6; i < n + 1; i++) {
      if (array[i - 3] >= 1 && array[i - 5] >= 1) {
        array[i] = Math.min(array[i - 3], array[i - 5]) + 1;
        continue;
      }
      if (array[i - 3] == -1 && array[i - 5] == -1) {
        array[i] = -1;
        continue;
      }
      array[i] = Math.max(array[i - 3], array[i - 5]) + 1;
    }

    System.out.println(array[n]);
  }
}