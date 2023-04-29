package org.example;

import java.util.Scanner;

public class Khds {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      int[] zero = new int[array[i] + 1];
      int[] one = new int[array[i] + 1];
      for (int j = 0; j <= array[i]; j++) {
        zero[j] = 0;
        one[j] = 0;
      }
      zero[0] = 1;
      one[0] = 0;
      if (array[i] >= 1) {
        zero[1] = 0;
        one[1] = 1;
      }
      for (int j = 2; j <= array[i]; j++) {
        zero[j] = zero[j - 1] + zero[j - 2];
        one[j] = one[j - 1] + one[j - 2];
      }
      System.out.println(zero[array[i]] + " " + one[array[i]]);
    }
  }
}