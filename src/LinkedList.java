
/*
 * Student information for assignment:
 * On my honor, <NAME>, this programming assignment is my own work
 * and I have not provided this code to any other student.
 * UTEID:
 * email address:
 * TA name:
 * Number of slip days I am using:
 */

import java.util.Iterator;

public class LinkedList<E> implements IList<E> {
    // CS314 students. Add you instance variables here.
    // You decide what instance variables to use.
    // Must adhere to assignment requirements.
    // No ArrayLists or Java LinkedLists.

    // CS314 students, add constructors here:

    // CS314 students, add methods here:

    /**
     * add item to the front of the list. <br>
     * pre: item != null <br>
     * post: size() = old size() + 1, get(0) = item
     *
     * @param item the data to add to the front of this list
     */
    public void addFirst(E item) {
    }

    /**
     * add item to the end of the list. <br>
     * pre: item != null <br>
     * post: size() = old size() + 1, get(size() -1) = item
     *
     * @param item the data to add to the end of this list
     */
    public void addLast(E item) {
    }

    /**
     * remove and return the first element of this list. <br>
     * pre: size() > 0 <br>
     * post: size() = old size() - 1
     *
     * @return the old first element of this list
     */
    public E removeFirst() {
        return null;
    }

    /**
     * remove and return the last element of this list. <br>
     * pre: size() > 0 <br>
     * post: size() = old size() - 1
     *
     * @return the old last element of this list
     */
    public E removeLast() {
        return null;
    }

    /**
     * A class that represents a node to be used in a linked list.
     * These nodes are doubly linked. All methods are O(1).
     *
     * @author Mike Scott
     * @version July 25, 2005
     */

    private static class DoubleListNode<E> {

        // instance variables

        // The data stored in this node.
        private E myData;

        // The link to the next node (presumably in a list).
        private DoubleListNode<E> myNext;

        // The link to the previous node (presumably in a list).
        private DoubleListNode<E> myPrev;

        /**
         * default constructor.
         * <br>pre: none
         * <br>post: getData() = null, getNext() = null, getPrev() = null
         */
        public DoubleListNode() {
            this(null, null, null);
        }

        /**
         * create a DoubleListNode that holds the specified data
         * and refers to the specified next and previous elements.
         * <br>pre: none
         * <br>post: getData() = data, getNext() = next, getPrev() = prev
         * @param prev the previous node
         * @param data the  data this DoubleListNode should hold
         * @param next the next node
         */
        public DoubleListNode(DoubleListNode<E> prev, E data,
                DoubleListNode<E> next) {

            myData = data;
            myNext = next;
            myPrev = prev;
        }

        /**
         * return the data in this node.
         * <br>pre: none
         * @return the data this DoubleListNode holds
         */
        public E getData() {
            return myData;
        }

        /**
         * return the DoubleListNode this ListNode refers to.
         * <br>pre: none
         * @return the DoubleListNode this DoubleListNode refers to
         * (normally the next one in a list)
         */
        public DoubleListNode<E> getNext() {
            return myNext;
        }

        /**
         * return the DoubleListNode this DoubleListNode refers to.
         * <br>pre: none
         * @return the DoubleListNode this DoubleListNode refers to
         * (normally the previous one in a list)
         */
        public DoubleListNode<E> getPrev() {
            return myPrev;
        }

        /**
         * set the data in this node.
         * The old data is over written.
         * <br>pre: none
         * <br>post: getData() == data
         * @param data the new data for this DoubleListNode to hold
         */
        public void setData(E data) {
            myData = data;
        }

        /**
         * set the next node this DoubleListNode refers to.
         * <br>pre: none
         * <br>post: getNext() = next
         * @param next the next node this DoubleListNode should refer to
         */
        public void setNext(DoubleListNode<E> next) {
            myNext = next;
        }

        /**
         * set the previous node this DoubleListNode refers to.
         * <br>pre: none
         * <br>post: getPrev() = next
         * @param prev the previous node this DoubleListNode should refer to
         */
        public void setPrev(DoubleListNode<E> prev) {
            myPrev = prev;
        }
    }
}
