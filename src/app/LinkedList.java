package app;

/**
 *  
 * <p><strong><em>Application Name: </em></strong>Class_Project-Linked_List</p>
 * <p><strong><em>Class Name: </em></strong>LinkedList</p>
 * 
 * <p><strong><em>Application Notes: </em></strong>none</p>
 *  
 * <p><strong><em>Class Notes: </em></strong>noone</p>
 * 
 * <p><strong><em>Pre-Conditions: </em></strong>none</p>
 * 
 * <p><strong><em>Post-Conditions: </em></strong>none</p>
 * 
 * <p><strong><em>Author: </em></strong>Daniel C. Landon Jr.</p>
 * <p><strong><em>Instructor: </em></strong>Dr. Robert Walsh</p>
 * <p><strong><em>Course: </em></strong>SP20-SE-CSCI-C202-17057</p>
 * <p><strong><em>Start Date: </em></strong>04.20.2020</p>
 * <p><strong><em>Due Date: </em></strong>04.23.2020</p>
 * 
 */
public class LinkedList<T> {    

    // class properties
    private Node<T> _head;

    /**
     * 
     * <p><strong><em>Description: </em></strong>manipulates list for display</p>
     * 
     * <p><strong><em>Method Name: </em></strong>show</p>
     *  
     * <p><strong><em>Method Notes: </em></strong>none</p>
     * 
     * <p><strong><em>Pre-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Post-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Author: </em></strong>Daniel C. Landon Jr.</p>
     * <p><strong><em>Start Date: </em></strong>04.20.2020</p>
     *
     * @return manipulated string for display
     */
    public String show() {

        System.out.println("ENTER: show(), displays list.");

        //variables
        StringBuilder _results = new StringBuilder("");
        int _nodeSize = Node.counter;

        if(_nodeSize == 0) {

            // list is empty
            _results.append("Nothing to display, List is Empty!");

        } // end if
        else {
    
            // reset to head
            Node<T> _current = _head;

            _results.append("[");
            
            // loop the list
            for(int _lC = 0; _lC < _nodeSize; _lC++) {
    
                // add current element of list to string
                _results.append("\"" + _current.element);
    
                // advance the list
                _current = _current.next;
    
                // some fancy string manipulation
                if(_current != null) { _results.append("\", "); } // end if
                else { _results.append("\"]"); } // end else
    
            } // end _lC

        } // end else

        return _results.toString();

    } // end show

    /**
     * 
     * <p><strong><em>Description: </em></strong>adds element to list</p>
     * 
     * <p><strong><em>Method Name: </em></strong>add</p>
     *  
     * <p><strong><em>Method Notes: </em></strong>adds element to list, if list does not exist it creates one</p>
     * 
     * <p><strong><em>Pre-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Post-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Author: </em></strong>Daniel C. Landon Jr.</p>
     * <p><strong><em>Start Date: </em></strong>04.20.2020</p>
     *
     * @param element
     */
    public void add(T element) {

        System.out.println("ENTER: add(T element), Adding: " + element);

        if(isEmpty()) { 

            // the list is empty so create a new list
            _head = new Node<T>(element);

        } // end if
        else {

            // add element to the list
            
            Node<T> _current = _head;
            
            // loop through the list till we get to the end
            while(_current.next != null) { _current = _current.next; } // end while

            // the above loop got us to the end of the list so we add the new lement to the list
            _current.next = new Node<T>(element);

        } // end else

        // increment the node counter
        Node.counter++;

    } // end add

