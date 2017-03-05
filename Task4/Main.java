import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int a;
  int sum = 0;
  int product = 1;
  a = scanner.nextInt();
  while (a != -1) {
   if (a > 0) {
    product = product * a;
   }
   if (a % 2 != 0) {
    sum = sum + a;
   } 
   a = scanner.nextInt();
  }
   System.out.println(product);
   System.out.println(sum);
  }
 } 