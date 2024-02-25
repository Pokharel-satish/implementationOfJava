class sortingAlgorithm {  // main class

    public static void bubbleSort(int[] arr) { // method bubblesort 
        int n = arr.length;   // array length declaration
        boolean swapped;      // either true or false 
        
        do {
            swapped = false;   // case 1 
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) { // compare index 
                    int temp = arr[i - 1];// swapping using third variable
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true; //case 2
                }
            }
        } while (swapped); // exit controlling 
    }    
//
 public static void selectionSort(int[] arr) {  // selectionsort method 
    int n = arr.length;     // array length declaration
    
    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;   // return index of minimum element 
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        int temp = arr[i];  // swapping using third variable 
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
  }
//
public static void insertionSort(int[] arr) { // method insertionsort
    int n = arr.length; // array size 
    
    for (int i = 1; i < n; i++) {
        int value = arr[i]; // temporary variable 
        int j = i - 1;
        
        while (j >= 0 && arr[j] > value) {  // logical AND implemented 
            arr[j + 1] = arr[j];
            j--;   // decremented after sorting 
        }
        
        arr[j + 1] = value; // places value in its position 
    }
}
}