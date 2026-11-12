/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livecoding_11.pkg12.pkg2026;

import java.util.Scanner;

/**
 *
 * @author huawei
 */
public class Livecoding_11122026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        input.useDelimiter("[//a,]-");
        int firstnumber = input.nextInt();
        int secondnumber = input.nextInt();
        
        if(firstnumber < 0 || secondnumber < 0){
            System.out.println("negative number is not allowed. ");
        }else if (firstnumber == 0 && secondnumber == 0){
            System.out.println(" GCD is undefined. ");
        }else {
            System.out.println(gcd(firstnumber, secondnumber));
        }
        input.close();
    }
    static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}