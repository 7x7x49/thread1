import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int[] array = new int[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Введите %d-e значение: ", i);
            array[i] = sc.nextInt();
        }
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                int min = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (min > array[i]) min = array[i];
                }
                System.out.println("Минимальное значение: " + min);
            }
        };
        thread1.start();
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                int max = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (max < array[i]) max = array[i];
                }
                System.out.println("Максимальное значение: " + max);
            }
        };
        thread2.start();
    }}
