package Stepanyuk_Java;

public class task_3 {

    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < number.length; i++) {
            if ((number[i] % 2) == 0)
                    System.out.println("Четное число: " + number[i]);
        }
    }
}