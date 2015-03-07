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
public class ExamScore 
{
    public void ExamScore()
    {
     int input;
     int count;
     int sumA,sumB,sumC,sumD,sumF;
     sumA=sumB=sumC=sumD=sumF=0;
     Scanner sc = new Scanner(System.in); 
     System.out.print("Please the first whole test score between 0 and 100(Enter -99 to exit): ");
     input = sc.nextInt();
     
     while(input!=-99)
     {
         
     if(input>=90)
     {
         
       sumA++;
       System.out.println("The inputed test score is " + input + ". This is an A");
     }
     else if(input >= 70)
     {
     sumB++;
     System.out.println("The inputed test score is " + input + " This is a  B");
     }
     else if(input >= 50)
     {
     sumC++;
     System.out.println("The inputed test score is " + input + " This is a C");
     }
     else if(input >= 35)
     {
     sumD++;
     System.out.println("The inputed test score is " + input + " This is a D");
     }
     else if(input>=0)
     {
     sumF++;
     System.out.println("The inputed test score is " + input + " This is a F");
     }
     else 
     System.out.println("Your input is invalid, Please try again");
     {
         
     }
     System.out.println(" ");
     System.out.println("Currently you have entered\n"+
     sumA + " A('s)\n"+
              sumB + " B('s)\n"
             + sumC + " C('s)\n"
             + sumD +" D('s)\n"
             + sumF +" F('s)");
     System.out.println(" ");
     System.out.print("Please enter your next test score(Enter -99 to Exit): ");
     input = sc.nextInt();
     }
     //while(input!=-99);
     System.out.println(" ");
     System.out.println("You have entered\n"+
     sumA + " A('s)\n"+
              sumB + " B('s)\n"
             + sumC + " C('s)\n"
             + sumD +" D('s)\n"
             + sumF +" F('s)");
     }
     
    
}
    
