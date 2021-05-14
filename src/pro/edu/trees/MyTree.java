package pro.edu.trees;
/*
  @author   george
  @project   exercises
  @class  MyTree
  @version  1.0.0 
  @since 17.03.2021 - 16.40
*/

public class MyTree {
    private Node root;

    public MyTree(Node root) {
        this.root = root;
    }

    public MyTree() {
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    /**
     * Поиск элемента в дереве по ключу
     *
     * @param key
     * @return
     */
    public Node find(int key) {
        Node current = root;
        while (current.key != key) {
            if (current.key < key) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    /**
     * Вставка в дерево. Суть таже что и поиск
     * Только вместо вывода элемента к нему левым или правым потомком
     * добавляем новый элемент
     *
     * @param key
     * @param data
     */
    public void insert(int key, String data) {
        Node node = new Node(key, data);

        if (root == null) {
            root = node;
        } else {
            Node current = root;
            Node prev = null;
            while (true) {
                prev = current;
                //----------------------------
                if (key < prev.key) {
                    if (current.leftChild == null) {
                        current.leftChild = node;
                        return;
                    } else current = current.leftChild;
                }

                //-----------------------------------
                if (key >= prev.key) {
                    if (current.rightChild == null) {
                        current.rightChild = node;
                        return;
                    } else current = current.rightChild;
                }
            }
        }
    }

    /**
     * Вывод всех элементов дерева методом асиметричного обхода
     *
     * @param startNode
     */
    public void print(Node startNode) {
        if (startNode != null) {//условие сработает, когда мы достигним конца дерева и потомков не останется
            startNode.printNode();//вызов метода принт
            print(startNode.leftChild);//рекурсивно вызываем левых потомков
            print(startNode.rightChild);//вызов правых
        }
    }

    public int depth(Node startNode) {
        if (startNode == null) {
            return 0;
        }
        int leftDepth = depth(startNode.leftChild);
        int rightDepth = depth(startNode.rightChild);
        return (leftDepth > rightDepth) ? leftDepth + 1 : rightDepth + 1;
    }

    public Node buildTreeFromSortedArray(int[] array){

        return buildTreeFromSubArray(array, 0, array.length - 1);
    }
    private Node buildTreeFromSubArray(int[] array, int start, int finish){
        if (start > finish) return null;
        int mid = (start + finish)/2;
        Node root = new Node(array[mid], "");
        root.leftChild = buildTreeFromSubArray(array, start, mid - 1 );
        root.rightChild = buildTreeFromSubArray(array, mid + 1, finish );
        return root;
    }

}
