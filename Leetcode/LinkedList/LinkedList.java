public class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAtPos(int pos, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        // int count=0;
        // if(pos==0){
        // insertAtStart(data);
        // }
        // else{
        // Node newNode = new Node();
        // newNode=head;
        // while(newNode.next!=null){
        // if(count+1==pos){
        // node.next=newNode.next;
        // newNode.next=node;
        // break;
        // }
        // newNode= newNode.next;
        // count++;
        // }
        // }
        if (pos == 0) {
            insertAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < pos - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }

    }

    public void deleteAtStart(){
        head=head.next;
    }
    public void deleteAtEnd(){
        Node n=head;
        while((n.next).next!=null){
            n=n.next;
        }
        n.next=null;
    }
    public void deleteAtIndex(int index){
        if(index==0){
            deleteAtStart();
        } else{
            Node n=head;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            Node n1= n.next;
            n.next=n1.next;
            n1=null;
        }
    }

    public void show() {
        Node n = head;
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
}