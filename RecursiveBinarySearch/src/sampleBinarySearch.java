//Java program for implementation of recursive binary search
//If the search element is present in the array return its index
//if it is not present then return -1

import java.lang.reflect.Array;

public class sampleBinarySearch {
    public static int binarySearch(int arr[], int li, int ri, int x){
        if(ri >= li){
            int midIndex = li + (ri - li) / 2;

            if(arr[midIndex] == x)
                return midIndex;

            if (arr[midIndex] > x)
                return binarySearch(arr, li, midIndex - 1, x);

            if (arr[midIndex] < x)
                return binarySearch(arr,midIndex + 1, ri, x);
        }
        return -1;

    }

    public static void main(String[] args) {

        sampleBinarySearch sbo = new sampleBinarySearch();
        int arr[] = {1,2,3,4,5,6,7};
        int arrLength = arr.length;
        int x = 10;
        int searchResult = sbo.binarySearch(arr, 0, arrLength - 1, x);
        if (searchResult == -1)
            System.out.println("Search element is not present in the array");
        else
            System.out.println("Search element is present in the array at index " +searchResult );
    }
}
