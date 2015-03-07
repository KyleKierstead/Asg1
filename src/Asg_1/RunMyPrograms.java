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
public class RunMyPrograms 
{
    public static void main(String args[])
    {
        boolean cont = true;
        int UserSelct;
        Scanner sc = new Scanner(System.in);
        String Conty;
        Scanner user_input = new Scanner(System.in);
      while(cont == true)
      {  
        System.out.println("Which Program would you like to use?? \n"
        + "1)Product no negatives\n"
        + "2)Find Twelve\n"
        + "3)Max MinAvg\n"
        + "4)Letter Grade\n"
        + "5)Exit");  
        UserSelct = sc.nextInt();
      
        if(UserSelct == 1)
        {
          ProdDatColl test1 = new ProdDatColl();
          test1.ProdDatColl();
          //System.out.print("Would you like to run a differnt program?? ");
        /*Conty = user_input.next();
            if ("/yes".equals(Conty))
            {
                cont = true;
            } 
            else if(Conty=="no")
            {
                cont = false;
            }
            else
            {
             System.out.print("Input not Valid\n"
                     + "Returning to Main Menu\n"
                     + " \n"
                     + "");  */ 
          System.out.print("Program completed\n"
                     + "Returning to the Main Menu\n"
                     + " \n"
                     + "");   
           // }
        }
        else if(UserSelct == 2)
        {
          System.out.println("Error 404. File Not Found\n"
                   + "Please reinput selection");
        }
        else if(UserSelct == 3)
        {
          System.out.println("Error 404. File Not Found\n"
                   + "Please reinput selection");
        }
        else if(UserSelct == 4)
        {
           ExamScore test1 = new ExamScore();
          test1.ExamScore();
        }
        else if(UserSelct == 5)
        {
         System.out.println("Goodbye");
         cont=false;
        }
        else
        {
           System.out.println(" \n"
                   +"Invalid Input\n"
                   + "Returning to Main Menu\n"
                   + " ");
        }
       /* System.out.println("Would you like to make another selection??");
        conty = sc.toString();
       // contYN = changeCase.toLowerCase();
        if(contYN == "yes")
        {
         cont = true;   
        }
        else if(contYN == "no" )
        {
         cont = false;
        }
        else
        {
         System.out.println("Error 404 File Not Found\n"
                 + "Returnig to Main Menu");   
        }*/
      }   
    }   
}
