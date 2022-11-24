import java.util.Iterator;

class LinkedList<T> implements Iterable{

    static private class Node<T>{
        T value;
        Node<T> next;

        Node(T value){
            this.value = value;
            this.next = null;
        }

        Node(T value, Node<T> next){
            this.value = value;
            this.next = next;
        }
    }

    class ListIterator implements Iterator<Node>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Node next() {
            return null;
        }
    }

    Node<T> first;
    Node<T> last;

    public void addFirst(T data){
        if(first == null){
            Node<T> node = new Node<>(data);
            first = node;
            last = node;
        }
        else{
            Node<T> node = new Node<>(data);
            node.next = first;
            first = node;
        }
    }

    public void add(T data){
        if(last == null){
            Node<T> node = new Node<>(data);
            last = node;
            first = node;
        }
        else{
            Node<T> node = new Node<>(data);
            last.next = node;
            last = node;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}

public class Problema_03 {
    public static void main(String[] args){

    }
}
