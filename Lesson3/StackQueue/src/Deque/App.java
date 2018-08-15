/**
 * Algorithms. Home Work 3.
 *
 * @author Albert Khayrutdinov
 * @version dated Aug 15, 2018
 * @link https://github.com/bertranus/Algorithms
 */

package Deque;

public class App {
    public static void main(String[] args) {
        Deque dq = new Deque(20);


        dq.insertRight(50);
        dq.insertRight(60);
        dq.insertRight(70);
        dq.insertRight(80);
        dq.insertRight(90);
        dq.insertRight(100);

        dq.insertLeft(40);
        dq.insertLeft(30);
        dq.insertLeft(20);
        dq.insertLeft(10);

        System.out.println("After all insertions:");
        dq.getDeque();

        dq.removeRight();
        dq.removeRight();

        System.out.println("After deletions from right:");
        dq.getDeque();

        dq.removeLeft();
        dq.removeLeft();
        dq.removeLeft();

        System.out.println("After deletions from left:");
        dq.getDeque();

        dq.insertRight(110);
        dq.insertLeft(120);

        System.out.println("After last insertions:");
        dq.getDeque();


    }
}
