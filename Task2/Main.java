import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int a;
  int sum = 0;
  a = scanner.nextInt();
  while (a > 0) {
   sum = sum + a % 10;
   a = a / 10;
   }
   System.out.println(sum);
  }
 } 
  



  

