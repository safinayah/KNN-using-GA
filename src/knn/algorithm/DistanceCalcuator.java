/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn.algorithm;

/**
 *
 * @author ayah
 */
public class DistanceCalcuator {

    /*this method call will calculate distance between two points 
    *index in the tesing set
    *and the index in the training set 
    *this equation called Euclidean distance
    */
    public int calcualateDistance(int testIndex, int trainIndex) {
        int distance = 0;
        distance += Math.pow((testIndex - trainIndex), 2);

        return distance;
    }

}
