public class LL {
    private Node tail;
    private Node head;
    private int size;
    public LL(){
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node =new Node(value);
        node.next = head;
        head = node;

        //System.out.println(head.value);

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size +=1;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }
        Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
    public static void main(String[] args) {

    }
}
