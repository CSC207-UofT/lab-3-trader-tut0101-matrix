public class Dog implements Tradable, Domesticatable{
    /**
     *  Dog class. Implements Tradable and Domesticatable interfaces.
     */
    private int WeightToPrice;

    public Dog(){this.WeightToPrice=100;}

    /**
     * Function getPrice. Returns price of dog proportional to its weight.
     * @param weight: weight of the dog
     */
    @Override
    public int getPrice(int weight){return weight * this.WeightToPrice;}

    /**
     * Function sound. Returns string representation of dog sound.
     */
    @Override
    public String sound(){return "Arf!";}
}
