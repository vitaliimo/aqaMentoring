package lesson1.Denis;

public class Task5 {
    public static void main(String[] args) {
        int num[] = new int[]{5,6,7,12,-5,32,43,6,12};
        for (int i = 0; i < num.length; i++) {
            for( int j=i+1; j<num.length; j++){
                if (num[i]==num[j]) {
                    System.out.println(num[i]);
                }
            }
        }

    }
}
