package lesson1.Daryna;

public class Task5 {

    public static void duplicateFounder(int[] arr) {
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if ((arr[i] == arr1[j]) && (i != j)) {
                    System.out.println(arr[i] + " is duplicate");
                }


            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 12, -5, 32, 43, 6, 12};
        duplicateFounder(arr);
    }
}
