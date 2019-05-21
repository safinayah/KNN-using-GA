package knn.algorithm;

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
    * alpha is any number between zero and one but in this project will be 0.9
    * beta equals 1-alpha but in this project will be 0.1
    * equation :  fitness = aYr(D)+B (1- |R|/|C|)
     */
    
    
    public static double ALPHA = 0.9; 
    public static double BETA = 0.1; 
    
    public double calulateAccuracy(int accuracy, int total, int selectedFeatures) {

      
        double fittness = ALPHA*accuracy + BETA * (1 - Math.abs(selectedFeatures) / Math.abs(total));

        return fittness;
    }

}
