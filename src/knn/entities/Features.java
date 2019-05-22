/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn.entities;

/**
 *
 * @author ayah
 */
public class Features {
    private int index; 
    private int distance; 
    
        public Features() {}


    public Features(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Features{" + "index=" + index + ", distance=" + distance + '}';
    }
    
    

    
    
}
