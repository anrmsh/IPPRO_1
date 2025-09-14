import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("№6 Посчитать сумму от 1 до N");
        System.out.println("Введите N: ");
        int N = scanner.nextInt();
        SumToN_6 obj = new SumToN_6();
        obj.calculateSum(N);


        System.out.println("№7 Найти максимальное число из 3 чисел");
        System.out.println("Введите a: ");
        int a = scanner.nextInt();
        System.out.println("Введите b: ");
        int b = scanner.nextInt();
        System.out.println("Введите c: ");
        int c = scanner.nextInt();


    }



    public static int getIntInput(Scanner scanner, String prompt) {
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(prompt);
            try {
                number = scanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Ошибка: пожалуйста, введите целое число.");
                scanner.next(); 
            }
        }

        return number;
    }
}
