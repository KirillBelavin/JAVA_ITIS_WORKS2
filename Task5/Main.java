import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int a;
  int b;
  int sum = 0;
  int product = 1;
  a = scanner.nextInt();
  b = a;
  while (a != -1) {
  while (b > 0) {
   sum = sum + b % 10;
   b = b / 10;
   }
   if (sum == 7) {
    product = product * a;
   }
   sum = 0;
   a = scanner.nextInt();
   b = a;
  }
   System.out.println(product); 
 }
}