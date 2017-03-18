/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.pkg95.pkg2;

import java.io.File;
import java.io.FileWriter;
import java.util.Random;
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
        System.out.println("1. Exit \n2. Generate File\n3. etc");
        while(true)
        {
            int n = input.nextInt();
            switch (n)
            {
                case 1:
                    Exit(); // don't forget to use comment in your code.
                    break;
                case 2:
                    System.out.println("Generating random integers and writing to File.txt ...");
                    generateFile();
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
    
    
    public static void generateFile()
    {
        /*  Mohammad Amin Meshk - 9450025
            Mansour Ahmadzadeh - 9450001
            Run time for this function: < 1 second
        */
        try
        {
            long FirstTime = System.currentTimeMillis();
            Random rand = new Random();
            File file = new File("File.txt");
            FileWriter wr = new FileWriter(file);
            wr.append(1 + ",");
            int count = 6580000;
            for (int i = 0; i < count; i++)
            {
                wr.append(rand.nextInt(998) + 1 + ",");
            }
            wr.append(999 + "");
            wr.flush();
            wr.close();
            long FinalTime = System.currentTimeMillis();
            System.out.println("The File.txt has been successfully generated with the size of " + file.length() / 1000 +
                    " KB and " + count + " integer numbers and took " + (FinalTime - FirstTime) + " miliseconds.");

        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
