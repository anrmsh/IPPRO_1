import java.util.Random;

public class GeneratorRandomNum {
    public void generateRandomNum() {
        Random random = new Random();
        int[] nums = new int[5];

        for (int i=0; i<5; i++){
            nums[i] = random.nextInt(100)+1;
            System.out.print(nums[i]+" ");
        }

    }
}
