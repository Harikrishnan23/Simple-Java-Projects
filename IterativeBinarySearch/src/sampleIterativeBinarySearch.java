//Java program for implementation of iterative version of Binary Search
//If the search element is present in the array then the index of the search element is returned
//If the search element is not present then error message is returned.



public class sampleIterativeBinarySearch {

    public static int iterativeBS(int arr[], int x){
        int li = 0, ri = arr.length -1 ;
        while (li <=  ri){
            int midIndex = li + (ri - li) / 2;

            if (arr[midIndex] == x)
                return midIndex;

            if (arr[midIndex] > x)
                li = midIndex - 1;

            if (arr[midIndex] < x)
                li = midIndex + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        sampleIterativeBinarySearch sibs = new sampleIterativeBinarySearch();
        int arr[] = {1,2,3,4,5,6,7};
        int x = 10;
        int arrLength = arr.length;
        int searchResult = sibs.iterativeBS(arr,x);
        if(searchResult == -1)
            System.out.println("Search element is not present in the array");
        else
            System.out.println("Search element is present in the array at index position " +searchResult);
    }
}
