

public class RecursiveSearch {

    public static int linearSearchRec(int[] arr, int target, int index) {

        // base case: index out of range
        if(index == arr.length) {
            return -1;   // not found
        }

        // check current element
        if(arr[index] == target) {
            return index;
        }

        // recursive call for next index
        return linearSearchRec(arr, target, index + 1);
    }

    public static int binarySearchRecursive(int[] arr, int low, int high, int target) {

        if(low > high) return -1;
    
        int mid = (low + high) / 2;
    
        if(arr[mid] == target) return mid;
    
        if(target < arr[mid])
            return binarySearchRecursive(arr, low, mid - 1, target);
    
        return binarySearchRecursive(arr, mid + 1, high, target);
    }

    public static void main(String[] args) {

        // int[] arr = {5, 12, 7, 25, 3};
        // int target = 25;

        // int result = linearSearchRec(arr, target, 0);

        // if(result == -1)
        //     System.out.println("Element not found");
        // else
        //     System.out.println("Found at index: " + result);
    


        int[] arr = {3, 12, 15, 21, 33};
        int index = binarySearchRecursive(arr, 0, arr.length-1, 21);

        System.out.println(index == -1 ? "Not Found" : "Found at index: " + index);

    }
}
