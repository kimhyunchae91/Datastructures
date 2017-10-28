/**
 * Created by Hyun on 7/19/2017.
 */
public class LinkedLists {
//    public Node head;
//
//    void printList(){
//        Node tNode = head;
//        System.out.print("[");
//        while( tNode != null){
//            System.out.print(tNode.data + ", ");
//            tNode = tNode.next;
//        }
//        System.out.println("]");
//    }
//
//    void push(int a){
//        // Allocate a new node and insert the data.
//        Node nn = new Node(a);
//        // Make the new node point to current head.
//        nn.next = head;
//        // Make the head the new node.
//        head = nn;
//    }
//
//    int size(Node h){
//        if( h == null){
//            return 0;
//        }
//
//        int count = 0;
//
//        while( h != null ){
//            count++;
//            h = h.next;
//        }
//        return count;
//    }
//
//    void deleteNode(int key){
//        Node temp = head;
//        Node prev = null;
//
//        if(temp != null && temp.data == key){
//            head = temp.next; // Changed head to the next value in list.
//            return;
//        }
//
//        if( temp == null){
//            return;
//        }
//
//        while( temp != null && temp.data != key){
//            prev = temp;
//            temp = temp.next;
//        }
//        // kept track of prev to link the next value to the next value of temp.
//        prev.next = temp.next;
//    }
//
//    void delNode(int position){
//        if(head == null){
//            return;
//        }
//
//        Node temp = head;
//
//        if(position == 0){
//            head = temp.next;
//            return;
//        }
//
//        for (int i = 0; temp != null && i < position - 1; i++){
//            temp = temp.next;
//        }
//
//        if ( temp == null || temp.next == null){
//            return;
//        }
//
//        Node next = temp.next.next;
//        temp.next = next;
//    }
//
//    Node sortedMerge(Node a, Node b){
//        Node result = null;
//        // base case
//        if (a == null){
//            return b;
//        }
//        if (b == null){
//            return a;
//        }
//
//        // pick either a or b, and recur
//        if (a.data <= b.data){
//            result = a;
//            result.next = sortedMerge(a.next, b);
//        }else{
//            result = b;
//            result.next = sortedMerge(a, b.next);
//        }
//
//        return result;
//    }
//
//    Node mergeSort(Node h){
//        // base case : if head is null
//        if (h == null || h.next == null){
//            return h;
//        }
//
//        // get the middle of the list
//        Node middle = getMiddle(h);
//        Node nextOfMiddle = middle.next;
//
//        // set the next of middle node to null
//        middle.next = null;
//
//        // apply mergeSort on left list
//        Node left = mergeSort(h);
//
//        // apply mergeSort on right list
//        Node right = mergeSort(nextOfMiddle);
//
//        // merge the left and right lists
//        Node sortedList = sortedMerge(left, right);
//
//        return sortedList;
//    }
//
//    Node getMiddle(Node h){
//        //Base case
//        if (h == null)
//            return h;
//        Node fastptr = h.next;
//        Node slowptr = h;
//
//        // Move fastptr by two and slow ptr by one
//        // Finally slowptr will point to middle node
//        while (fastptr != null)
//        {
//            fastptr = fastptr.next;
//            if(fastptr!=null)
//            {
//                slowptr = slowptr.next;
//                fastptr=fastptr.next;
//            }
//        }
//        return slowptr;
//    }
//
//    Node reverse(Node head, int k){
//        Node current = head;
//        Node prev = null;
//        Node next = null;
//
//        int count = 0;
//
//        // reverse first k nodes of linked list
//        while( count < k && current != null){
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//            count++;
//        }
//
//        // next is now a pointer to (k+1)th node recursively call for the list
//        // starting from current and make rest of the list as next of first node
//        if (next != null){
//            head.next = reverse(next, k);
//        }
//
//        return prev;
//    }
//
//    public Node reverseList(Node head) {
//        Node prev = null;
//        Node current = head;
//        Node next = null;
//
//        // 1 → 2 → 3 → Ø, we would like to change it to Ø ← 1 ← 2 ← 3
//        while (current != null) {
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
//
//        head = prev;
//        return head;
//    }
    private Link first;

    public void LinkLists(){
        first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int id, double dd){
        Link tmp = new Link(id,dd); // make new link
        tmp.next = first;           // make the new Link's next == first
        first = tmp;                // first becomes the new Link.
    }

    public Link deleteFirst(int id, double dd){
        Link tmp = first;           // make the new Link equal to first
        first = first.next;         // get rid of first reference and set first to first.next
        return tmp;                 // return tmp
    }

    public void displayList(){
        while(first != null) {
            first.displayLink();
            first = first.next;
        }
    }

    public static void main(String[] args){
        LinkedLists llist = new LinkedLists();
        llist.insertFirst(1,1.1);
        llist.insertFirst(2,2.2);
        llist.insertFirst(3,3.1);
        llist.displayList();
    }
}

class