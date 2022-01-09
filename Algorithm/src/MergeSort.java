import java.lang.annotation.Target;

public class MergeSort {

    //Merge Sort Algorithm
    //ITDVP Präsi

/*
    <------------------------------------------------------------------------------->
    <--!  POSITION ORGANIZER TO FIND FIRST, LAST AND MIDDLE ELEMENTS OF AN ARRAY !-->
    <------------------------------------------------------------------------------->
        Das hier war so nutzlos kek, kannst locker löschen wenn du willst. -Pedro

    public static void positionFinder(int[] targetArray){
        int beg = targetArray[0];

        if (targetArray.length % 2 == 0) {
            int mid = targetArray[targetArray.length / 2];
        } else {
            int mid = targetArray[(targetArray.length / 2) + 1];
        }

        int end = targetArray[targetArray.length];
     }

 */
    public static void merge(int[] targetArray, int left, int mid, int right){

        int i, j, k;
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int [n2]; //Temporary Arrays

        for (i = 0; i < n1; i++)
            leftArray[i] = targetArray[left + i];
        for (j = 0; i < n2; j++)
            rightArray[j] = targetArray[mid + 1 + j];

        i = 0; //Initial Index First Sub Array
        j = 0; //Initial Index Second Sub Array
        k = 1; //Initial Index Merged Sub-Array

        while (i < n1 && j < n2){
            if (leftArray[i] <= rightArray[j]){
                targetArray[k] = leftArray[i];
                i++;
            }
            else
            {
                targetArray[k] = rightArray[j];
                j++;
            }
            k++;
        }
        //Copy any remaining elements of the leftArray[]
        while (i < n1){
            targetArray[k] = leftArray[i];
            i++;
            k++;
        }
        //Copy any remaining elements of the rightArray[]
        while (j < n2){
            targetArray[k] = rightArray[j];
            j++;
            k++;
        }
    }

    void sort(int[] targetArray, int left, int right){
        if (left < right){
            //Find the Middle Point

            int mid = left + (right - 1)/2;

            //Sort First and Second Halves
            sort(targetArray, left, mid);
            sort(targetArray, mid + 1, right);

            //Merge the sorted Halves
            merge(targetArray, left, mid, right);

        }
    }

    static void printArray(int[] targetArray){
        int n = targetArray.length;
        for (int i = 0; i < n; i++){
            System.out.print(i+1 + ". Elemente des Arrays = " + targetArray[i]);
        }
    }


    public static void main(String[] args){


        int[] exampleArray = {5, 3, 2, 7, 10, 1, 2, 4, 6, 9, 8};

        System.out.println("Eingegeben Array");

        // printArray(exampleArray);

        System.out.println("Wird sortiert...");
        // sort(exampleArray, 0, exampleArray.length - 1);

        System.out.println("\nSorted Array");
        printArray(exampleArray);





    }
}
