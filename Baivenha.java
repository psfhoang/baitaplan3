/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baivenha;

import static java.lang.Math.abs;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class Baivenha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here4
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap vao so phan tu cua mang");
        int n = sc.nextInt();
        int[] a = new int[n];
        int dem = 0;

//nhap mang
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]");
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);

        }
        System.out.println("");
//kiem tra mang doi xung   
//        for (int i = 0; i < a.length / 2; i++) {
//          
//           if(a[i]==a[(n-1-i)])
//           {
//               dem++;
//           }
//           
//            
//        }
//        if(dem==a.length/2){
//            System.out.println("la mang doi xung");
//        }
//        else {
//            System.out.println("k la mang doi xung");
//        }
        // Chuyển mọi phần tử có giá trị lẻ trong mảng thành -1    
//       for(int i =0;i<n;i++)
//       {
//           if(a[i]%2==1)
//           {
//               a[i]=-1;
//           }
//       }
//        for (int i = 0; i < n; i++) {
//            System.out.print(a[i]+" ");
//
//        }
//    }
        //In ra phần tử lớn nhất của mảng
//        int min = a[0];
//        int max = a[0];
//        for (int i = 0; i < n; i++) {
//            if (a[i] > max) {
//                max = a[i];
//            }
//        }
//        System.out.println("so nho nhat la" + max);
          //Chuyển phần tử nhỏ nhất trong mảng thành -1
//          int min=a[0];
//          for(int i=0;i<n;i++)
//          {
//              if(a[i]<min)
//              {
//                  min=a[i];
//                  
//              }
//          }
//          for(int i=0;i<n;i++)
//          {
//              if(a[i]==min)
//              {
//                  a[i]=-1;
//              }
//          }
          
//Nhập vào 1 số tự nhiên x, In ra mọi phần tử nhỏ hơn x ở trong mảng
//            System.out.println("nhap vao so tu nhien x");
//            int x =sc.nextInt();
//            for(int i=0;i<n;i++)
//            {
//                if(a[i]<x)
//                {
//                    System.out.println(a[i]);
//                }
//            }
//   Nhập vào 1 số tự nhiên x, In ra mọi phần tử nhỏ hơn x ở trong mảng
           System.out.println("nhap vao 1 so tu nhien x");
           int y=sc.nextInt();
           int min=a[0];
        int [] b=new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=abs(a[i]-y) ;      
        }
        for (int i = 0; i < n; i++) {
            System.out.print(b[i]+" ");

        }
        
        for(int i=0;i<n;i++)
        {
            if(b[i]<min)
            {
                min=b[i];
            }
            
        }
        for(int i=0;i<n;i++)
        {
            if(b[i]==min)
            {
                System.out.println("so gan nhat voi so do la"+a[i]);
            }
        }
       
            
    }
    
    
}
