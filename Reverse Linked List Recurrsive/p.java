    class p{
        Node head;
    
        public class Node{
            String data; 
            Node next;
    
            Node(String data){
                this.data = data; 
                this.next = null; 
            }
        }

        public Node recurssivereverse(Node head){
            if(head==null || head.next==null){
                return head; 
            }
            Node newHead = recurssivereverse(head.next);
            head.next.next=head;
            head.next=null; 

            return newHead; 
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
            p list = new p(); 
            list.addfirst("1");
            list.addfirst("2");
            list.addfirst("3");
            list.addfirst("4");
            list.addfirst("5");
            list.printList();
    
            list.head = list.recurssivereverse(list.head);
            list.printList();
        }
    }


