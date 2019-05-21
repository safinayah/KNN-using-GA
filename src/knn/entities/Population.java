/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn.entities;

import knn.entities.Individual;
import java.util.Arrays;

/**
 *
 * @author ayah
 */
public class Population {

    public Individual[] individuals = new Individual[10];
    private int populationSize=10;
    private Individual solution = new Individual();
    private int noOfElements = 10;
    private byte individual[][];

    public Population() {}//empty constructor

    public Population(int populationSize, int noOfElements) {
        individual = new byte[populationSize][noOfElements];
        for (int i = 0; i < populationSize; i++) {
            solution = new Individual();
            individual[i] = solution.getGenes();

        }
        
        
        for (int i = 0; i < individuals.length; i++) {
            individuals[i] = new Individual();
}
    }

    public int size() {
        return individuals.length;
    }

    //generated getters and setters
    public int getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(int populationSize) {
        this.populationSize = populationSize;

    }

   

    public byte[][] getIndividual() {
        return individual;
    }

    public void setIndividual(byte[][] individual) {
        this.individual = individual;
    }

    public Individual getSolution() {
        return solution;
    }

    public void setSolution(Individual solution) {
        this.solution = solution;
    }
    
    
    public int getNoOfElements() {
        return noOfElements;
    }

    public void setNoOfElements(int noOfElements) {
        this.noOfElements = noOfElements;
    }

    @Override
    public String toString() {
        return "Population{" + "individual=" + Arrays.deepToString(individual) + '}';
    }


}
