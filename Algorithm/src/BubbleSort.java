public class BubbleSort {

    public static void main(String[] args)
    {

        int targetArray[] ={860,8,200,9};

        System.out.println("---Array BEFORE Bubble Sort---");

        printArray(targetArray);

        bubbleSort(targetArray);//sorting array elements using bubble sort

        System.out.println("---Array AFTER Bubble Sort---");

        printArray(targetArray);

    }
    static void bubbleSort(int[] targetArray)
    {
        int n = targetArray.length;
        int temp = 0;
        for(int i=0; i < n; i++) // Looping through the array length
        {  System.out.println("Sort Pass Number "+(i+1));
            for(int j=1; j < (n-i); j++)
            {
                System.out.println("Comparing "+ targetArray[j-1]+ " and " + targetArray[j]);
                if(targetArray[j-1] > targetArray[j])
                {

                    //swap elements
                    temp = targetArray[j-1];
                    targetArray[j-1] = targetArray[j];
                    targetArray[j] = temp;
                    System.out.println(targetArray[j]  + " is greater than " + targetArray[j-1]);
                    System.out.println("Swapping Elements: New Array After Swap");
                    printArray(targetArray);
                }

            }
        }

    }

    static void printArray(int[] targetArray){
        int n = targetArray.length;
        for (int i = 0; i < n; i++){
            System.out.print(i+1 + ". Elemente des Arrays = " + targetArray[i]);
        }
    }
}
