package lesson1.Svitlana;

public class task4 {
    public  static void main (String [] args) {
//    [5,6,7,12,-5,32,43]
//    Expected Output : 100
        int n=7;
        int a;
        int b;
//initialize every variable
    int[] mass = new int[n];
    mass[0] = 5;
    mass[1] = 6;
    mass [2] = 7;
    mass [3] = 12;
    mass [4] = -5;
    mass [5] = 32;
    mass [6] = 43;
    b = 0; // b is useless
    for (int i = 0; i < n; i++) {
         a = b + mass[i];
         b = a;
         //a = a + mas[i]
        }
System.out.println(b);
    }
}
