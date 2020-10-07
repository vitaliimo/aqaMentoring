package lesson1.Denis;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input only integer numbers to make their sum");
        System.out.print("A=");
        int A = scanner.nextInt();
        System.out.print("B=");
        int B = scanner.nextInt();
        int Res=A+B;
        int Res1=A-B;
        int Res2=A*B;
        int Res3=A/B;
        int Res4=A%B;

        System.out.println("A+B = "+Res + "\n" + "A-B = "+Res1 + "\n" + "A*B = "+Res2 + "\n" + "A/B = "+Res3 + "\n" + "A%B = "+Res4);

    }
}
