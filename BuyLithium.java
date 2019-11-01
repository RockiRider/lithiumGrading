import java.util.HashMap;
/**
 * Search and buy your lithium here!
 *
 * @author Tsotne Gvadzabia
 * @version (a version number or a date)
 */
public class BuyLithium
{
    // instance variables - replace the example below with your own
    HashMap<Integer, Double> setPrice = new HashMap<Integer, Double>();
    /**
     * Constructor for objects of class BuyLithium
     */
    public BuyLithium(LithiumPricing lithiumPricing)
    {
        // initialise instance variables
        setPrice = lithiumPricing.getSetPrice();
    }

    /**
     * Search for Lithium via input price and output results
     * 
     */
    public void findBestPrice(double input){
        int choices = 0;
        for (int i : setPrice.keySet()) {
            if(input >= setPrice.get(i)){
                System.out.println(i + "  " + setPrice.get(i));
                choices++;
            }
        }

        if(choices>0){
            System.out.println("There are "+ choices+" choices available to you");
        }else{
            System.out.println("There are no choices available to you for this price, please up the budget.");
        }
    }
    /**
     * Search for Lithium Grade of input or below and output results
     */
    public void findHighQuality(int input){
        int choices = 0;
        for (int i : setPrice.keySet()) {
            if(input >= i){
                System.out.println(i + "  " + setPrice.get(i));
                choices++;
            }
        }

        if(choices>0){
            System.out.println("There are "+ choices+" choices available to you");
        }else{
            System.out.println("There are no choices available to you for this price, please up the budget.");
        }
    }
}
