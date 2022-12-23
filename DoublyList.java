public class DoublyList {
    private class Node{
        int data;
        Node next,prev;
        Node(int value){data = value;}
    }
    private Node head,tail;
    private int size;
    public void addFirst(int value){
        Node newNode = new Node(value);
        if(head == null) head = tail = newNode;
        else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    public void addLast(int value){
        Node newNode = new Node(value);
        if (head == null) head = tail = newNode;
        else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void addAt(int value,int index){
        Node newNode = new Node(value);
        if (index==0) addFirst(value);
        else if(index == size) addLast(value);
        else {
            Node current = head;
            while (current.next != null){
                if(index == 1){
                    newNode.prev = current;
                    newNode.next = current.next;
                    current.next.prev = newNode;
                    current.next = newNode;
                    break;
                }
                current = current.next;
                index--;
            }
        }
        size++;
    }
    public void deleteFirst(){
        if (head==null) System.out.println("its already empty");
        else if (head.next == null) head = tail = null;
        else
        {
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    public void deleteLast(){
        if(head==null) System.out.println("its already empty");
        else if(head.next==null) head = tail = null;
        else
        {
            tail.prev.next = null;
        }
        size--;
    }
    public void deleteAt(int index){
        if(index == 0) deleteFirst();
        else
        {
            Node current = head;
            while (current.next != null)
            {
                if(index == 1)
                {
                    current = current.next;
                    current.next = current.next.next;
                    break;
                }
                current = current.next;
                index--;
            }
        }
        size--;
    }
}
