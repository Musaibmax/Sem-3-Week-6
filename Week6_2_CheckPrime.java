import java.util.Scanner;
public class Week6_2_CheckPrime {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a number: "); int n = sc.nextInt();
  boolean prime = n > 1;
  for (int i = 2; i <= Math.sqrt(n) && prime; i++) if (n % i == 0) prime = false;
  if (prime) System.out.println(n + " is a prime number.");
  else System.out.println(n + " is not a prime number.");
 }
}
