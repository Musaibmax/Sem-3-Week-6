public class Week6_4_MaxMinArray {
 public static void main(String[] args) {
  int[] arr = {24, 7, 56, 12, 3, 41}; int max = arr[0], min = arr[0];
  for (int v : arr) { if (v > max) max = v; if (v < min) min = v; }
  System.out.println("Array: 24 7 56 12 3 41");
  System.out.println("Maximum = " + max); System.out.println("Minimum = " + min);
 }
}
