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
    
    
    /*this will mutate individuals randomly 
    *by changing the the gene located in the random number index
    *and flip it to zero when its one and to one when its zero  
    */
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
    
    /*when this method called it will take the
      *individuals and replace them randomly 
    */
    public Population replacement(Individual indOne, Individual indTwo, Population pop) {

        int rnOne = (int) (Math.random() * pop.getNoOfElements());//random number to represent the array index 
        int rnTwo = (int) (Math.random() * pop.getNoOfElements());
        if (rnOne != rnTwo) {
            pop.getIndividual()[rnTwo] = indOne.genes;
        }
        if (rnOne == rnTwo) {
            rnTwo = (int) (Math.random() * pop.getNoOfElements());
            pop.getIndividual()[rnOne] = indOne.genes;
            pop.getIndividual()[rnTwo] = indTwo.genes;
        }
        return population;//the new population with new individuals 
    }

}