import assignment.LinkedList.DLLNode;
import assignment.LinkedList.DLinkedList;
import assignment.Stacks.ArrayStack;
import assignment.Stacks.CorrectlySetBrackets;
import assignment.Stacks.ReversedArray;
import assignment.Stacks.Stack;

void main() {

    IO.println();
    IO.println("------------------------------------------------------------------------");
    IO.println();
    IO.println("Task one: insert and remove on doubly linked lists");
    IO.println();
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

    IO.println();
    IO.println("------------------------------------------------------------------------");
    IO.println();
    IO.println("Task 2.1: implement push() and pop() on ArrayStack");
    IO.println();

    ArrayStack S = new ArrayStack(3);
    S.push(1);
    S.push(4);
    S.push(5);
    IO.println(S.top());
    S.pop();
    IO.println(S.top());
    S.pop();
    IO.println(S.top());

    IO.println();
    IO.println("------------------------------------------------------------------------");
    IO.println();
    IO.println("Task 2.2: implement method ReversedArray.returnInReverse(Integer[] a)");
    IO.println();

    Integer[] a=new Integer[5];
    for(int i=0; i<5; i++){
        a[i]=i*2;
    }
    IO.println(Arrays.toString(a));



    ReversedArray ra = new ReversedArray();
    Integer[] r = ra.returnInReverse(a);

    IO.println();
    IO.println("If you implemented Task 2.1 and 2.2 correctly, you get the about list in reverse:");
    IO.println();
    IO.println(Arrays.toString(r));


    IO.println();
    IO.println("------------------------------------------------------------------------");
    IO.println();
    IO.println("Extra task : check String with java code for correct setting of brackets");
    IO.println();

    CorrectlySetBrackets b = new CorrectlySetBrackets();
    String nm = "void main{if(true){IO.println(hurray)}(duh)}";
    IO.println(nm);
    boolean result = b.isCorrectExpression(nm);
    IO.println("RESULT: " + result);
    if (result) IO.println("This java code has correctly set brackets.");
    else IO.println("Try again. This java code DOES HAVE correctly set brackets.");
    IO.println();
    nm = "void main{if(x==0){brag(int ])}";
    IO.println(nm);
    result = b.isCorrectExpression(nm);
    IO.println("RESULT: " + result);
    if (result) IO.println("Try again. This java code DOES NOT HAVE correctly set brackets.");
    else IO.println("This java code has NOT correctly set brackets.");

}