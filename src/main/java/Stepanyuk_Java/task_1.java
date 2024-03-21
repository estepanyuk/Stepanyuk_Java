package Stepanyuk_Java;

import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число 'a': ");
        int a = in.nextInt();
        System.out.print("Введите число 'b': ");
        int b = in.nextInt();

        if (a > b) {
            System.out.println("a больше b");
        } else if (a < b) {
            System.out.println("b больше a");
        } else {
            System.out.println("a и b равны");
        }

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        in.close();
    }
}