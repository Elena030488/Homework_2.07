import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 22, 13, 10, 10, 20, 16, 16, 16));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три", "один", "четыре"));
        task1(nums);
        task2(nums);
        task3(strings);
        task4(strings);
    }
    public static void task1(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : nums) {
            if (i % 2 != 0) {
                result.add(i);
            }
        }
        System.out.println(result);
    }
    public static void task2(List<Integer> nums) {
        Set<Integer> sort = new TreeSet<>(nums);
        List<Integer> result = new ArrayList<>();
        for (Integer i : sort) {
            if (i % 2 == 0) {
                result.add(i);
            }
        }
        System.out.println(result);
    }

    public static void task3(List<String> strings) {
        Set<String> result = new HashSet<>(strings);
        System.out.println(result);
    }
    public static void task4(List<String> strings) {
        Map<String, Integer> count = new HashMap<>();
        for (String string : strings) {
            if (!count.containsKey(string)) {
                count.put(string, 1);
            } else {
                count.put(string, count.get(string) + 1);
            }
        }
        System.out.println(count);
    }
}