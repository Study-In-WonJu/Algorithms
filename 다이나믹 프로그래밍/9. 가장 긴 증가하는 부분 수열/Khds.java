package org.example;

import java.util.Scanner;

public class Khds {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];
    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
      result[i] = 1;
    }
    for (int i = 1; i < n; i++) {
      int temp = 0;
      for (int j = i - 1; j >= 0; j--) {
        if (array[i] <= array[j]) {
          continue;
        }
        temp = Math.max(result[j], temp);
      }
      result[i] = temp + 1;
    }
    int max = 0;
    for (int i = 0; i < n; i++) {
      max = Math.max(max, result[i]);
    }
    System.out.println(max);
  }
}