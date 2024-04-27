class LL {

    Node head;
    
    public class Node{
        String data; 
        Node next; 

        Node(String data){
            this.data= data; 
            this.next= null; 
        }
    }

    //Creating a function to add first
    public void addfirst(String data){
        Node newNode = new Node(data); 
        newNode.next = head; 
        head = newNode;
    }

    //Creating a function to add to last element
    public void addLast(String data){
        Node newNode = new Node(data); 
        if(head==null){
            head= newNode; 
            return;
        }

        Node lastNode = head;
        while (lastNode.next!=null) {
            lastNode = lastNode.next; 
        }
        lastNode.next = newNode; 
    }

    //creating a function to removefirst()
    public void removefirst(){
        if(head==null){
            return; 
        }

        head = this.head.next; 
    }

    public void removeLast(){
        if(head==null){
            return; 
        }

        if(head.next ==null){
            head = null; 
            return; 
        }
         
        Node currNode = head;
        Node lastNode = head.next; 

        while (lastNode.next!=null) {
            currNode = currNode.next; 
            lastNode = lastNode.next; 
        }
        currNode.next = null; 
    }

    public void printList(){
        Node currNode = head; 
        while (currNode!=null) {
            System.out.print(currNode.data + "--->");
            currNode = currNode.next; 
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL list = new LL(); 

        list.addfirst("Aditya");
        list.addLast("Suryadhwaj");
        list.addLast("king");
        list.removeLast();
        list.removefirst();
        list.printList();
    }
}