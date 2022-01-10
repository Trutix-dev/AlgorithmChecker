import java.util.ArrayList;

public class MergeSort implements SortAlgorithm{

    private int[] mergesort(int[] inputArray) {
    	
    	if(inputArray.length <= 1) return inputArray;
    	
    	int firstHalfIndex = inputArray.length / 2;
    	
    	int[] left = new int[firstHalfIndex];
    	int[] right = new int[inputArray.length - firstHalfIndex];
    	
    	for(int i = 0; i < inputArray.length; i++) {
    		if(i < firstHalfIndex) {
    			left[i] = inputArray[i];
    		}
    		else {
    			right[i - firstHalfIndex] = inputArray[i];
    		}
    	}
    	
    	left = mergesort(left);
    	right = mergesort(right);
    	
    	return merge(left, right);
    	
    }
    
    private int[] merge(int[] left, int[] right) {
    	
    	ArrayList<Integer> out = new ArrayList<Integer>();
    	
    	int offsetLeft = 0, offsetRight = 0;
    	
    	while(offsetLeft < left.length && offsetRight < right.length) {
    		
    		if(left[offsetLeft] <= right[offsetRight]) {
    			out.add(left[offsetLeft]);
    			offsetLeft++;
    		}
    		else {
    			out.add(right[offsetRight]);
    			offsetRight++;
    		}
    		
    	}
    	
    	while(offsetLeft < left.length) {
    		out.add(left[offsetLeft]);
    		offsetLeft++;
    	}
    	
    	while(offsetRight < right.length) {
    		out.add(right[offsetRight]);
    		offsetRight++;
    	}
    	
    	// java does not want to convert Object[] to int[] or even Integer[] to int[] so we need to remap here (thanks stackoverflow)
    	return out.stream().mapToInt(i->i).toArray();
    	
    }
    
    public int[] sort(int[] inputArray) {
    	return mergesort(inputArray);
    }
    
    public AlgorithmType getType() {
    	return AlgorithmType.MERGESORT;
    }
    
}
