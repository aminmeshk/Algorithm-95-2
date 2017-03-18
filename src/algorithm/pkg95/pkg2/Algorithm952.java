/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.pkg95.pkg2;

import java.util.Scanner;

/**
 *
 * @author ali
 */
public class Algorithm952 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // **********************************
        System.out.println("************      Menu      ************** \n Plz Enter One of the Menu Numbers");
        System.out.println("1. Exit \n2. Example 1\n3. etc");
        while(true)
        {
            int n = input.nextInt();
            switch (n)
            {
                case 1:
                    Exit(); // don't forget to use comment in your code.
                    break;
                case 2:
                    System.out.println("some function");
                    break;


            }
        }
        
    }
    public static void Exit()
    {
        /*  Ali Salehi - 9250025
            Run time for this function >> very low
            <the student must write the exact time for their functions>
            <if your fuction takes more than 30 min to compelete, stop the program and write more than 30 min>
        */
        System.out.println("Exit called");
        System.exit(0);
        
        /*
            at this place other student check the function and write down their result. for example:
            Ali Salehi - 9250025{
                run time >> 0.1 sec (or very low)
                how did I optimal the code?
                    >> first
                    >>second
                    >>etc
            }
        */
    }
    
}
