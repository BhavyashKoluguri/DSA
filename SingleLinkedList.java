/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		LL list = new LL();
		list.insertFirst(10);
		list.insertFirst(8);
		list.insertFirst(6);
		list.insertFirst(4);
		list.insertFirst(2);
		list.display();
		list.insertLast(12);
		list.display();
		list.insertMiddle(7,3);
		list.display();
		list.deleteFirst();
		list.display();
		list.deleteLast();
		list.display();
		list.deleteMiddle(2);
		list.display();
	}
}


public class LL {
    private Node head;
    private Node tail;
    private int size;
    
    public LL(){
        this.size = 0;
    }
    
    public Node get(int index){
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }
    
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = node;
        }
        size += 1;
    }
    
    public void insertLast(int val){
        if(tail == null){
          insertFirst(val);
          return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size ++;
    }
    
    public void insertMiddle(int val, int pos){
        if(pos == 0){
            insertFirst(val);
            return;
        }
        if(pos == size){
            insertLast(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        for(int i=1; i<pos; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    
    public void deleteFirst(){
        System.out.println("Deleted value is : " + head.val);
        head = head.next;
        if(head == null){
            tail = null;
        }
        size --;
    }
    
    public void deleteLast(){
        if(size <= 1){
            deleteFirst();
            return;
        }
        Node temp = head;
        for(int i=0;i<size;i++){
            temp = temp.next;
        }
        System.out.println("Deleted value is : " + tail.val);
        Node secondLast = get(size-2);
        tail = secondLast;
        tail.next = null;
        size --;
    }
    
    public void deleteMiddle(int pos){
        if(pos == 0){
            deleteFirst();
            return;
        }
        if(pos == size-1) {
            deleteLast();
            return;
        }
        Node middle = get(pos-1);
        System.out.println("Deleted value is : " + middle.next.val);
        middle.next = middle.next.next;
        size--;
        
    }
    
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }
        
    private class Node{
        private int val;
        private Node next;
        
        public Node(int val){
            this.val = val;
        }
        public Node(int value, Node next){
            this.val = val;
            this.next = next;
        }
    }
}