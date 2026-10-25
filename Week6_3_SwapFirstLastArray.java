import java.util.Arrays;
public class Week6_3_SwapFirstLastArray {
 public static void main(String[] args) {
  int[] arr = {10, 20, 30, 40, 50};
  System.out.println("Original array: " + Arrays.toString(arr));
  int temp = arr[0]; arr[0] = arr[arr.length - 1]; arr[arr.length - 1] = temp;
  System.out.println("After swapping: " + Arrays.toString(arr));
 }
}
