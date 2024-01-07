import java.util.Scanner;

public class Removeduplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1; // Initialize k to 1 since the first element is always unique
        int temp;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                System.out.println(""+k+" " +i);
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" ");
        int length = scanner.nextInt();

        int[] nums = new int[length];
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = removeDuplicates(nums);

        System.out.print("Output: " + result + ", nums = [");
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i] + (i == nums.length-1 ? "]" : ", "));
           
        }

        scanner.close();
    }
}

    

