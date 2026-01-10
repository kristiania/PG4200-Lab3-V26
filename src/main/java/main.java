import assignment.LinkedList.DLLNode;
import assignment.LinkedList.DLinkedList;

void main() {

    DLLNode nNode = new DLLNode();
    nNode.setData(1);
    DLinkedList list = new DLinkedList();
    list.setHead(nNode);
    list.setTail(nNode);

    // add items to linked list
    for (int i = 2; i < 11; i++) {
        nNode = new DLLNode();
        nNode.setData(i);
        list.appendNode(nNode);
    }

    IO.println();

    // print the content of the list
    list.print();

    IO.println("items removed.");

    // remove items from linked list
    list.removeNode(list.getHead());
    list.removeNode(list.getHead());
    list.removeNode(list.getTail());

    // print the content of the list
    list.print();

}