/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn.ga;

import knn.entities.Population;
import knn.entities.Individual;
import java.util.Random;

/**
 *
 * @author ayah
 */
public class GeneticAlgorithm {

    Population population = new Population();
    
    
    /*this method selects two individuals that have the the index of the generated random numbers*/
    public void randomSelection(Population population) {

        int rn1 = (int) (Math.random() * population.getNoOfElements());//will represent first individual that will be randomly choosen 
        int rn2 = (int) (Math.random() * population.getNoOfElements());//will represent sec individual that will be randomly choosen 
        byte[] first = population.getIndividual()[rn1];
        byte[] sec = population.getIndividual()[rn2];

    }

    /*this method call will crossover the idividuals 
    *by swaping values on the crossover edge using a temp variable
    */
    public void crossover(Individual firstParent, Individual secondParent) {
        Random rn = new Random();

        //Select a random crossover point
        int crossOverPoint = (int) (Math.random()*firstParent.getGeneLength());

        //Swap values among parents
        for (int i = 0; i < crossOverPoint; i++) {
            byte temp = firstParent.getGenes()[i];
            firstParent.getGenes()[i] = secondParent.getGenes()[i];
            secondParent.getGenes()[i] = temp;

        }

    }
    
    
    /*this will mutate individuals randomly 
    *by changing the the gene located in the random number index
    *and flip it to zero when its one and to one when its zero  
    */
    public void Mutation(Individual firstParent, Individual secondParent) {

        int randomNumber = (int) (Math.random() * firstParent.getGeneLength());
        if (firstParent.getGenes()[randomNumber] == 0) {
            firstParent.getGenes()[randomNumber] = 1;
        } else if (firstParent.getGenes()[randomNumber] == 1) {
            firstParent.getGenes()[randomNumber] = 0;
        }

        if (secondParent.getGenes()[randomNumber] == 0) {
            secondParent.getGenes()[randomNumber] = 1;
        } else if (secondParent.getGenes()[randomNumber] == 1) {
            secondParent.getGenes()[randomNumber] = 0;
        }

    }
    
    /*when this method called it will take the
      *individuals and replace them randomly 
    */
    public Population replacement(Individual indOne, Individual indTwo, Population pop) {

        int rnOne = (int) (Math.random() * pop.getNoOfElements());//random number to represent the array index 
        int rnTwo = (int) (Math.random() * pop.getNoOfElements());
        if (rnOne != rnTwo) {
            pop.getIndividual()[rnTwo] = indOne.getGenes();
        }
        if (rnOne == rnTwo) {
            rnTwo = (int) (Math.random() * pop.getNoOfElements());
            pop.getIndividual()[rnOne] = indOne.getGenes();
            pop.getIndividual()[rnTwo] = indTwo.getGenes();
        }
        return population;//the new population with new individuals 
    }

}