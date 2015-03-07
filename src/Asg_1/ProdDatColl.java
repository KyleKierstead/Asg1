/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Asg_1;
import java.util.*;
/**
 *
 * @author kckqt4
 */
public class ProdDatColl 
{

 public void ProdDatColl()
 {
     //double value;
     double Num1; 
     double total =1;
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Please Enter a Positive Number to be multiplied(Enter 0 to Exit): " );
     Num1 = sc.nextDouble();
     
     while(Num1 != 0)
     {
         
     if (Num1>0)  
     {
        
         total = total*Num1;
         System.out.print("Please enter your next number to be multiplied(Enter 0 to Exit): ");
         Num1=sc.nextDouble();
     }
     else
     {
       System.out.println("Your bad at reading instructions");  
       System.out.print("Number is invalid, please try again: ");
       Num1=sc.nextDouble();
     }
      
         
     }
     //System.out.println("Exit works");
     System.out.println("Your total is: " + total);
 }
         
    
    
}
