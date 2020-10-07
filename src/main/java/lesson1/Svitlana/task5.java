package lesson1.Svitlana;

public class task5 {
    public static void main (String [] args) {
//[5,6,7,12,-5,32,43,6,12]
//Expected Output : 6,12
        int n = 9;
        int m = 8;

        int[] mass = new int[n];
        mass[0] = 5;
        mass[1] = 6;
        mass [2] = 7;
        mass [3] = 12;
        mass [4] = -5;
        mass [5] = 32;
        mass [6] = 43;
        mass [7] = 6;
        mass [8] = 12;

        for (int i = 0; i < n; i++) {
            for (int ii = i; ii<m; ii++) {
                if (mass[i] == mass[ii+1])
                    System.out.println("mass [" + i + "] =" + mass[i]);
            }
        }
    }
}
