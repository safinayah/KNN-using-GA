/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn.ga;

import java.util.Arrays;

/**
 *
 * @author ayah
 */
public class Population {

    Individual[] individuals;
    private int populationSize;
    private int maxWeight = 90;//enterd by user 
    private Individual solution = new Individual();
    private int capacity = 10;//represents knapsack weight
    private int noOfElements = 10;
    private byte individual[][];

    public Population() {}//empty constructor

    public Population(int populationSize, int noOfElements) {
        individual = new byte[populationSize][noOfElements];
        for (int i = 0; i < populationSize; i++) {
            solution = new Individual();

            individual[i] = solution.genes;

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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
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
