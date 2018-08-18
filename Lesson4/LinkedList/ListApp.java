package LinkedList;

public class ListApp {
    public static void main(String[] args) {
//        System.gc();
        LinkedList list = new LinkedList();
        list.insert("Василий", 21);
        list.insert("Игорь", 23);
        list.insert("Антон", 22);

//        Маша Катя Саша Денис Антон Игорь Василий

        list.display();
        System.out.println();
        if (!list.isEmpty()) list.delete();

        list.display();
    }
}
