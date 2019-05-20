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
public class GA {
    
    Population population = new Population(); 
    public void randomSelection(Population population) {

        int rn1 = (int) (Math.random() * population.getNoOfElements());//will represent first individual that will be randomly choosen 
        int rn2 = (int) (Math.random() * population.getNoOfElements());//will represent sec individual that will be randomly choosen 
        byte[] first = population.getIndividual()[rn1];
        byte[] sec = population.getIndividual()[rn2];

    }
    
        //Crossover
    void crossover(Individual firstParent, Individual secondParent) {
        Random rn = new Random();
        

        //Select a random crossover point
        int crossOverPoint = rn.nextInt(population.individuals[0].geneLength);

        //Swap values among parents
        for (int i = 0; i < crossOverPoint; i++) {
            byte temp = firstParent.genes[i];
            firstParent.genes[i] = secondParent.genes[i];
            secondParent.genes[i] = temp;

        }

    }
    
    
     public void Mutation(Individual firstParent, Individual secondParent) {

        int randomNumber = (int) (Math.random() * firstParent.geneLength);
        if (firstParent.genes[randomNumber] == 0) {
            firstParent.genes[randomNumber] = 1;
        } else if (firstParent.genes[randomNumber] == 1) {
            firstParent.genes[randomNumber] = 0;
        }

        if (secondParent.genes[randomNumber] == 0) {
            secondParent.genes[randomNumber] = 1;
        } else if (secondParent.genes[randomNumber] == 1) {
            secondParent.genes[randomNumber] = 0;
        }

    }

 
    
       public Population replacement(Individual indOne, Individual indTwo, Population pop) {
        Individual indiv = new Individual();
             int rnOne = (int) (Math.random() * pop.getNoOfElements());
        int rnTwo = (int) (Math.random() * pop.getNoOfElements());
        if (rnOne != rnTwo) {
            pop.getIndividual()[rnTwo] = indOne.genes;
        }
        if (rnOne == rnTwo) {
            rnTwo = (int) (Math.random() * pop.getNoOfElements());
            pop.getIndividual()[rnOne] = indOne.genes;
            pop.getIndividual()[rnTwo] = indTwo.genes;
        }
        return population;
    }


}
