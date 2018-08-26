/**
 * Algorithms. Home Work 6.
 *
 * @author Albert Khayrutdinov
 * @version dated Aug 26, 2018
 * @link https://github.com/bertranus/Algorithms
 */
package tree;

public class HomeWork6 {
    private int COUNT = 720;// факториал 6 = 720
    private int TREES_COUNT = 20;
    private Tree[] myTrees = new Tree[COUNT];

    public static void main(String[] args) {
        HomeWork6 hw6 = new HomeWork6();
        for (int i = 0; i < hw6.TREES_COUNT; i++) {
            hw6.myTrees[i] = hw6.createTree();
            hw6.myTrees[i].getRoot().display();
        }
        hw6.randomSearch(hw6.myTrees[(int)(Math.random() * hw6.TREES_COUNT)]);
        System.out.println("Showing tree...");
        //hw6.show();
        //hw6.balanceAnalyze(); не доделан

    }

    private void balanceAnalyze() {
        for (Tree tr: this.myTrees) {
            int leftCount = 0;
            int rightCount = 0;
                if (tr.getRoot() != null) {
                    Node temp = tr.getRoot();

                    while(temp.leftChild != null){
                        temp = temp.leftChild;
                        // получить ид крайнего левого
                    }
                    int tt = temp.getId();
                    if (tt < tr.getRoot().getId()) {
                        leftCount++;
                    } else {
                        rightCount++;
                    }



                }



        }
    }

    private  Tree createTree(){
        Tree tree = new Tree();
        for (int i = 0; i < this.COUNT ; i++) {
            String name = "" + (char)(65 + (int)(Math.random() * 25));
            for (int j = 1; j < 3 + (int)(Math.random() * 6); j++) {
                name = name + (char)(97 + (int)(Math.random() * 25));
            }
            int id = (int)(Math.random() * 200 - 100);
            int age = (int)(Math.random() * 80);
            tree.insert(new Person(name, id, age));
        }
        return tree;
    }

    private void randomSearch(Tree tree){
        while (true) {
            int key = (int)(Math.random() * 200 - 100);
            System.out.println("Searched value: " + key);
            if (tree.find(key) != null) {
                tree.find(key).display();
                break;
            }
        }
    }

    public void show(){
        for (int i = 0; i < this.TREES_COUNT; i++) {
            this.myTrees[i].order(this.myTrees[i].getRoot());
        }
    }


}
