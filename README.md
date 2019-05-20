# KNN-using-GA
<H1>Main Idea</h1>
 <p>This project will use GA to select features for K-NN and calculate accuracy for the provided datasets</p><br> 
<h2>Steps</h2>
    <ol> 
        <li>count number of lines in files</li>
        <li>insert file's data to 2D array,then population is generated</li>
        <li>count gene's length and number of ones in each gene(represent selected features), and take care that the item in the                        last index is the label</li>
        <li>pass label, number of selected features, gene length, to fitness function</li>
        <li>calculate fitness that represents the accuracy</li> 
        <li>run code 10 times and take the average of all results</li>
        <li>repeate these steps to the other two files</li>
    </ol>
        
    
    


<h2>Fitness function </h2>
<ul> 
    <li>label or Yr(D) : represents the classification of accuracy of the KNN classifier </li>
    <li>|total number of ones| or |R| = number of selected features that equals to number of ones in the vector came from GA</li>
    <li>|total| or |C| total number of features in hte dataset that equals no of file's lines</li>
    <li>alpha and beta are important parameters to the importance of classification quality and subset lenght</li>
    <li>alpha is any number between zero and one</li>
    <li>beta equals 1-alpha</li>
    <li>equation :  fitness = aYr(D)+B (1- |R|/|C|)</li>
 </ul>
 
