/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn.algorithm;

import javafx.scene.chart.PieChart;

/**
 *
 * @author ayah
 */
public class Algorithm {

    int testSize = (int) Math.round(10 * 0.2);
    int trainingSize = (int) Math.round(10 * 0.8);
    int[][] data = new int[10][10];
    int[][] test = new int[10][testSize];
    int[][] tarining = new int[10][trainingSize];
    int sum =0;
    double totalSum=0;
    DistanceCalcuator distance = new DistanceCalcuator();

    public void calculateAccuracy() {

        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data.length; j++) {
                data[i][j] = (int) Math.random();
            }

        }

        //fills training array
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < trainingSize; j++) {
                tarining[i][j] = data[i][j];
            }
        }

        //fills test array
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < testSize; j++) {
                test[i][j] = data[i][j];
            }
        }
        
         
    //calculate accuracy
    for(int i=0 ; i<=data.length;i++){
        
        for(int j=0; i<=data.length;j++){
           sum+= distance.calcualateDistance(test[i][j],tarining[i][j] );
        
        }
    
    
    }
    totalSum = Math.sqrt(sum);
    

    }
    
    
   

}
