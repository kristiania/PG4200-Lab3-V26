# Lab practice 3

--------

## Task 1:  Doubly Linked Lists

In the folder (`src/main/java/assignment/DLLinkedList`), you find the classes 
- _DLinkedList_ a simple and incomplete implementation of the data structure doubly linked list.
- _DLLNode_ is a class for handling the nodes in _DLinkedList_

### 1) Insert a new element in Doubly Linked lists

In DLinkedList.java implement the following method:

- _insertNode(ListNode nNode, ListNode pAfter)_ 
  inserts the node _nNode_ after node _pAfter_ in the current list.
- Hint: handle the case with care where _pAfter_ is the tail of the list (the last element), and _nNode_ becomes the new _tail_ 

- Extra: handle the case where you insert an element at the beginning of the list.

### 2) Remove an element from the  Doubly Linked lists

In DLinkedList.java implement the following method:

- _removeNode(ListNode nNode)_
  removes node _nNode_ from current list.
- Hint: handle the cases with care where _nNode_ is either the tail of the head of the list.

### Hints and stuff

- Hint: you may already find code for invoking the methods in the compact class _main.java_.  More information on compact class in java25 here: https://openjdk.org/jeps/512

- NOT YET IMPLEMENTED: To test your code, you will find the test setup in the file `src/test/java/assignment/TestAssignment.java`. There you can choose to run all tests at once or run them one by one. This requires that maven JUNIT 6 is installed: https://www.jetbrains.com/help/idea/junit.html

- Solution: You can find a solution proposal i the `src/main/java/solution` folder.
