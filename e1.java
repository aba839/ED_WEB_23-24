
import java.util.Scanner;

public class e1 {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Ingrese un número: ");
    int number = scanner.nextInt();
    
    if (isPrime(number)) {
      System.out.println("El número es primo.");
    } else {
      System.out.println("El número no es primo.");
    }
    
    scanner.close();
  }
  

  public static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }    
    
    return true;
  }
}