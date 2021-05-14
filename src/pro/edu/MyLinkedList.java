package pro.edu;
/*
  @author   george
  @project   exercises
  @class  MyLinkedList
  @version  1.0.0 
  @since 22.03.2021 - 14.41
*/

public class MyLinkedList<T> {
    private Node<T> head;

    public void addFirst(T t) {
        Node<T> node = new Node<>(t);
        node.next = head;
        head = node;
    }

    public void addFLast(T t) {
        if (head == null) {
            head = new Node<>(t);
            return;
        }
        Node<T> current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node<>(t);

    }
          // СКОРО БУДУ

    public int get(T t) {
        if (head == null) return -1;
        if (head.value == t) return 0;
        int index = 0;
        Node<T> current = head;
        while(current.next != null){

        }
        return -1;
    }


    private static class Node<T> {
        private final T value;
        private Node<T> next;

        private Node(T value) {
            this.value = value;
        }
    }

}
