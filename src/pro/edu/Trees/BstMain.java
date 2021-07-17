package pro.edu.Trees;/*
  @author   george
  @project   exercises
  @class  Main
  @version  1.0.0 
  @since 20.06.21 - 12.35
*/

public class BstMain {


    public static void main(String[] args) {

        BST tree = new BST();
        // вставляем узлы в дерево:
        tree.insertNode(6);
        tree.insertNode(8);
        tree.insertNode(5);
        tree.insertNode(8);
        tree.insertNode(2);
        tree.insertNode(9);
        tree.insertNode(7);
        tree.insertNode(4);
        tree.insertNode(10);
        tree.insertNode(3);
        tree.insertNode(1);
        // отображение дерева:
        tree.printTree();

        Node two = tree.findNodeByValue(2);
        System.out.println(tree.getAmountOfChilds(two));


    }
}
