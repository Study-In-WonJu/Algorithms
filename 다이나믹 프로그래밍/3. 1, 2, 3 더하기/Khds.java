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

    int[] result = new int[11];
    result[0] = 0;
    result[1] = 1;
    result[2] = 2;
    result[3] = 4;
    for (int i = 4; i < result.length; i++) {
      result[i] = result[i - 1] + result[i - 2] + result[i - 3];
    }
    for (int i = 0; i < n; i++) {
      System.out.println(result[array[i]]);
    }
  }
}