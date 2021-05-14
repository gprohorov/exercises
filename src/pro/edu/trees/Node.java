package pro.edu.trees;
/*
  @author   george
  @project   exercises
  @class  Node
  @version  1.0.0 
  @since 17.03.2021 - 16.07
*/

public class Node {
    public int key; //ключ узла
    public String data; //некоторые данные в узле
    public Node leftChild; //левый потомок
    public Node rightChild; //правый потомок

    public Node() {
    }

    public Node(int key, String data) {
        this.key = key;
        this.data = data;
    }

    public Node(int key, String data, Node leftChild, Node rightChild) {
        this.key = key;
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key = " + key + ", data = '" + data
                + '\''   + "  "
                +  "Left " + ((this.leftChild != null) ? this.leftChild.getKey() : " null")
                + "  "
                +  "Right " + ((this.rightChild != null) ? this.rightChild.getKey() : " null")
                + '}';
    }

    public void printNode(){
        System.out.println(this.toString());
    }
}
