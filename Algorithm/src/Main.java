import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        GUI GUIInstancing = new GUI();
        BubbleSort BubbleInstance = new BubbleSort();
        MergeSort MergeInstance = new MergeSort();
        Scanner sc = new Scanner(System.in);

        GUIInstancing.GUIStart();

        //Array Eingeben

        System.out.println("Wie vielen Elemente soll der Array haben?");

        int nrOfElements = sc.nextInt();

        int[] targetArray = {};

        int[] newTargetArray = new int[nrOfElements + 1];


        int addedElements = 0;

        while(addedElements < nrOfElements) {

            System.out.println("Element für Array eingeben: ");
            int nextAddableInt = sc.nextInt();

            for (int i = 0, j = 0; i < nrOfElements; i++, j++) {
                if (i == 0 && targetArray[0] > nextAddableInt) {
                    j++;
                    newTargetArray[j] = nextAddableInt;
                }
                newTargetArray[j] = targetArray[i];
                if ((i == targetArray.length - 1 && targetArray[i] < nextAddableInt)
                        || (targetArray[i] < nextAddableInt && targetArray[i + 1] > nextAddableInt)) {
                    j++;
                    newTargetArray[j] = nextAddableInt;
                }

            }
        }

        //Print array methode hier...


        //Dieser klasse war ein fucking witz lmaooo, GUI ist nicht mein freund :(


    }
}
