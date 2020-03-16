/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiso2;

import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class Baiso2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("moi ban vao phan tu thu a[" + i + "]");
            a[i] = sc.nextInt();
        }
        System.out.print("cac so vi tri chan la");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(+a[i] + "    ");
            }

        }
        System.out.print("cac so vi tri le la");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.print(+a[i] + "  ");
            }

        }
        System.out.print("cac so le la");
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 1) {
                System.out.print(+a[i] + "  ");
            }
        }
        System.out.print("cac so chia 5 du 1  la");
        for (int i = 0; i < 10; i++) {
            if (a[i] % 5 == 1) {
                System.out.print(+a[i] + "  ");
            }
        }
       int sum=0;
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) {
              sum+=a[i];
            }
             

    }
         System.out.println("tong cac chu so chan la "+ sum + "  ");
}
}
