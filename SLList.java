public class SLList {
    
    /** Nested class */
    private static class IntNode {
        public int item;
        public IntNode next;
    
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }    

    /** The first item (if it exists) is at sentinel.next. */
    private IntNode sentinel;
    private int size;

    /** Creates an empty SLList.
     * Value given for sentinel node does not matter, as it will
     * never be used.
     */
    public SLList() {
        size = 0;
        sentinel = new IntNode(63, null);

    }

    public SLList(int x) {
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        this.size = 1;
    }

    /** New addFirst w/ sentinel implementation */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
    }

    /** Returns first item in the list */
    public int getFirst() {
        return sentinel.next.item;
    }
    
    /** Adds x to the front of the list */
    // public void addFirst(int x) {
    //     first = new IntNode(x, first);
    //     this.size += 1;
    // }
  
    /** my prelecture implementation of addLast
     * to add value to the ind of a linked list
     */
    // public void addLast(int x) {
        
        
    //     while(first.next != null) {
    //         first = first.next;
            
    //     } if (first.next == null) {
    //         first.next = new IntNode(x, null);
    //     }
                  
    // }

    /** correct addLast implimentation */
    public void addLast(int x) {
        size += 1;
        IntNode f = sentinel;

        /** Sentinel is never null so condition below
         * is never needed.
         */

        // if (f == null) {            
        //     f = new IntNode(x, null);
        //     /** learned how to use return statement
        //      * in this way from lecture, prevents 
        //      * rest of code from executing.
        //      */
        //     return;           
        // }

        while(f.next != null) {
            f = f.next;
        }

        f.next = new IntNode(x, null);
    }

    /** test method for add last, return the value
     * at the end of linked list.
     */
    public int getLast() {
        while(first.next != null) {
            first = first.next;
            
        }       
        
        return first.item;
        
    }

    /** prelecture implemantation of size method
     * to retrun the size of linked list
     */
    // public int size(){
    //     int count = 0;
    //     while(first.next != null) {
    //         first = first.next;
    //         count++;            
    //     }       
    //     return count;
    // }

    /** Correct but inneficient implimentation of size method
     * Returns the size of the list that starts at IntNode p
     */    
    // private static int size1(IntNode p) {
    //     if(p.next == null) {
    //         return 1;
    //     }
    //     return 1 + size1(p.next);
    // }

    // public int size1() {
    //     return size1(first);
    // }


    public int size2() {
        return size;
    }   

    public static void main(String[] args) {
        SLList L = new SLList();

        // L.addFirst(15);
        // L.addFirst(5);
        // L.addFirst(55);
        // L.addFirst(56);
        // L.addFirst(365);
        // L.addFirst(456);
           L.addFirst(495);
        L.addLast(200);


        
      //  System.out.println(L.size());
        System.out.println(L.size2());
    //    System.out.println(L.first.item);
        
        System.out.println(L.getLast());
       // System.out.println(L.getFirst());
    }
}
