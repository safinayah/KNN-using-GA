/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn.ga;

import java.util.Random;

/**
 *
 * @author ayah
 */
public class Individual {
    
    
    
    int fitness = 0;
    byte[] genes = new byte[5];
    int geneLength = 5;

    public Individual() {
     
        //Set genes randomly for each individual
        for (int i = 0; i < genes.length; i++) {
            byte gene = (byte) Math.round(Math.random());
            genes[i] = gene;
        }

        fitness = 0;
    }



    
}
