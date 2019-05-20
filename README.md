# KNN-using-GA
<H1>Main Idea</h1>
 <p>This project contains three datasets files that should be represented as a population for GA</p><br> 
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
    <p>label or Yr(D) : represents the classification of accuracy of the KNN classifier <br>
    |total| or |R| = number of selected features that equals to number of ones in the vector came from GA<br>
    total| or |C| total number of features in hte dataset that equals no of file's lines<br>
    alpha and beta are important parameters to the importance of classification quality and subset lenght<br>
    alpha is any number between zero and one<br>
    beta equals 1-alpha<br>
    equation :  fitness = aYr(D)+B (1- |R|/|C|)</p><br>
