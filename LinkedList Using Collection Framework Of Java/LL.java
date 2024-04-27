import java.util.*;
class LL{
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>(); 
        list.addFirst("Aditya");
        list.addLast("Kumar");
        list.addLast("Sinha");
        list.add("Adi");
        list.add("Bro"); 
        list.add(3, "Bhai Hai Apna"); 
        list.removeFirst();
        list.removeLast(); 
        list.remove(3);
        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println(list);
    }
}