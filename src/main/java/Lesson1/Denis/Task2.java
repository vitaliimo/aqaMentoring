package Lesson1.Denis;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select option:" + " 1: A+B*C" + " 2: (A+B)%C" + " 3: A+B*C/D" + " 4: A+B/C*D-E%F");

        System.out.println("Please input only integer numbers to have some result");
        System.out.print("Option: ");
            int Opt = scanner.nextInt();

            switch (Opt){
                case 1:
                    System.out.print("A=");
                    int A = scanner.nextInt();
                    System.out.print("B=");
                    int B = scanner.nextInt();
                    System.out.print("C=");
                    int C = scanner.nextInt();
                    int res=A+B*C;
                    System.out.println("A+B*C="+res);
                    break;
                case 2:
                    System.out.print("A=");
                    int A1 = scanner.nextInt();
                    System.out.print("B=");
                    int B1 = scanner.nextInt();
                    System.out.print("C=");
                    int C1 = scanner.nextInt();
                    int res1=(A1+B1)%C1;
                    System.out.println("(A+B)%C="+res1);
                    break;
                case 3:
                    System.out.print("A=");
                    int A2 = scanner.nextInt();
                    System.out.print("B=");
                    int B2 = scanner.nextInt();
                    System.out.print("C=");
                    int C2 = scanner.nextInt();
                    System.out.print("D=");
                    int D2 = scanner.nextInt();
                    int res2=A2+B2*C2/D2;
                    System.out.println("A+B*C/D="+res2);
                    break;
                case 4:
                    System.out.print("A=");
                    int A3 = scanner.nextInt();
                    System.out.print("B=");
                    int B3 = scanner.nextInt();
                    System.out.print("C=");
                    int C3 = scanner.nextInt();
                    System.out.print("D=");
                    int D3 = scanner.nextInt();
                    System.out.print("E=");
                    int E3 = scanner.nextInt();
                    System.out.print("F=");
                    int F3 = scanner.nextInt();
                    int res3=A3+B3/C3*D3-E3%F3;
                    System.out.println("A+B/C*D-E%F="+res3);
                    break;
                default:
                    System.out.println("Not correct operation selected");

            }

    }
}
