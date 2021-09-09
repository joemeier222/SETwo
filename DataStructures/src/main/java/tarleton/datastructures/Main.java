/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarleton.datastructures;

import java.util.Scanner;

/**
 *
 * @author Joe Meier
 */
public class Main {
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stack size: ");
        String size = sc.nextLine();
        Queue q1 = new Queue(Integer.valueOf(size));
        while(true){
            System.out.println("Enter value: ");
            String input = sc.nextLine();
            int n = Integer.valueOf(input);
            if(n == 0){break;}
            if(q1.isFull()){
                System.out.println("Print Value:");
                System.out.println(q1.get());
                q1.append(n);}            
            else{q1.append(n);}
        }
        System.out.println("Print Remaining Values:");
        while(!q1.isEmpty()){            
            System.out.println(q1.get());
        }           
    }  
}
