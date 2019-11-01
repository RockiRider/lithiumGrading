import java.util.HashMap;
/**
 * Write a description of class LithiumPricing here.
 *
 * @author Tsotne Gaadzabia
 * @version (a version number or a date)
 */
public class LithiumPricing
{
    // instance variables - replace the example below with your own
    private int tray [][] = new int [5][3];
    HashMap<Integer, Double> pricing = new HashMap<Integer, Double>();  // Pricing System
    HashMap<Integer, Double> setPrice = new HashMap<Integer, Double>(); //Generated Lithium assigned with Price
    /**
     * Constructor for objects of class LithiumPricing
     */
    public LithiumPricing(GenerateLithium generateLithium)
    {
        // initialise Pricing Hash Map
        for(int i=1;i<=50;i++){
            if(i<=9){
                pricing.put(i, 300.00);
            }else if(i<=19){
                pricing.put(i, 600.00);
            }else if(i<=29){
                pricing.put(i, 900.00);
            }else{
                pricing.put(i, 1250.00);
            }
        }
        tray = generateLithium.getTray();
    }

    /**
     * Test Method to print out Lithium Tray, to see if we can use it here
     */
    public void printOut(){
        for (int[] a : tray) {
            for (int i : a) {
                System.out.print(i + " || ");

            }
            System.out.println("\n");
        }

    }

    /**
     * Matches Lithium Grades with their price in a the setPrice HashMap, using the data from the Pricing hashMap
     */
    public void setPrice(){
        double temp;
        int counter=0;
        for (int row = 0; row < tray.length; row++) {
            for (int col = 0; col < tray[row].length; col++) {
                temp = pricing.get(tray[row][col]);         
                setPrice.put(tray[row][col], temp);
                counter++;
                System.out.println(counter);
            }
        }

    }

    public void printPrice(){
        // Print keys and values
        for (int i : setPrice.keySet()) {
            System.out.println(i + "  " + setPrice.get(i));
        }
    }

    public HashMap<Integer, Double> getSetPrice()
    {
        return setPrice;
    }

    public HashMap<Integer, Double> getPricing(){
        return pricing;
    }
}
