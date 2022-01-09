public class InsertionSort {
    public static void Insertion(int[] targetArray){

        for (int i = 0; i < targetArray.length; i++){

            int currentElement = targetArray[i];
            int x = i -1;

            while (x >= 0 && currentElement < targetArray[i]){
                targetArray[x+1] = targetArray[x];
                x--;
            }

            targetArray[x + 1] = currentElement;
        }

    }
    static void printArray(int[] targetArray){
        int n = targetArray.length;
        for (int i = 0; i < n; i++){
            System.out.print(i+1 + ". Elemente des Arrays = " + targetArray[i]);
        }
    }

    public void sortByInsertion(int[] targetArray){

        //Array muss aus Input kommen. Instance der GUI klasse und Variable hier überbringen?

        System.out.println("Elements in the array before sorting: ");
        for (int x:targetArray){
            System.out.println(x);
        }

        System.out.println(); //Line breaker
        System.out.println("Array wird sortiert...");
        System.out.println(); //Line breaker

        Insertion(targetArray);

        System.out.println("Array nach sortierung: ");

        printArray(targetArray);
    }
}
