import java.util.Random;
/**
 * Write a description of class GenerateLithium here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GenerateLithium
{//you may alter this code accordingly as there may be some anomalies 
    int tray [][] = new int [5][3];
    private int grading = 0;
    private Random randomGenerator;
    /**
     * Constructor for objects of class GenerateLithium
     */
    public GenerateLithium()
    {
        randomGenerator = new Random();
    }

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

    public void printTray(){
        for (int[] a : tray) {
            for (int i : a) {
                System.out.print(i + " || ");

            }
            System.out.println("\n");
        }
    }

    public int getGrading(){
        return grading;
    }

    public void setGrading(int input){
        grading = input;

    }
    public int [][] getTray(){
        return tray;
    }
}
