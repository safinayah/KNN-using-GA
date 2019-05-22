/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn.entities;

import java.util.Comparator;

/**
 *
 * @author ayah
 */
public class SortByDistance implements Comparator<Features>{

    @Override
    public int compare(Features o1, Features o2) {
        
         return o1.getDistance() - o2.getDistance(); 
    }
    
}
