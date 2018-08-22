package BinarySearch;

public class SearchApp {
    public static void main(String[] args) {
        MyArr arr = new MyArr(10);
        arr.insert(-10);
        arr.insert(45);
        arr.insert(50);
        arr.insert(60);
        arr.insert(88);
        arr.insert(123);
        arr.insert(201);
        arr.insert(220);
        arr.insert(330);
        arr.insert(331);

        arr.display();
        int seach = 123;
        System.out.println(arr.recBinaryFind(seach, 0, arr.size - 1));
        System.out.println(arr.binaryFind(seach));
    }
}
