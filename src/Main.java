import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numbers[] = new int[5];
    int count = 0;
    int totalPlus = 0;
    while (count < 5) {
      System.out.print("Número " + (count + 1) + ": ");
      numbers[count] = scanner.nextInt();
      count++;
    }
    System.out.println("Los números ingresados son:");
    for (int number : numbers) {
      System.out.println(number);
    }
    int max = numbers[0];
    int min = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
      if (numbers[i] < min) {
        min = numbers[i];
      }
      totalPlus += numbers[i];
    }
    System.out.println("El número mayor del array es: " + max);
    System.out.println("El número menor del array es: " + min);
    System.out.println("La suma de los elementos es: " + totalPlus);
    System.out.println("El promedio de los elementos es: " + totalPlus/numbers.length);
  }
}