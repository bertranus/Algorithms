package BinarySearch;

public class MyArr {
    public int[] arr;
    public int size;

    public MyArr(int size) {
        this.arr = new int[size];
        this.size = 0;
    }

    public void display() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.arr[i]);
        }
    }

    public void insert(int value) {
//        int i;
//        for (i = 0; i < this.size; i++) {
//            if (this.arr[i] > value) break;
//        }
//        for (int j = this.size; j > i; j--) {
//            this.arr[j] = this.arr[j - 1];
//        }
        arr[this.size] = value;
        this.size++;
    }

    public void delete(int value) {
        int i = 0;
        for (i = 0; i < this.size; i++) {
            if (this.arr[i] == value) break;
        }
        for (int j = i; j < this.size - 1; j++) {
            this.arr[j] = this.arr[j + 1];
        }
        this.size--;
    }


    public boolean find(int value) {
        int i;
        for (i = 0; i < this.size; i++) {
            if (this.arr[i] == value) break;
        }
        if (i == this.size) return false;
        else return true;
    }


    protected int recBinaryFind(int value, int low, int high) {
        int mid;
        mid = (low + high) / 2;
        if (arr[mid] == value) return mid;
        else if (low > high) return size;
        else {
            if (arr[mid] < value) return recBinaryFind(value, mid + 1, high);
            else return recBinaryFind(value, low, mid - 1);
        }
    }
    public boolean binaryFind(int value) {
        int low = 0;
        int high = this.size - 1;
        int mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (value == this.arr[mid]) {
                return true;
            } else {
                if (value < this.arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return false;
    }
}
