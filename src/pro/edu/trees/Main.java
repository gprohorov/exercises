package pro.edu.trees;
/*
  @author   george
  @project   exercises
  @class  Main
  @version  1.0.0 
  @since 18.03.2021 - 14.57
*/

import sun.reflect.generics.tree.Tree;

public class Main {

    public static void main(String[] args) {
        MyTree tree = new MyTree();
        //   tree.insert(0,"Beatles");
        tree.insert(3, "John");
        tree.insert(8, "Paul");
        tree.insert(1, "Ringo");
        tree.insert(2, "George");
        tree.insert(0, "Freddie");
        tree.insert(6, "Brian");
        //  tree.insert(4,"Mik");

        tree.print(tree.find(3));
        System.out.println(tree.depth(tree.find(3)));

        int[] array = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};
        tree.print(tree.buildTreeFromSortedArray(array));

    }
}
