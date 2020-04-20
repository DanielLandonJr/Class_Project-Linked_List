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
        StringBuilder _results = new StringBuilder("[");

        // reset to head
        Node<T> _current = _head;
        
        // loop the list
        for(int _lC = 0; _lC < Node.counter; _lC++) {

            // add current element of list to string
            _results.append("\"" + _current.element);

            // advance the list
            _current = _current.next;

            // some fancy string manipulation
            if(_current != null) { _results.append("\", "); } // end if
            else { _results.append("\"] - Total List Size: " + Node.counter); } // end else

        } // end _lC

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
     * <p><strong><em>Description: </em></strong>Description</p>
     * 
     * <p><strong><em>Method Name: </em></strong>Method Name</p>
     *  
     * <p><strong><em>Method Notes: </em></strong>Method Notes</p>
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


    } // end delete

    /**
     * 
     * <p><strong><em>Description: </em></strong>icheck to see if the list is empty</p>
     * 
     * <p><strong><em>Method Name: </em></strong>isEmpty</p>
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
     * @return true if list is empty, false if it contains data
     */
    public boolean isEmpty() {

        if(Node.counter == 0) { return true ;} // end if
        else { return false; } // end else

    } // end isEmpty

    /**
     * 
     * <p><strong><em>Description: </em></strong>returns current sizer of list</p>
     * 
     * <p><strong><em>Method Name: </em></strong>getSize</p>
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
     * @return returns size of list
     */
    public int getSize() {

        return Node.counter;

    } // end getSize

} // end LinkedList