public class sampleSelectionSort {

    public void selectionSort(int arr[]){
        int arrLength = arr.length;
        for (int i =0; i < arrLength - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j< arrLength; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;

             int temp = arr[minIndex];
             arr[minIndex] = arr[i];
             arr[i] = temp;
        }
    }

    void printArray(int arr[]){
        int arrLength = arr.length;
        for (int i = 0; i<arrLength;i++)
            System.out.println(arr[i]+ " ");
        System.out.println();
    }

    public static void main(String[] args) {
        sampleSelectionSort sss = new sampleSelectionSort();
        int arr[] = {5,2,6,1,8,3};
        sss.selectionSort(arr);
        System.out.println("The Sorted Array is");
        sss.printArray(arr);
    }
}
