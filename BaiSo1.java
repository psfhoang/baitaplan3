/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.so.pkg1;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class BaiSo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap vao so phan tu cua mang");
        int n = sc.nextInt();
        int[] a = new int[n];
        int dem = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + (i+1) + "]");
            a[i] = sc.nextInt();

        }
        
        System.out.println("1.Chuyển mọi phần tử có giá trị lẻ trong mảng thành -1");
        System.out.println("2.In ra phần tử lớn nhất của mảng");
        System.out.println("3.Chuyển phần tử nhỏ nhất trong mảng thành -1");
        System.out.println("4.Nhập vào 1 số tự nhiên x, "
                + "In ra mọi phần tử nhỏ hơn x ở trong mảng");
        System.out.println("5.Nhập vào 1 số tự nhiên x ,"
                + " in ra phần tử có giá trị gần với giá trị của x nhất ở trong mảng");
        System.out.println("6.Kiểm tra sự đối xứng của mảng ");
        
        System.out.println("chon lua chon cua ban");
        int luachon = sc.nextInt();
        switch (luachon) {
            case 1:
                for (int i = 0; i < n; i++) {
                    if (a[i] % 2 == 1) {
                        a[i] = -1;
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");

                }
                break;
            case 2:
                int min = a[0];
                int max = a[0];
                for (int i = 0; i < n; i++) {
                    if (a[i] > max) {
                        max = a[i];
                    }
                }
                
                System.out.println("so lon nhat la" + max);
                break;
            case 3:
                int minn = a[0];
                for (int i = 0; i < n; i++) {
                    if (a[i] < minn) {
                        minn = a[i];

                    }
                }
                for (int i = 0; i < n; i++) {
                    if (a[i] == minn) {
                        a[i] = -1;
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i]);

                }
                break;
            case 4:
                System.out.println("nhap vao so tu nhien x");
                int x = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    if (a[i] < x) {
                        System.out.println(a[i]);
                    }
                }
                break;
            case 5:
                System.out.println("nhap vao 1 so tu nhien x");
                int y = sc.nextInt();
                int minnn = a[0];
                int[] b = new int[n];
                for (int i = 0; i < n; i++) {
                    b[i] = abs(a[i] - y);
                }

                for (int i = 0; i < n; i++) {
                    if (b[i] < minnn) {
                        minnn = b[i];
                    }

                }
                for (int i = 0; i < n; i++) {
                    if (b[i] == minnn) {
                        System.out.println("so gan nhat voi so do la    " + a[i]);
                    }
                }
                break;
            case 6:
                for (int i = 0; i < a.length / 2; i++) {

                    if (a[i] == a[(n - 1 - i)]) {
                        dem++;
                    }

                }
                if (dem == a.length / 2) {
                    System.out.println("la mang doi xung");
                } else {
                    System.out.println("k la mang doi xung");
                }

        }

    }
}
