public class CircularList {
    private class node
    {
        int data;
        node next;
        node(int value) {data=value;}
    }
    private node head,tail;
    private int size;
    public boolean is_empty() {return head == null;}
    public void addFirst(int value)
    {
        node newNode = new node(value);
        if (is_empty()) head = tail = newNode;
        else
        {
            newNode.next = head;
            head = newNode;
        }
        tail.next = head;
        size++;
    }
    public void addLast(int value)
    {
        node newNode = new node(value);
        if (is_empty()) head = tail = newNode;
        else
        {
            tail.next = newNode;
            tail=newNode;
        }
        tail.next=head;
        size++;
    }
    public void addAt(int value,int index)
    {
        node newNode = new node(value);
        if (index == 0) addFirst(value);
        if (index == size) addLast(value);
        else
        {
            node current = head;
            while(current != tail){
                if(index == 1){
                    newNode.next = current.next;
                    current.next = newNode;
                }
                current = current.next;
                index--;
            }
        }
        size++;
    }
    public void delete_first()
    {
        if (is_empty()) System.out.println("List already empty");
        else
        {
            head=head.next;
            tail.next=head;
        }
        size--;
    }
    public void delete_last(){
        if (is_empty()) System.out.println("List already empty");
        else
        {
            node current = head;
            while (current.next!=tail) current = current.next;
            current.next = head;
            tail = current;
        }
        size--;
    }
    public void delete_in(int index)
    {
        if (is_empty()) System.out.println("List already empty");
        else if (index==0) {delete_first();}
        else
        {
            node current=head;
            while (current.next!=head) {
                if (index==1) {current.next = current.next.next;}
                current = current.next;
                index--;
            }
        }
    }
}
