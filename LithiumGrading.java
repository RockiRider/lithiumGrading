import java.util.ArrayList;
/**
 * Write a description of class LithiumGrading here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LithiumGrading
{
    // instance variables - replace the example below with your own
    private ArrayList<Integer> lowGrade = new ArrayList<Integer>(); 
    private ArrayList<Integer> highGrade = new ArrayList<Integer>(); 
    private int lithiumTray [][] = new int [5][3];
    /**
     * Constructor for objects of class LithiumGrading
     */
    public LithiumGrading(GenerateLithium generateLithium)
    {
        lithiumTray = generateLithium.getTray();
    }

    /**
     * Test Method to print out Lithium Tray, to see if we can use it here
     */
    public void printOut(){
        for (int[] a : lithiumTray) {
            for (int i : a) {
                System.out.print(i + " || ");

            }
            System.out.println("\n");
        }

    }

    /**
     * Sorts tray into High and Low Grade Linked Lists
     */
    public void generateGrades(){
        int highCounter = 0;
        int lowCounter = 0;
        for (int row = 0; row < lithiumTray.length; row++) {
            for (int col = 0; col < lithiumTray[row].length; col++) {
                if( lithiumTray[row][col] > 25){
                    highGrade.add(lithiumTray[row][col]);
                    highCounter++;
                }else{
                    lowGrade.add(lithiumTray[row][col]);
                    lowCounter++;
                }
            }
        }
    }

    /**
     * Sorts the Both LinkedLists in Ascending Order
     */
    public void sortLithium(){

        int j;
        boolean low = true;   // low set to true to begin first pass
        boolean high = true; //high set to true to begin first pass
        int temp;   //holding variable

        //What happens if size = Null/ 0??
        int lowLength = lowGrade.size();
        int highLength = highGrade.size();

        //Low Graded
        while (low)
        {
            low= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < lowLength -1;  j++ )
            {
                if ( lowGrade.get(j) < lowGrade.get(j+1))   // change to > for ascending sort
                {
                    temp = lowGrade.get(j);                //swap elements
                    lowGrade.set(j,lowGrade.get(j+1));
                    lowGrade.set(j+1,temp);
                    low = true;              //shows a swap occurred 
                }
            }
        }

        //High Graded
        while (high)
        {
            high= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < highLength -1;  j++ )
            {
                if ( highGrade.get(j) < highGrade.get(j+1))   // change to > for ascending sort
                {
                    temp = highGrade.get(j);                //swap elements
                    highGrade.set(j,highGrade.get(j+1));
                    highGrade.set(j+1,temp);
                    high = true;              //shows a swap occurred 
                }
            }
        }

        //Printing

    }
}
