//Java Program for searching an element x in an array
//if element is present return its index
//if it is not present return -1

    class sampleLinearSearchImp {
    public static int linearSearch(int arr[], int x){
        int arrLength = arr.length;
        for(int i=0; i<arrLength;i++)
        {
            if (arr[i] == x)
                return i;

        }
            return -1;




    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int x = 8;

        int searchResult = linearSearch(arr, x);
        if (searchResult == -1)
            System.out.println("The search element is not present in the array");
        else
            System.out.println("The search element is present at index " +searchResult);

    }
}