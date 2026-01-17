

class DynamicArray {
    private int[] arr;
    private int count;

    public DynamicArray(int length) {
        arr = new int[length];
    }

    public void insert(int value) {
        // if full, resize
        if (count == arr.length) {
            int[] newarr = new int[count * 2];
            for (int i = 0; i < count; i++)
                newarr[i] = arr[i];
            arr = newarr;
            System.out.println("Array resized to " + arr.length);
        }

        arr[count++] = value;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            System.out.println("Invalid index!");
            return;
        }
        for (int i = index; i < count - 1; i++)
            arr[i] = arr[i + 1];
        count--;
    }

    public int indexOf(int value) {
        for (int i = 0; i < count; i++)
            if (arr[i] == value)
                return i;
        return -1;
    }
}

public class Array {
    public static void main(String[] args) {
        DynamicArray numbers = new DynamicArray(2);
        numbers.insert(5);
        numbers.insert(6);
        numbers.insert(7); 
        numbers.insert(8);
        numbers.print();

        numbers.removeAt(2);
        numbers.print();

        System.out.println("Index of 8: " + numbers.indexOf(8));
    }
}
