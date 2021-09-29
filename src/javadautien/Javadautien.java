
package javadautien;

import java.util.Scanner;
public class Javadautien {

    
    public static void main(String[] args) {
       char phepTinh;
        Double so1, so2, ketQua;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chọn phép tính (+, -, * hoặc /): ");
        phepTinh = scanner.next().charAt(0);
        System.out.print("Nhập Số 1 và Số 2: ");
        so1 = scanner.nextDouble();
        so2 = scanner.nextDouble();
        
        switch (phepTinh) {
         case '+':
           ketQua = so1 + so2;
           System.out.print(so1 + " + " + so2 + " = " + ketQua);
           break;

         case '-':
           ketQua = so1 - so2;
           System.out.print(so1 + " - " + so2 + " = " + ketQua);
           break;

         case '*':
           ketQua = so1 * so2;
           System.out.print(so1 + " * " + so2 + " = " + ketQua);
           break;

         case '/':
           ketQua = so1 / so2;
           System.out.print(so1 + " / " + so2 + " = " + ketQua);
           break;

         default:
           System.out.println("Phép tính không hợp lệ");
           break;
        }
    }
    
}
