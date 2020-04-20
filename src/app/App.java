package app;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

/**
 * 
 * <p>
 * <strong><em>Application Name: </em></strong>Class_Projects-Linked_List
 * </p>
 * <p>
 * <strong><em>Class Name: </em></strong>App
 * </p>
 * 
 * <p>
 * <strong><em>Application Notes: </em></strong>none
 * </p>
 * 
 * <p>
 * <strong><em>Class Notes: </em></strong>none
 * </p>
 * 
 * <p>
 * <strong><em>Pre-Conditions: </em></strong>none
 * </p>
 * 
 * <p>
 * <strong><em>Post-Conditions: </em></strong>none
 * </p>
 * 
 * <p>
 * <strong><em>Author: </em></strong>Daniel C. Landon Jr.
 * </p>
 * <p>
 * <strong><em>Instructor: </em></strong>Dr. Robert Walsh
 * </p>
 * <p>
 * <strong><em>Course: </em></strong>SP20-SE-CSCI-C202-17057
 * </p>
 * <p>
 * <strong><em>Start Date: </em></strong>04.20.2020
 * </p>
 * <p>
 * <strong><em>Due Date: </em></strong>04.23.2020
 * </p>
 * 
 */
public class App {
    
    /**
     * 
     * <p><strong><em>Description: </em></strong>entry point for application</p>
     * 
     * <p><strong><em>Method Name: </em></strong>main</p>
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
     * @param args not used
     * @throws Exception catch error so program ends gracefully
     */
    public static void main(String[] args) throws Exception {

        // variables
        Instant _tStart = null;
        Instant _tEnd = null;
        Duration _tElapsed = null;

        try {

            _tStart = Instant.now();

            // variables
            LinkedList<String> _list = new LinkedList<String>();

            System.out.println();
            lineSeperator(80, '*');
            System.out.println();
            System.out.println("\tSTART TIME: " + _tStart);
            System.out.println();

            // current status of list
            lineSeperator(80, '*');
            System.out.println();
            System.out.println(">>>>>>>>>> STATE OF LIST <<<<<<<<<<");
            System.out.println();
            System.out.println("Is the list Empty: " + _list.isEmpty());
            System.out.println("Number of elements in list: " + _list.getSize());
            System.out.println();
            System.out.println("\n" + _list.show());
            System.out.println();

            // delete from list
            lineSeperator(80, '*');
            System.out.println();
            System.out.println(">>>>>>>>>> DELETE FROM AN EMPTY LIST <<<<<<<<<<");
            System.out.println();
            _list.delete("Bob");
            System.out.println();
            System.out.println("Is the list Empty: " + _list.isEmpty());
            System.out.println("Number of elements in list: " + _list.getSize());
            System.out.println();
            

            // add the captains of the U.S.S. Enterprise, based on cannon, in order
            lineSeperator(80, '*');
            System.out.println();
            System.out.println(">>>>>>>>>> ADD DATA TO LIST <<<<<<<<<<");
            System.out.println();
            _list.add("NX-01: Archer");
            _list.add("NCC-1701: April");
            _list.add("NCC-1701: Pike");
            _list.add("NCC-1701: Kirk");
            _list.add("NCC-1701: Decker");
            _list.add("NCC-1701: Spock");
            _list.add("NCC-1701-A: Kirk");
            _list.add("NCC-1701-B: Harriman");
            _list.add("NCC-1701-C: Garrett");
            _list.add("NCC-1701-D: Picard");
            _list.add("NCC-1701-D: Riker");
            _list.add("NCC-1701-D: Jellico");
            _list.add("NCC-1701-E: Picard");
            System.out.println();

            // current status of list
            lineSeperator(80, '*');
            System.out.println();
            System.out.println(">>>>>>>>>> STATE OF LIST <<<<<<<<<<");
            System.out.println();
            System.out.println("Is the list Empty: " + _list.isEmpty());
            System.out.println("Number of elements in list: " + _list.getSize());
            System.out.println();
            System.out.println("\n" + _list.show());
            System.out.println();

            // delete from random point in list
            lineSeperator(80, '*');
            System.out.println();
            System.out.println(">>>>>>>>>> DELETE FROM RANDOM POINT IN LIST <<<<<<<<<<");
            System.out.println();
            System.out.println("Is the list Empty: " + _list.isEmpty());
            System.out.println("Number of elements in list: " + _list.getSize());
            System.out.println();
            System.out.println("\n" + _list.show());
            System.out.println();
            _list.delete("NCC-1701-C: Garrett");
            System.out.println();
            System.out.println("Is the list Empty: " + _list.isEmpty());
            System.out.println("Number of elements in list: " + _list.getSize());
            System.out.println();
            System.out.println("\n" + _list.show());
            System.out.println();

            // delete the head
            lineSeperator(80, '*');
            System.out.println();
            System.out.println(">>>>>>>>>> DELETE THE HEAD <<<<<<<<<<");
            System.out.println();
            System.out.println("Is the list Empty: " + _list.isEmpty());
            System.out.println("Number of elements in list: " + _list.getSize());
            System.out.println();
            System.out.println("\n" + _list.show());
            System.out.println();
            _list.delete("NX-01: Archer");
            System.out.println();
            System.out.println("Is the list Empty: " + _list.isEmpty());
            System.out.println("Number of elements in list: " + _list.getSize());
            System.out.println();
            System.out.println("\n" + _list.show());
            System.out.println();

            // add new element to head of list and shift everything down
            lineSeperator(80, '*');
            System.out.println();
            System.out.println(">>>>>>>>>> ADD NEW HEAD ELEMENT <<<<<<<<<<");
            System.out.println();
            System.out.println("Is the list Empty: " + _list.isEmpty());
            System.out.println("Number of elements in list: " + _list.getSize());
            System.out.println();
            System.out.println("\n" + _list.show());
            System.out.println();
            _list.addFront("Bob's Your Uncle");
            System.out.println();
            System.out.println("Is the list Empty: " + _list.isEmpty());
            System.out.println("Number of elements in list: " + _list.getSize());
            System.out.println();
            System.out.println("\n" + _list.show());
            System.out.println();

            // does list contain element
            lineSeperator(80, '*');
            System.out.println();
            System.out.println(">>>>>>>>>> DOES LIST CONTAIN <<<<<<<<<<");
            System.out.println();
            System.out.println("Is the list Empty: " + _list.isEmpty());
            System.out.println("Number of elements in list: " + _list.getSize());
            System.out.println();
            System.out.println("\n" + _list.show());
            System.out.println();
            String _searchValue = "NCC-1701: Pike";
            List<Object> _retVal = _list.contains(_searchValue);
            if((boolean) _retVal.get(0)) {
                // found
                System.out.println("List contains, " + _searchValue + ", at index:  " + _retVal.get(1) + ".");
            } // end if
            else {
                // not found
                System.out.println("List does not contain: " + _searchValue + ".");
            } // end if
            // System.out.println("Does list contain, " + _searchValue + ": " + _list.contains(_searchValue));
            System.out.println();
            
            // clear the list
            lineSeperator(80, '*');
            System.out.println();
            System.out.println(">>>>>>>>>> CLEAR THE LIST <<<<<<<<<<");
            System.out.println();
            System.out.println("Is the list Empty: " + _list.isEmpty());
            System.out.println("Number of elements in list: " + _list.getSize());
            System.out.println();
            System.out.println("\n" + _list.show());
            System.out.println();
            _list.clear();
            System.out.println();
            System.out.println("Is the list Empty: " + _list.isEmpty());
            System.out.println("Number of elements in list: " + _list.getSize());
            System.out.println();
            System.out.println("\n" + _list.show());
            System.out.println();

        } // end try
        catch (Exception e) {

            // error handeling so the program will terminate gracefully regardless

            System.out.println("***** ERROR *****\n");
            System.out.println(e.getMessage());

        } // end catch
        finally {
            
            lineSeperator(80, '*');
            _tEnd = Instant.now();
            _tElapsed = Duration.between(_tStart, _tEnd);
            System.out.println();
            System.out.println("\tEND TIME: " + _tEnd);
            System.out.println("\tTime for completion (milliseconds): " + _tElapsed.toMillis());
            System.out.println();

            System.out.println(">>>>>>>>>> PROGRAM TERMINATED <<<<<<<<<<\n");
            System.out.println("END OF LINE");

        } // end finally
    
    } // end main
    
    /**
    * <p><strong><em>Description: </em></strong>Displays Character N times</p>
    *
    * <p><strong><em>Method Name: </em></strong>Show</p>
    *
    * <p><strong><em>Method Notes: </em></strong>recursive display of character</p>
    *
    * <p><strong><em>Pre-Conditions: </em></strong>none</p>
    *
    * <p><strong><em>Post-Conditions: </em></strong>none</p>
    *
    * <p><strong><em>Author: </em></strong>Daniel C. Landon Jr.</p>
    * <p><strong><em>Start Date: </em></strong>03.02.2020</p>
    *
    * @param N number of times to display character
    * @param ch character to show
    */
    public static void lineSeperator(int N, char ch) {
        
        if(N > 1) {
            System.out.print(ch);
            lineSeperator(N - 1, ch);
        } // end if
        else { System.out.println(""); } // end else

    } // end lineSeperator

} // end App