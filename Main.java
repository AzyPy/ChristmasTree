import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = Integer.parseInt(scanner.nextLine());
        christmasTree(digit);
    }
    public static void christmasTree(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars((i + i) - 1);
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(size - 2);
            printStars(3);
            System.out.println();
        }
    }
    public static void printStars(int star) {
        for (int i = 1; i <= star; i++) {
            System.out.print("*");
        }
    }
    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }
}