package arrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[5];
        System.out.println("Danh sach phan tu cua mang");
        for (int i = 0; i < 5; i++) {
            arr[i] = rd.nextInt(5);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chi so cua mot phan tu bat ky ");
        int x = scanner.nextInt();
        try{
            System.out.println("Gia tri cua phan tu tai chi so " + x + " la " + arr[x]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Chi so khong co trong mang");
        }
    }
}
