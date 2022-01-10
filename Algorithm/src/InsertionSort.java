public class InsertionSort implements SortAlgorithm{
	
    private int[] Insertion(int[] targetArray){

        for (int i = 0; i < targetArray.length; i++){

            int currentElement = targetArray[i];
            int x = i -1;

            while (x >= 0 && currentElement < targetArray[i]){
                targetArray[x+1] = targetArray[x];
                x--;
            }

            targetArray[x + 1] = currentElement;
        }
        
        return targetArray;

    }
    
    public int[] sort(int[] inputArray) {
    	return Insertion(inputArray);
    }
    
    public AlgorithmType getType() {
    	return AlgorithmType.INSERTIONSORT;
    }

}
