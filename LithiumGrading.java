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
    private ArrayList<Integer> lowGrade;
    private ArrayList<Integer> highGrade;
    GenerateLithium generateLithium;
    /**
     * Constructor for objects of class LithiumGrading
     */
    public LithiumGrading()
    {
        //ArrayList<Integer> lowGrade = new ArrayList<Integer>(); 
        //ArrayList<Integer> highGrade = new ArrayList<Integer>();
        generateLithium = new GenerateLithium();        //Is this needed?
    }

    /**
     * Sorts tray into High and Low Grade Linked Lists
     */
    public void generateGrades(GenerateLithium generateLithium.tray){
        int counter = 0;
        int [] [] tray = generateLithium.getTray();
        for (int[] a : tray) {
            for (int i : a) {
                if( i > 25){
                    highGrade.set(counter,i);
                    counter++;
                }else{
                    lowGrade.set(counter, i);
                    counter++;
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
