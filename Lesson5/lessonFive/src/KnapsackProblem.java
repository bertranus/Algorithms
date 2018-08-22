/**
 * Algorithms. Home Work 5.
 *
 * @author Albert Khayrutdinov
 * @version dated Aug 22, 2018
 * @link https://github.com/bertranus/Algorithms
 */
import java.util.*;

public class KnapsackProblem {
    private final int PACK_SIZE = 100;
    private final int THINGS_COUNT = 6;
    Thing[] thing;
    List<Thing[]> tList = new ArrayList<Thing[]>();
    SortedMap<Integer, Thing[]> sMap = new TreeMap<Integer, Thing[]>();


    public static void main(String[] args) {
        KnapsackProblem myPack = new KnapsackProblem();
        for (int i = 0; i < myPack.thing.length  ; i++) {
            System.out.println(myPack.thing[i].toString());
        }
        myPack.getAnagram(myPack.THINGS_COUNT);
        myPack.toMap();
        System.out.println("Maximal summ is: " + myPack.sMap.lastKey());
        for(Thing th: myPack.sMap.get(myPack.sMap.lastKey())) {
            System.out.println(th.toString());
        }
    }

    private void toMap() {
        for(Thing[] th: tList) {
            List<Thing> tmp = new ArrayList<>();
            int sumVal = 0;
            for (int i = 0; i < th.length; i++) {
                if ((sumVal + th[i].getWeight()) <= PACK_SIZE) {
                    sumVal += th[i].getWeight();
                    tmp.add(th[i]);
                }
            }
            Thing[]temp = new Thing[tmp.size()];
            for (int i = 0; i < tmp.size() ; i++) {
                temp[i] = tmp.get(i);
            }
            sMap.put(sumVal,temp);
        }
    }

    public KnapsackProblem() {
        thing = new Thing [THINGS_COUNT];
        for (int i = 0; i < THINGS_COUNT ; i++) {
            thing [i] = new Thing(PACK_SIZE);
        }
    }

    private void getAnagram(int newSize) {
        if (newSize == 1) {
            return;
        }
        for (int i = 0; i < newSize; i++) {
            getAnagram(newSize - 1);
            if (newSize == 2) {
                display();
            }
            rotate(newSize);
        }
    }

    private void rotate(int newSize) {
        int i;
        int pos = THINGS_COUNT - newSize;
        Thing temp = thing[pos];
        for (i = pos + 1; i < THINGS_COUNT; i++) {
            thing[i - 1] = thing[i];
        }
        thing[i - 1] = temp;
    }

    private void display() {
        for (int i = 0; i < THINGS_COUNT; i++) {
            Thing[]tmp = new Thing[thing.length];
            System.arraycopy(thing,0, tmp,0,thing.length);
            tList.add(tmp);
           // System.out.print(thing[i].getValue() + " ");
        }
       // System.out.println();
    }
}
