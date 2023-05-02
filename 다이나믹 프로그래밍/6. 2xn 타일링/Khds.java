package org.example;

import java.util.Scanner;

public class Khds {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] array = new int[n];
    array[0] = 1;
    if (n == 1) {
      System.out.println(1);
      return;
    }

    array[1] = 2;
    for (int i = 2; i < n; i++) {
      array[i] = array[i - 1] + array[i - 2];
      if (array[i] >= 10007) {
        array[i] %= 10007;
      }
    }
    System.out.println(array[n - 1]);
  }
}