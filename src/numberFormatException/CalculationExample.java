package numberFormatException;

import java.util.Scanner;

public class CalculationExample {
    public void calculation(int x, int y){
        try{
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x/y;
            System.out.println("Tong cua x va y la " + a);
            System.out.println("Hieu cua x va y la " + b);
            System.out.println("Tich cua x va y la " + c);
            System.out.println("Thuong cua x va y la " +d);
        }
        catch (Exception e){
            System.out.println("Ngoai le xay ra " +e.getMessage());
        }
    }

    public static void main(String[] args) {
        CalculationExample calculationExample = new CalculationExample();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x");
        int x = scanner.nextInt();
        System.out.println("Nhap y");
        int y = scanner.nextInt();
        calculationExample.calculation(x,y);
    }
}
