/**
 * Algorithms. Home Work 3.
 *
 * @author Albert Khayrutdinov
 * @version dated Aug 18, 2018
 * @link https://github.com/bertranus/Algorithms
 */
 package LinkedList;

public class LinkedIteratorApp {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedIterator itr = new LinkedIterator(list);

        itr.insertAfter("Artem", 20);
        itr.insertBefore("Sergey", 10);

        list.display();


        itr.reset();
        //ваши тесты

        System.out.println("Let's begin testing...");
        itr.insertAfter("Ivan", 35);
        itr.insertAfter("Maria", 27);
        itr.reset();
        itr.insertBefore("Nadya", 45);
        list.display();
        System.out.print("Current: ");
        itr.getCurrent().display();
        itr.nextLink();
        System.out.print("Current: ");
        itr.getCurrent().display();
        itr.deleteCurrent();
        System.out.println("After delete Current ");
        list.display();
        System.out.print("Current: ");
        itr.getCurrent().display();
        System.out.println("Is at end? - " + itr.atEnd());
        itr.nextLink();
        itr.nextLink();
        System.out.print("Current: ");
        itr.getCurrent().display();
        System.out.println("Is at end? - " + itr.atEnd());


    }
}
