package org.example;

import java.util.Scanner;

public class Khds {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[][] array = new int[n][2];
    for (int i = 0; i < n; i++) {
      array[i][0] = sc.nextInt();
      array[i][1] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      int[] result = new int[array[i][1]];
      for (int j = 0; j < array[i][1]; j++) {
        result[j] = j + 1;
      }
      for (int j = 1; j < array[i][0] + 1; j++) {
        for (int k = 1; k < array[i][1]; k++) {
          result[k] = result[k] + result[k - 1];
        }
      }

      System.out.println(result[array[i][1] -1]);
    }
  }
}