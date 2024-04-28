class P{
    Node head;

    public class Node{
        String data; 
        Node next;

        Node(String data){
            this.data = data; 
            this.next = null; 
        }
    }

    public void reverseiteration(){
        if(head == null || head.next==null){
            return; 
        }

        Node prevNode=head; 
        Node currNode=head.next; 
        while (currNode!=null) {
            Node nextNode = currNode.next; 
            currNode.next= prevNode; 

            // update

            prevNode=currNode; 
            currNode = nextNode;  
        }
        head.next=null; 
        head=prevNode; 
    }

    public void printList(){
        Node currNode = head; 
        while (currNode!=null) {
            System.out.print(currNode.data + "--->");
            currNode = currNode.next; 
        }
        System.out.println("null");
    }

    public void addfirst(String data){
        Node newNode = new Node(data); 
        newNode.next = head; 
        head = newNode;
    }
    public static void main(String[] args) {
        P list = new P(); 
        list.addfirst("1");
        list.addfirst("2");
        list.addfirst("3");
        list.addfirst("4");
        list.addfirst("5");
        list.printList();

        list.reverseiteration();
        list.printList();
    }
}