package Stepanyuk_Java;

import java.util.Scanner;

public class task_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст для 'a': ");
        String a = in.nextLine();
        System.out.print("Введите текст для 'b': ");
        String b = in.nextLine();

        if( a.equals(b)){
            System.out.println("Строки идентичны");
        }else{
            System.out.println("Строки неидентичны");
        }

        in.close();
    }
}