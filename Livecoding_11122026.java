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
        int num = input.nextInt();
        
        if(num < 0){
            System.out.println("negative numbers is not allowed. ");
        }else{
            System.out.println(sumOfDigits(num));
        }
        input.close();
    }
    static int sumOfDigits(int num){
        
        if (num == 0 ){
            return 0;
        }
        int lastDigit = num % 10;
         int remainingDigits = num / 10;
         return lastDigit + sumOfDigits(remainingDigits);
         
    }
}