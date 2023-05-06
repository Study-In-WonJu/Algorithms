package org.example;

import java.util.Scanner;

public class Khds {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] array = new int[n][n];
    int[] result = new int[n];
    int[] temp = new int[n];
    for (int i = 0; i < n; i++) {
      result[i] = 0;
      temp[i] = 0;
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i + 1; j++) {
        array[i][j] = sc.nextInt();
        if (j == 0) {
          temp[j] = result[j] + array[i][j];
        } else if (j == i) {
          temp[j] = result[j - 1] + array[i][j];
        } else {
          temp[j] = Math.max(result[j], result[j - 1]) + array[i][j];
        }
      }
      for (int k = 0; k < n; k++) {
        result[k] = temp[k];
      }
    }
    int max = result[0];
    for (int i = 0; i < n; i++) {
      max = Math.max(max, result[i]);
    }
    System.out.println(result[1]);
  }
}