
/** 
 * A class for representing an item with a weight and a description.
 * -------
 * 
 * @author Peter Grose
 * @version February 5, 2023
 */
public class Item {
    
    private String description;
    private double weight;
    
    /**
     * 
     * @param desc Description of the item e.g, "A tall ladder".
     * @param weight_lb Item's weight in kg.
     */
    public Item(String desc, double weight_kg){
        this.description = desc;
        this.weight = weight_kg;
    }

    /**
     * @return the description of the item.
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the weight in kg.
     */
    public double getWeight() {
        return weight;
    }
    
    boolean display_kg = true;
    
    /**
     * @return A summary of the item in the form of a sentence.
     */
    @Override
    public String toString(){
        return description + ", weighing about "+weight+"kg";
    }
}
