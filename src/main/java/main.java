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
        list.AppendNode(nNode);
    }

    IO.println();

    // print the content of the list
    list.print();

    IO.println("items removed.");

    // remove items from linked list
    list.RemoveNode(list.getHead());
    list.RemoveNode(list.getHead());
    list.RemoveNode(list.getTail());

    // print the content of the list
    list.print();

}