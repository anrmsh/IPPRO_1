public class FindMaxNum {
    public void findMaxNum(int a, int b, int c) {
        System.out.println("Введенные числа:");
        System.out.println("а = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        if (a==b && b==c){
            System.out.println("Числа равны");
        }
        else if (a>b || a>c){
            System.out.println("Максимальное число: " + a);
        }
        else if (b>a && b>c){
            System.out.println("Максимальное число: " + b);
        }
        else {
            System.out.println("Максимальное число: " + c);
        }

    }
}
