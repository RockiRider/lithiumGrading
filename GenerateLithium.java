import java.util.Random;
/**
 * Write a description of class GenerateLithium here.
 *
 * @author Tsotne Gvadzabia
 * @version (a version number or a date)
 */
public class GenerateLithium
{//you may alter this code accordingly as there may be some anomalies 
    public int tray [][] = new int [5][3];
    private int grading = 0;
    private Random randomGenerator;
    /**
     * Constructor for objects of class GenerateLithium
     */
    public GenerateLithium()
    {
        randomGenerator = new Random();
    }
    
    /**
     * Method that fills in tray array with generated lithium grades
     */
    public void generateSample()
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                setGrading(randomGenerator.nextInt(50));
                //Student to continue coding from here
                tray[i][j] = getGrading();
            }
        }
    }
    
    /**
     * Method that Prints out Tray Array
     */
    public void printTray(){
        for (int[] a : tray) {
            for (int i : a) {
                System.out.print(i + " || ");

            }
            System.out.println("\n");
        }
    }

    public int getGrading(){
        if(grading == 0){
            grading++;
        }
        return grading;
    }

    public void setGrading(int input){
        grading = input;

    }
    public int [][] getTray(){
        return tray;
    }
}
