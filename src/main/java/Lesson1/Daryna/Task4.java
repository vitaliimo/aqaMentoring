package Lesson1.Daryna;

public class Task4 {

    public static void sumOfArrayElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 12, -5, 32, 43};
        sumOfArrayElements(arr);

    }
}
