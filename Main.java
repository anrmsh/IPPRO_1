import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("№6 Посчитать сумму от 1 до N");
        System.out.println("Введите число N: ");
        int N = getIntInput(scanner,"Введите N: ");
        SumToN_6 obj = new SumToN_6();
        obj.calculateSum(N);


        System.out.println("№7 Найти максимальное число из 3 чисел");
        int a = getIntInput(scanner,"Введите a: ");System.out.println("Введите b: ");
        int b = getIntInput(scanner,"Введите b: ");
        int c = getIntInput(scanner,"Введите c: ");

        FindMaxNum findMax7 = new FindMaxNum();
        findMax7.findMaxNum(a,b,c);

        System.out.println("№8 Сгенерировать 5 рандомных чисел");
        GeneratorRandomNum generator = new GeneratorRandomNum();
        generator.generateRandomNum();

        System.out.println("№9 Посчитать количество гласных в строке");
        System.out.println("Введите строку на английском:");
        String str = scanner.next();
        VowelsCounter counter = new VowelsCounter();
        counter.countVowels(str);



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
