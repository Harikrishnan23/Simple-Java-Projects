public class sampleBubbleSort {

    public void bubbleSort(int arr[]){
        int arrLength = arr.length;
        for (int i = 0; i < arrLength - 1; i++ )
            for (int j = 0; j < arrLength-i-1; j++)
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    void printArray(int arr[]){
        int arrLength = arr.length;
        for (int i = 0; i<arrLength; i++)
            System.out.println(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        sampleBubbleSort sbs = new sampleBubbleSort();
        int arr[] = {6,2,7,3,8};
        sbs.bubbleSort(arr);
        System.out.println("The Sorted Array is");
        sbs.printArray(arr);
    }
}
