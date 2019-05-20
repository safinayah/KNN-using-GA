# KNN-using-GA


Fitness function 
    label or Yr(D) : represents the classification of accuracy of the KNN classifier 
    |total| or |R| = number of selected features that equals to number of ones in the vector came from GA
    total| or |C| total number of features in hte dataset that equals no of file's lines 
    alpha and beta are important parameters to the importance of classification quality and subset lenght 
    alpha is any number between zero and one 
    beta equals 1-alpha 
    equation :  fitness = aYr(D)+B (1- |R|/|C|)
