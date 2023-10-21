import java.util.*;

public class Main {

    public static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    public static List<String> words = new ArrayList<>(List.of("abc", "abc", "bcd", "bcd", "a"));
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("task1:");
        for (int num : nums) {
            if (num%2 == 1) {
                System.out.println(num);
            }
        }
    }
    public static void task2(){
        System.out.println("task2:");
        Collections.sort(nums);
        int prevNum = nums.get(0);
        for (int num : nums) {
            if (num%2 == 0 && num != prevNum) {
                System.out.println(num);
            }
            prevNum = num;
        }
    }
    public static void task3(){
        System.out.println("task3:");
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }
    public static void task4(){
        System.out.println("task4:");
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size() - uniqueWords.size());
    }
}