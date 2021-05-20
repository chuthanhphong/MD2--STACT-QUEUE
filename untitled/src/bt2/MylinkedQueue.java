package bt2;

public class MylinkedQueue {
    private Node head;
    private Node tail;

    public MylinkedQueue(Node head, Node tail) {
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key){
        Node temp  = new Node(key);
        if(this.tail == null){
            this.head = this.tail = null;

        }
        this.tail.next = temp;
        this.tail  = temp;
    }}
//    public Node dequeue(){
//        if(this.head==null){
//            return null;
//        }
//
//    }
//}
