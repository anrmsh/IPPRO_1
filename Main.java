import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("№6 Посчитать сумму от 1 до N");
        System.out.println("Введите N: ");
        int N = scanner.nextInt();
        SumToN_6 obj = new SumToN_6();
        obj.calculateSum(N);
    }
}
