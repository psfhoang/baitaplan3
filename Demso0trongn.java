/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demso0trongn;

import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class Demso0trongn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap vao 1 so");
        int n = sc.nextInt();
        int sum=1,dem=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum*i;
        }
        while(sum>0)
        {
            if(sum%10==0)
            {
                dem++;
            }
            sum=sum/10;
        }
        System.out.println("so chu so 0 la      "+ dem  );
                
    }
    
}