    /**
     * 
     * <p><strong><em>Description: </em></strong>delete element based on value, from any position in list</p>
     * 
     * <p><strong><em>Method Name: </em></strong>delete</p>
     *  
     * <p><strong><em>Method Notes: </em></strong>for this method I do it a bit differently from the code supplied. instead of deleting the element i simply reposition the next value so it points to the node after the one i want to delete. i let garbage collection clear up the node that has now been skipped and no longer available. if we delete the first node i simply reposition the head to the original heads next node.</p>
     * 
     * <p><strong><em>Pre-Conditions: </em></strong>Pre-Conditions</p>
     * 
     * <p><strong><em>Post-Conditions: </em></strong>Post-Conditions</p>
     * 
     * <p><strong><em>Author: </em></strong>Daniel C. Landon Jr.</p>
     * <p><strong><em>Start Date: </em></strong>Start Date</p>
     *
     * @param element
     */
    public void delete(T element) {

        System.out.println("ENTER: delete(T element), Deleting: " + element);

        // variables
        int _nodeSize = Node.counter;

        // is the list empty?
        if(_nodeSize == 0) {

            // list is empty
            System.out.println("Nothing to delete, List is Empty!");

        } // end if
        else {

            // list is not empty

            // are we trying to delete the head node?
            if(_head.element == element) {
                // list = {1, 2, 3, 4, 5}
                // we want to delete 1, the head
                // next value for 1 currently equals 2
                // we change the current head to where it equals its current next value which is 2
                // 1 is now gone and 2 is the new head
                
                _head = _head.next; 

            } // end if
            else {

                // we are deleteing something other than the head
            
                // variables
                Node<T> _current = _head;
                
                // loop the list
                while(_current.next != null) {
                    // list = {1, 2, 3, 4, 5}
                    // we want to delete 3
                    // next value for 2 currently equals 3
                    // we change the next value of 2 from 3 to 4
                    // 3 is now gone

                    // if the value of the next node is equal to what we want to delete
                    if(_current.next.element == element) {

                        // point the next counter for the current node to the next counter for the node we want to delete
                        _current.next = _current.next.next;
                        break; // get out of the list...we are done

                    } // end if

                    // advance the list
                    _current = _current.next;

                } // end while

            } // end else

            // decrement the node count to reflect a removal
            Node.counter--;

        } // end else

    } // end delete

    /**
     * 
     * <p><strong><em>Description: </em></strong>icheck to see if the list is empty</p>
     * 
     * <p><strong><em>Method Name: </em></strong>isEmpty</p>
     *  
     * <p><strong><em>Method Notes: </em></strong>did not include sysout echo in this method as we will be in and out like a revolving door...will flood the console</p>
     * 
     * <p><strong><em>Pre-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Post-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Author: </em></strong>Daniel C. Landon Jr.</p>
     * <p><strong><em>Start Date: </em></strong>04.20.2020</p>
     *
     * @return true if list is empty, false if it contains data
     */
    public boolean isEmpty() {

        if(getSize() == 0) { return true ;} // end if
        else { return false; } // end else

    } // end isEmpty

    /**
     * 
     * <p><strong><em>Description: </em></strong>returns current sizer of list</p>
     * 
     * <p><strong><em>Method Name: </em></strong>getSize</p>
     *  
     * <p><strong><em>Method Notes: </em></strong>did not include sysout echo in this method as we will be in and out like a revolving door...will flood the console</p>
     * 
     * <p><strong><em>Pre-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Post-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Author: </em></strong>Daniel C. Landon Jr.</p>
     * <p><strong><em>Start Date: </em></strong>04.20.2020</p>
     *
     * @return returns size of list
     */
    public int getSize() {

        return Node.counter;

    } // end getSize

    public void clear() {

        System.out.println("ENTER: clear(), clear entire list.");

        // clear the list
        _head = null;

        // rest the counter
        Node.counter = 0;

    
    } // end clear

    /**
     * 
     * <p><strong><em>Description: </em></strong>adds element to front of list</p>
     * 
     * <p><strong><em>Method Name: </em></strong>addFront</p>
     *  
     * <p><strong><em>Method Notes: </em></strong>none</p>
     * 
     * <p><strong><em>Pre-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Post-Conditions: </em></strong>none</p>
     * 
     * <p><strong><em>Author: </em></strong>Daniel C. Landon Jr.</p>
     * <p><strong><em>Start Date: </em></strong>04.20.2020</p>
     *
     * @param element item to add to front of list
     */
    public void addFront(T element) {

        System.out.println("ENTER: addFront(T element), add element to front of list: " + element);
        
        // create a new node to contain the new head
        Node<T> _newHead = new Node<T>(element);

        //set the next for the _newHead to the current head
        _newHead.next = _head;

        // set the head to the _newHead
        _head = _newHead;

    } // end addFront

} // end LinkedList