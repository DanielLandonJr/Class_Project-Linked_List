package app;

/**
 *  
 * <p><strong><em>Application Name: </em></strong>Class_Projects-Linked_List</p>
 * <p><strong><em>Class Name: </em></strong>App</p>
 * 
 * <p><strong><em>Application Notes: </em></strong>none</p>
 *  
 * <p><strong><em>Class Notes: </em></strong>none</p>
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

        try {

            LinkedList<String> _list = new LinkedList<String>();

            System.out.println();

            // add the captains of the U.S.S. Enterprise, based on cannon, in order
            lineSeperator(80, '*');
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
            
            // show list
            lineSeperator(80, '*');
            System.out.println(_list.show());

        } // end try
        catch (Exception e) {

            // error handeling so the program will terminate gracefully regardless

            System.out.println("***** ERROR *****\n");
            System.out.println(e.getMessage());

        } // end catch
        finally {

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            lineSeperator(80, '*');

            System.out.println(">>>>>>>>>> PROGRAM TERMINATED <<<<<<<<<<\n");
            System.out.println("END OF LINE");

            lineSeperator(80, '*');

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