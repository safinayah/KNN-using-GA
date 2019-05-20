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
public class FitnessFunction {
    
    
    /*this method calculates fittness of the dataset 
    * label or Yr(D) : represents the classification of accuracy of the KNN classifier 
    * |total| or |R| = number of selected features that equals to number of ones in the vector came from GA
    * |total| or |C| total number of features in hte dataset that equals no of file's lines 
    * alpha and beta are important parameters to the importance of classification quality and subset lenght 
    * alpha is any number between zero and one 
    * beta equals 1-alpha 
    * equation :  fitness = aYr(D)+B (1- |R|/|C|)
    */
    
    
    public double calulate(int label , int total, int selectedFeatures){
        
        
        double alpha =Math.random();
        double beta = (1-alpha);
        double fittness = label+ beta*(1-Math.abs(selectedFeatures)/Math.abs(total));
        
        
        
    return fittness;
    
    
    }

  
    
}
