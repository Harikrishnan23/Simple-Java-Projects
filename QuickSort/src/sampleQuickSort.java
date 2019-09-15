public class sampleQuickSort {

    public int quickSort(int arr[], int lowIndex, int highIndex){
        int pivot = arr[highIndex];
        int i = (lowIndex - 1);
        for (int j = lowIndex; j < highIndex; j++){
            if (arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[highIndex];
        arr[highIndex] = temp;

        return i+1;
    }

    void actualSort(int arr[], int lowIndex, int highIndex){
        if (lowIndex < highIndex){
            int qs = quickSort(arr,lowIndex,highIndex);
            actualSort(arr,lowIndex,qs-1);
            actualSort(arr, qs+1, highIndex);
        }
    }

    public static void printArray(int arr[]){
        int arrayLength = arr.length;
        for (int i = 0; i< arrayLength; i++)
            System.out.println(arr[i]+ " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {4,2,6,1,9,5,10};
        int arrayLength = arr.length;
        sampleQuickSort sqs = new sampleQuickSort();
        sqs.actualSort(arr,0,arrayLength -1);
        System.out.println("The sorted array is");
        printArray(arr);
    }
}
