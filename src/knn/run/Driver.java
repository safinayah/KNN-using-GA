/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn.run;

import java.util.Arrays;
import knn.algorithm.Algorithm;
import knn.entities.Population;
import knn.ga.GeneticAlgorithm;
import knn.entities.Individual;

/**
 *
 * @author ayah
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Population pop = new Population(10, 10);
        GeneticAlgorithm ga = new GeneticAlgorithm();
        Individual parentOne = new Individual();
        Individual parentTwo = new Individual();
      
        
        for (int i=0; i<pop.getPopulationSize();i++){
            for(int j =0 ;j<pop.getNoOfElements();j++){
               ga.randomSelection(pop);
               parentOne.setGenes(pop.getIndividual()[i]);
               parentTwo.setGenes(pop.getIndividual()[j]);
               ga.crossover(parentTwo, parentTwo);
               ga.Mutation(parentTwo, parentTwo);
               ga.replacement(parentOne, parentTwo, pop);
            }
               
        }
     
       
    }
    
}
