/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn.algorithm;

import java.util.List;
import knn.entities.Features;
import java.util.*;
import knn.entities.SortByDistance;

/**
 *
 * @author ayah
 */
public class Algorithm {

    int totalDistance = 0;
    List<Features> feature;

    public void calculateAccuracy(double [][] data, double[][] test, double[][] train) {

        //fills data
        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data.length; j++) {
                data[i][j] = Math.round(Math.random() * 10);
            }

        }
        //fills train
        for (int i = 0; i < train.length; i++) {
            train[i] = data[i];
        }

        for (int i = 0; i < test.length; i++) {
            test[i] = data[i];
        }

        //calculate accuracy
        for (int i = 0; i <= train.length; i++) {

            totalDistance += calcualateDistance(test[i], train[i]);

            feature.add(new Features(i, totalDistance));

        }

        Collection.sort(feature, new SortByDistance());

    }

    /*this method call will calculate distance between two points 
    *index in the tesing set
    *and the index in the training set 
    *this equation called Euclidean distance
     */
    public double calcualateDistance(double[] testIndex, double[] trainIndex) {
        double distances = 0;

        for (int i = 0; i < trainIndex.length; i++) {
            distances += Math.pow(Math.abs(testIndex[i] - trainIndex[i]), 2);
        }
        return Math.sqrt(distances);
    }

    public boolean isTrueLabeld(double[] test, double[] firstNearest, double[] secondNeasrest, double[] thirdNearest) {
        int labelOne = (int) firstNearest[firstNearest.length];
        int labelTwo = (int) secondNeasrest[secondNeasrest.length];
        int labelThree = (int) thirdNearest[thirdNearest.length];
        int testLabel = (int) test[test.length];
        int label = 0;

        if ((labelOne == 1 && labelTwo == 1) || (labelOne == 1 && labelThree == 1) || (labelTwo == 1 && labelThree == 1) || (labelOne == 1 && labelTwo == 1 && labelThree == 1)) {
            label = 1;
        } else {
            label = 0;
        }

        if (label == testLabel) {
            return true;
        }

        return false;
    }

}
