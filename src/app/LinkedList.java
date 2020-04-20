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

        if(_head == null) { 

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

    } // end add

} // end LinkedList