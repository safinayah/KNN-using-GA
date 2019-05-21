/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import knn.entities.Features;

/**
 *
 * @author ayah
 */
public class ReadFile {

    Features feature = new Features();

    public void readFile(String fileName) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        File x = new File(fileName);
        
        
        if (x.exists()) {//checks of the file exist

            Scanner input = null;//initilalize input scanner
            try {
                input = new Scanner(x); // Scanning

            } catch (FileNotFoundException ex) {
                System.out.println("noooooo data!!!!!!!!!!!");
            }
            int j = 0;
            while (input.hasNext()) {//checks if the file has nextLine

            }

        }

    }

    public int numOfLines() {//calculates num of file's line
        int num = 0;//initialize num

        File x = new File("data.txt"); //This is used to input the movies text

        if (x.exists()) {//checks of the file exist

            Scanner input = null;//initilalize input scanner
            try {
                input = new Scanner(x);
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }

            while (input.hasNextLine()) {//checks if the file has nextLine
                input.nextLine(); // This is used to get to the next line
                num++;

            }//end of while loop
            input.close();
        }//end of class

        return num;//returns number of file's lines
    }//end of method
}
