public class LinkedList {
    private class Node{
        int data;
        Node next;
        Node(int value){data = value;}
    }
    private Node head,tail;
    public void addFirst(int value){
        Node newNode = new Node(value);
        if(head == null) head = tail = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void addLast(int value){
        Node newNode = new Node(value);
        if(head == null) head = tail = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void addAt(int value,int index){
        Node newNode = new Node(value);
        if(index==0) addFirst(value);
        else {
            Node current = head;
            while (current.next!=null){
                if(index == 1){
                    newNode.next = current.next;
                    current.next = newNode;
                    break;
                }
                current = current.next;
                index--;
            }
        }
    }
    private void delete(){
        if(head==null) System.out.println("its already empty");
        if(head.next==null) head = tail = null;
    }
    public void deleteFirst(){
        if(head==null) System.out.println("its already empty");
        else if (head.next == null) head = tail = null;
        else head = head.next;
    }
    public void deleteLast(){
        if(head==null) System.out.println("its already empty");
        else if(head.next==null) head = tail = null;
        else
        {
            Node current = head;
            while (current.next != tail) current = current.next;
            current.next = null;
        }
    }
    public void deleteAt(int index){
        if(index == 0) deleteFirst();
        else
        {
            Node current = head;
            while (current.next!=null)
            {
                if(index==1)
                {
                    current.next = current.next.next;
                    break;
                }
                current = current.next;
                index--;
            }
        }
    }
