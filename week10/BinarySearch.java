

public class BinarySearch {
    public static int binarySearchIterative(int[] arr, int target) {

        int low = 0, high = arr.length - 1;
    
        while(low <= high) {
    
            int mid = (low + high) / 2;
    
            if(arr[mid] == target) return mid;
    
            else if(target > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
    
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 12, 15, 21, 33};
        int index = binarySearchIterative(arr, 12);

        System.out.println(index == -1 ? "Not Found" : "Found at index: " + index);


    }
}
