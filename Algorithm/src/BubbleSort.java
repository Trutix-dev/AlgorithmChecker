public class BubbleSort implements SortAlgorithm{

    private int[] bubbleSort(int[] targetArray){
        int n = targetArray.length;
        int temp = 0;
        
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(targetArray[j-1] > targetArray[j]){
                    //swap elements
                    temp = targetArray[j-1];
                    targetArray[j-1] = targetArray[j];
                    targetArray[j] = temp;
                }

            }
        }
        
        return targetArray;

    }
    
    public int[] sort(int[] inputArray) {
    	return bubbleSort(inputArray);
    }
    
    public AlgorithmType getType() {
    	return AlgorithmType.BUBBLESORT;
    }
    
}
